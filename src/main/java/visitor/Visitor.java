package visitor;

import generated.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Visitor extends SpajingBaseVisitor<Object> {
    private Map<String, Object> memoriaGlobal = new HashMap<>();
    private Map<String, String> tiposGlobales = new HashMap<>();
    private Map<String, Object> memoriaLocal = new HashMap<>();
    private Map<String, String> tiposLocales = new HashMap<>();
    private Map<String, SpajingParser.FuncionContext> funciones = new HashMap<>();
    private boolean enFuncion = false;
    
    // Clase para manejar retornos
    private static class RetornoException extends RuntimeException {
        public final Object valor;
        public RetornoException(Object valor) {
            this.valor = valor;
        }
    }

    @Override
    public Object visitPrograma(SpajingParser.ProgramaContext ctx) {
        String nombreClase = ctx.ID().getText();
        System.out.println("Ejecutando clase: " + nombreClase);
        
        // Registrar todas las funciones
        for (SpajingParser.FuncionContext funcion : ctx.funcion()) {
            String nombreFuncion = funcion.ID().getText();
            funciones.put(nombreFuncion, funcion);
        }
        
        // Verificar que existe la función principal
        if (!funciones.containsKey("principal")) {
            throw new RuntimeException("Error: Debe existir una función llamada 'principal'");
        }
        
        // Ejecutar la función principal
        return ejecutarFuncion("principal", new ArrayList<>());
    }

    private Object ejecutarFuncion(String nombre, List<Object> argumentos) {
        SpajingParser.FuncionContext funcion = funciones.get(nombre);
        if (funcion == null) {
            throw new RuntimeException("Función no definida: " + nombre);
        }
        
        // Guardar estado anterior
        Map<String, Object> memoriaAnterior = new HashMap<>(memoriaLocal);
        Map<String, String> tiposAnteriores = new HashMap<>(tiposLocales);
        boolean enFuncionAnterior = enFuncion;
        
        // Limpiar memoria local para la nueva función
        memoriaLocal.clear();
        tiposLocales.clear();
        enFuncion = true;
        
        // Procesar parámetros
        if (funcion.parametros() != null) {
            List<SpajingParser.ParametroContext> params = funcion.parametros().parametro();
            if (params.size() != argumentos.size()) {
                throw new RuntimeException("La función '" + nombre + "' espera " + params.size() + 
                    " argumentos, pero se recibieron " + argumentos.size());
            }
            for (int i = 0; i < params.size(); i++) {
                String nombreParam = params.get(i).ID().getText();
                String tipoParam = params.get(i).tipo().getText();
                Object valorArg = argumentos.get(i);
                validarTipo(tipoParam, valorArg, nombreParam);
                memoriaLocal.put(nombreParam, valorArg);
                tiposLocales.put(nombreParam, tipoParam);
            }
        }
        
        Object resultado = null;
        try {
            visit(funcion.bloque());
        } catch (RetornoException e) {
            resultado = e.valor;
        }
        
        // Restaurar estado anterior
        memoriaLocal = memoriaAnterior;
        tiposLocales = tiposAnteriores;
        enFuncion = enFuncionAnterior;
        
        return resultado;
    }

    @Override
    public Object visitFuncion(SpajingParser.FuncionContext ctx) {
        // Las funciones se ejecutan cuando son llamadas, no cuando se visitan
        return null;
    }

    @Override
    public Object visitLlamadaFuncion(SpajingParser.LlamadaFuncionContext ctx) {
        String nombre = ctx.ID().getText();
        List<Object> args = new ArrayList<>();
        
        if (ctx.argumentos() != null) {
            for (SpajingParser.ExpresionContext expr : ctx.argumentos().expresion()) {
                args.add(visit(expr));
            }
        }
        
        return ejecutarFuncion(nombre, args);
    }

    @Override
    public Object visitLlamadaExpr(SpajingParser.LlamadaExprContext ctx) {
        String nombre = ctx.ID().getText();
        List<Object> args = new ArrayList<>();
        
        if (ctx.argumentos() != null) {
            for (SpajingParser.ExpresionContext expr : ctx.argumentos().expresion()) {
                args.add(visit(expr));
            }
        }
        
        return ejecutarFuncion(nombre, args);
    }

    @Override
    public Object visitRetorno(SpajingParser.RetornoContext ctx) {
        Object valor = visit(ctx.expresion());
        throw new RetornoException(valor);
    }

    @Override
    public Object visitBloque(SpajingParser.BloqueContext ctx) {
        Object resultado = null;
        for (SpajingParser.SentenciaContext sentencia : ctx.sentencia()) {
            resultado = visit(sentencia);
        }
        return resultado;
    }

    @Override
    public Object visitDeclaracion(SpajingParser.DeclaracionContext ctx) {
        String nombre = ctx.ID().getText();
        String tipo = ctx.tipo().getText();
        Object valor = visit(ctx.expresion());
        
        // Validación de tipo
        validarTipo(tipo, valor, nombre);
        
        if (enFuncion) {
            memoriaLocal.put(nombre, valor);
            tiposLocales.put(nombre, tipo);
        } else {
            memoriaGlobal.put(nombre, valor);
            tiposGlobales.put(nombre, tipo);
        }
        return null;
    }

    @Override
    public Object visitAsignacion(SpajingParser.AsignacionContext ctx) {
        String nombre = ctx.ID().getText();
        Object valor = visit(ctx.expresion());
        
        // Buscar primero en local, luego en global
        if (memoriaLocal.containsKey(nombre)) {
            String tipo = tiposLocales.get(nombre);
            validarTipo(tipo, valor, nombre);
            memoriaLocal.put(nombre, valor);
        } else if (memoriaGlobal.containsKey(nombre)) {
            String tipo = tiposGlobales.get(nombre);
            validarTipo(tipo, valor, nombre);
            memoriaGlobal.put(nombre, valor);
        } else {
            throw new RuntimeException("Variable no declarada: " + nombre);
        }
        
        return null;
    }

    @Override
    public Object visitCondicional(SpajingParser.CondicionalContext ctx) {
        Object condicion = visit(ctx.expresion());
        
        if (!(condicion instanceof Boolean)) {
            throw new RuntimeException("La condición debe ser de tipo lógico");
        }
        
        if ((Boolean) condicion) {
            return visit(ctx.bloque(0));
        } else if (ctx.SINO() != null) {
            return visit(ctx.bloque(1));
        }
        return null;
    }

    @Override
    public Object visitBucle(SpajingParser.BucleContext ctx) {
        Object resultado = null;
        while (true) {
            Object condicion = visit(ctx.expresion());
            if (!(condicion instanceof Boolean)) {
                throw new RuntimeException("La condición del bucle debe ser de tipo lógico");
            }
            if (!(Boolean) condicion) {
                break;
            }
            resultado = visit(ctx.bloque());
        }
        return resultado;
    }

    @Override
    public Object visitMostrar(SpajingParser.MostrarContext ctx) {
        Object valor = visit(ctx.expresion());
        System.out.println(valor);
        return null;
    }

    @Override
    public Object visitMultiplicacion(SpajingParser.MultiplicacionContext ctx) {
        Object izq = visit(ctx.expresion(0));
        Object der = visit(ctx.expresion(1));
        String op = ctx.op.getText();
        
        if (izq instanceof Integer && der instanceof Integer) {
            switch (op) {
                case "*": return (Integer) izq * (Integer) der;
                case "/": return (Integer) izq / (Integer) der;
                case "%": return (Integer) izq % (Integer) der;
            }
        } else if ((izq instanceof Double || izq instanceof Integer) && 
                   (der instanceof Double || der instanceof Integer)) {
            double a = izq instanceof Integer ? (Integer) izq : (Double) izq;
            double b = der instanceof Integer ? (Integer) der : (Double) der;
            switch (op) {
                case "*": return a * b;
                case "/": return a / b;
                case "%": return a % b;
            }
        }
        throw new RuntimeException("Operación no válida");
    }

    @Override
    public Object visitAdicion(SpajingParser.AdicionContext ctx) {
        Object izq = visit(ctx.expresion(0));
        Object der = visit(ctx.expresion(1));
        String op = ctx.op.getText();
        
        if (izq instanceof Integer && der instanceof Integer) {
            return op.equals("+") ? (Integer) izq + (Integer) der : (Integer) izq - (Integer) der;
        } else if ((izq instanceof Double || izq instanceof Integer) && 
                   (der instanceof Double || der instanceof Integer)) {
            double a = izq instanceof Integer ? (Integer) izq : (Double) izq;
            double b = der instanceof Integer ? (Integer) der : (Double) der;
            return op.equals("+") ? a + b : a - b;
        } else if (izq instanceof String && op.equals("+")) {
            return izq.toString() + der.toString();
        }
        throw new RuntimeException("Operación no válida");
    }

    @Override
    public Object visitComparacion(SpajingParser.ComparacionContext ctx) {
        Object izq = visit(ctx.expresion(0));
        Object der = visit(ctx.expresion(1));
        String op = ctx.op.getText();
        
        if (izq instanceof Number && der instanceof Number) {
            double a = ((Number) izq).doubleValue();
            double b = ((Number) der).doubleValue();
            switch (op) {
                case ">": return a > b;
                case "<": return a < b;
                case ">=": return a >= b;
                case "<=": return a <= b;
                case "==": return a == b;
                case "!=": return a != b;
            }
        }
        
        if (op.equals("==")) return izq.equals(der);
        if (op.equals("!=")) return !izq.equals(der);
        
        throw new RuntimeException("Comparación no válida");
    }

    @Override
    public Object visitAndExpr(SpajingParser.AndExprContext ctx) {
        Object izq = visit(ctx.expresion(0));
        Object der = visit(ctx.expresion(1));
        
        if (izq instanceof Boolean && der instanceof Boolean) {
            return (Boolean) izq && (Boolean) der;
        }
        throw new RuntimeException("Operación AND requiere valores lógicos");
    }

    @Override
    public Object visitOrExpr(SpajingParser.OrExprContext ctx) {
        Object izq = visit(ctx.expresion(0));
        Object der = visit(ctx.expresion(1));
        
        if (izq instanceof Boolean && der instanceof Boolean) {
            return (Boolean) izq || (Boolean) der;
        }
        throw new RuntimeException("Operación OR requiere valores lógicos");
    }

    @Override
    public Object visitNotExpr(SpajingParser.NotExprContext ctx) {
        Object valor = visit(ctx.expresion());
        
        if (valor instanceof Boolean) {
            return !(Boolean) valor;
        }
        throw new RuntimeException("Operación NOT requiere un valor lógico");
    }

    @Override
    public Object visitParentesis(SpajingParser.ParentesisContext ctx) {
        return visit(ctx.expresion());
    }

    @Override
    public Object visitLiteralExpr(SpajingParser.LiteralExprContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public Object visitIdExpr(SpajingParser.IdExprContext ctx) {
        String nombre = ctx.ID().getText();
        
        // Buscar primero en local, luego en global
        if (memoriaLocal.containsKey(nombre)) {
            return memoriaLocal.get(nombre);
        } else if (memoriaGlobal.containsKey(nombre)) {
            return memoriaGlobal.get(nombre);
        }
        
        throw new RuntimeException("Variable no declarada: " + nombre);
    }

    @Override
    public Object visitLiteral(SpajingParser.LiteralContext ctx) {
        if (ctx.ENTERO() != null) {
            return Integer.parseInt(ctx.ENTERO().getText());
        }
        if (ctx.REAL() != null) {
            return Double.parseDouble(ctx.REAL().getText());
        }
        if (ctx.CADENA() != null) {
            String texto = ctx.CADENA().getText();
            return texto.substring(1, texto.length() - 1); // Quitar comillas
        }
        if (ctx.BOOLEANO() != null) {
            return ctx.BOOLEANO().getText().equals("verdadero");
        }
        return null;
    }
    
    private void validarTipo(String tipo, Object valor, String variable) {
        switch (tipo) {
            case "entero":
                if (!(valor instanceof Integer)) {
                    throw new RuntimeException("La variable '" + variable + "' debe ser de tipo entero");
                }
                break;
            case "real":
                if (!(valor instanceof Double) && !(valor instanceof Integer)) {
                    throw new RuntimeException("La variable '" + variable + "' debe ser de tipo real");
                }
                break;
            case "texto":
                if (!(valor instanceof String)) {
                    throw new RuntimeException("La variable '" + variable + "' debe ser de tipo texto");
                }
                break;
            case "logico":
                if (!(valor instanceof Boolean)) {
                    throw new RuntimeException("La variable '" + variable + "' debe ser de tipo lógico");
                }
                break;
        }
    }
}


package visitor;

import java.util.HashMap;
import java.util.Map;

public class Visitor extends visitor.LenguajeBaseVisitor<Object> {
    private Map<String, Object> memoria = new HashMap<>();

    @Override
    public Object visitInstruccionAsignacion(visitor.LenguajeParser.InstruccionAsignacionContext ctx) {
        String nombre = ctx.asignacion().IDENTIFICADOR().getText();
        String tipo = ctx.asignacion().TIPO().getText();
        Object valor = visit(ctx.asignacion().expresion());

        // Validación de tipo simple
        switch (tipo) {
            case "entero":
                if (!(valor instanceof Integer)) throw new RuntimeException("Tipo inválido");
                break;
            case "decimal":
                if (!(valor instanceof Double)) throw new RuntimeException("Tipo inválido");
                break;
            case "texto":
                if (!(valor instanceof String)) throw new RuntimeException("Tipo inválido");
                break;
            case "booleano":
                if (!(valor instanceof Boolean)) throw new RuntimeException("Tipo inválido");
                break;
        }

        memoria.put(nombre, valor);
        return null;
    }

    @Override
    public Object visitInstruccionExpresion(visitor.LenguajeParser.InstruccionExpresionContext ctx) {
        Object resultado = visit(ctx.expresion());
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    @Override
    public Object visitId(visitor.LenguajeParser.IdContext ctx) {
        return memoria.get(ctx.IDENTIFICADOR().getText());
    }

    @Override
    public Object visitLit(visitor.LenguajeParser.LitContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public Object visitSuma(visitor.LenguajeParser.SumaContext ctx) {
        Object left = visit(ctx.expresion(0));
        Object right = visit(ctx.expresion(1));
        if (left instanceof Integer && right instanceof Integer) {
            return (Integer) left + (Integer) right;
        }
        throw new RuntimeException("Solo se pueden sumar enteros");
    }

    @Override
    public Object visitLiteral(visitor.LenguajeParser.LiteralContext ctx) {
        if (ctx.ENTERO() != null) return Integer.parseInt(ctx.ENTERO().getText());
        if (ctx.DECIMAL() != null) return Double.parseDouble(ctx.DECIMAL().getText());
        if (ctx.CADENA() != null) return ctx.CADENA().getText().replace("\"", "");
        if (ctx.BOOLEANO() != null) return ctx.BOOLEANO().getText().equals("verdadero");
        return null;
    }
}


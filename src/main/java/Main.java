import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import generated.*;
import visitor.Visitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Verificar que se proporcione un archivo
        if (args.length < 1) {
            System.out.println("Uso: java Main <archivo.txt>");
            System.out.println("Ejemplo: java Main programa.txt");
            return;
        }

        String archivo = args[0];
        
        try {
            // Leer el código fuente desde el archivo .txt
            String codigoFuente = new String(Files.readAllBytes(Paths.get(archivo)));
            
            System.out.println("=".repeat(80));
            System.out.println("ANALIZADOR LÉXICO DEL LENGUAJE SPAJING");
            System.out.println("=".repeat(80));
            System.out.println();
            
            // Mostrar el código fuente
            System.out.println("CÓDIGO FUENTE:");
            System.out.println("-".repeat(40));
            System.out.println(codigoFuente);
            System.out.println("-".repeat(40));
            System.out.println();
            
            // Mostrar tabla léxica de componentes del lenguaje
            mostrarTablaLexica();
            
            // Crear el lexer y parser
            CharStream cs = CharStreams.fromString(codigoFuente);
            SpajingLexer lexer = new SpajingLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Obtener todos los tokens para análisis
            tokens.fill();
            
            // Mostrar tokens encontrados en el código
            System.out.println("TOKENS ENCONTRADOS EN EL CÓDIGO:");
            System.out.println("-".repeat(80));
            System.out.printf("%-20s %-25s %-15s %-10s%n", "TOKEN", "LEXEMA", "TIPO", "LÍNEA:COL");
            System.out.println("-".repeat(80));
            
            for (Token token : tokens.getTokens()) {
                if (token.getType() != Token.EOF) {
                    String nombreToken = SpajingLexer.VOCABULARY.getSymbolicName(token.getType());
                    String lexema = token.getText().replace("\n", "\\n").replace("\r", "\\r");
                    String tipoCategoria = obtenerCategoria(token.getType());
                    String posicion = token.getLine() + ":" + token.getCharPositionInLine();
                    
                    System.out.printf("%-20s %-25s %-15s %-10s%n", 
                            nombreToken != null ? nombreToken : "LITERAL", 
                            lexema.length() > 23 ? lexema.substring(0, 20) + "..." : lexema,
                            tipoCategoria,
                            posicion);
                }
            }
            System.out.println("-".repeat(80));
            System.out.println();
            
            // Parsear el código
            SpajingParser parser = new SpajingParser(tokens);
            ParseTree tree = parser.programa();
            
            // Verificar errores de sintaxis
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.out.println("Se encontraron " + parser.getNumberOfSyntaxErrors() + " errores de sintaxis.");
            } else {
                System.out.println("✓ Análisis léxico y sintáctico completado sin errores.");
                
                // Ejecutar el programa usando el Visitor
                System.out.println();
                System.out.println("=".repeat(80));
                System.out.println("EJECUCIÓN DEL PROGRAMA");
                System.out.println("=".repeat(80));
                
                // Reposicionar el token stream para el visitor
                tokens.reset();
                SpajingParser parserExec = new SpajingParser(tokens);
                ParseTree treeExec = parserExec.programa();
                
                Visitor visitor = new Visitor();
                visitor.visit(treeExec);
                
                System.out.println("=".repeat(80));
            }
            
            System.out.println();
            System.out.println("Árbol de análisis sintáctico:");
            System.out.println(tree.toStringTree(parser));
            
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    private static void mostrarTablaLexica() {
        System.out.println("=".repeat(80));
        System.out.println("TABLA LÉXICA DEL LENGUAJE SPAJING");
        System.out.println("=".repeat(80));
        System.out.println();
        
        // Palabras Reservadas
        System.out.println("1. PALABRAS RESERVADAS");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "TOKEN", "PATRÓN");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "CLASE", "'Clase'");
        System.out.printf("%-20s %-30s%n", "PREGUNTA", "'pregunta'");
        System.out.printf("%-20s %-30s%n", "SINO", "'sino'");
        System.out.printf("%-20s %-30s%n", "MIENTRAS", "'mientras'");
        System.out.printf("%-20s %-30s%n", "MOSTRAR", "'mostrar'");
        System.out.printf("%-20s %-30s%n", "FIN", "'Fin'");
        System.out.printf("%-20s %-30s%n", "FIN_CONDICIONAL", "'fin'");
        System.out.println();
        
        // Operadores
        System.out.println("2. OPERADORES");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "TOKEN", "PATRÓN");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "ASIGNACION", "'--:'");
        System.out.printf("%-20s %-30s%n", "AND", "'y'");
        System.out.printf("%-20s %-30s%n", "OR", "'o'");
        System.out.printf("%-20s %-30s%n", "NOT", "'no'");
        System.out.printf("%-20s %-30s%n", "SUMA", "'+'");
        System.out.printf("%-20s %-30s%n", "RESTA", "'-'");
        System.out.printf("%-20s %-30s%n", "MULTIPLICACION", "'*'");
        System.out.printf("%-20s %-30s%n", "DIVISION", "'/'");
        System.out.printf("%-20s %-30s%n", "MODULO", "'%'");
        System.out.printf("%-20s %-30s%n", "MAYOR_QUE", "'>'");
        System.out.printf("%-20s %-30s%n", "MENOR_QUE", "'<'");
        System.out.printf("%-20s %-30s%n", "MAYOR_IGUAL", "'>='");
        System.out.printf("%-20s %-30s%n", "MENOR_IGUAL", "'<='");
        System.out.printf("%-20s %-30s%n", "IGUAL", "'=='");
        System.out.printf("%-20s %-30s%n", "DIFERENTE", "'!='");
        System.out.println();
        
        // Delimitadores
        System.out.println("3. DELIMITADORES");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "TOKEN", "PATRÓN");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "DOS_PUNTOS", "':'");
        System.out.printf("%-20s %-30s%n", "PUNTO_Y_COMA", "';'");
        System.out.printf("%-20s %-30s%n", "PARENTESIS_IZQ", "'('");
        System.out.printf("%-20s %-30s%n", "PARENTESIS_DER", "')'");
        System.out.println();
        
        // Tipos de Datos Básicos
        System.out.println("4. TIPOS DE DATOS BÁSICOS");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "TOKEN", "PATRÓN");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "ENTERO_TIPO", "'entero'");
        System.out.printf("%-20s %-30s%n", "REAL_TIPO", "'real'");
        System.out.printf("%-20s %-30s%n", "LOGICO_TIPO", "'logico'");
        System.out.printf("%-20s %-30s%n", "TEXTO_TIPO", "'texto'");
        System.out.println();
        
        // Estructuras de Control
        System.out.println("5. ESTRUCTURAS DE CONTROL");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "ESTRUCTURA", "SINTAXIS");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "Condicional", "pregunta <expr>: ... fin");
        System.out.printf("%-20s %-30s%n", "Condicional else", "pregunta <expr>: ... sino: ... fin");
        System.out.printf("%-20s %-30s%n", "Bucle while", "mientras <expr>: ... fin");
        System.out.println();
        
        // Literales
        System.out.println("6. LITERALES");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "TOKEN", "PATRÓN");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "ENTERO", "[0-9]+");
        System.out.printf("%-20s %-30s%n", "REAL", "[0-9]+'.'[0-9]+");
        System.out.printf("%-20s %-30s%n", "CADENA", "'\"' (~[\"])* '\"'");
        System.out.printf("%-20s %-30s%n", "BOOLEANO", "'verdadero' | 'falso'");
        System.out.println();
        
        // Identificadores
        System.out.println("7. IDENTIFICADORES");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "TOKEN", "PATRÓN");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "ID", "[a-zA-Z_][a-zA-Z0-9_]*");
        System.out.println();
        
        // Tokens ignorados
        System.out.println("8. TOKENS IGNORADOS");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "TOKEN", "PATRÓN");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "WS", "[ \\t\\r\\n]+ -> skip");
        System.out.printf("%-20s %-30s%n", "COMENTARIO", "'//' ~[\\r\\n]* -> skip");
        System.out.println();
        System.out.println("=".repeat(80));
        System.out.println();
    }
    
    private static String obtenerCategoria(int tipo) {
        // Categorizar tokens según su tipo
        switch (tipo) {
            case SpajingLexer.CLASE:
            case SpajingLexer.PREGUNTA:
            case SpajingLexer.SINO:
            case SpajingLexer.MIENTRAS:
            case SpajingLexer.MOSTRAR:
            case SpajingLexer.FIN:
            case SpajingLexer.FIN_CONDICIONAL:
                return "Palabra Res.";
            case SpajingLexer.ENTERO_TIPO:
            case SpajingLexer.REAL_TIPO:
            case SpajingLexer.LOGICO_TIPO:
            case SpajingLexer.TEXTO_TIPO:
                return "Tipo Dato";
            case SpajingLexer.AND:
            case SpajingLexer.OR:
            case SpajingLexer.NOT:
            case SpajingLexer.ASIGNACION:
                return "Operador";
            case SpajingLexer.ENTERO:
            case SpajingLexer.REAL:
            case SpajingLexer.CADENA:
            case SpajingLexer.BOOLEANO:
                return "Literal";
            case SpajingLexer.ID:
                return "Identificador";
            default:
                return "Delimitador";
        }
    }
}

package util;

/**
 * Clase encargada de mostrar la tabla léxica del lenguaje Spajing
 */
public class TablaLexica {

    public static void mostrar() {
        System.out.println("=".repeat(80));
        System.out.println("TABLA LÉXICA DEL LENGUAJE SPAJING");
        System.out.println("=".repeat(80));
        System.out.println();

        mostrarPalabrasReservadas();
        mostrarOperadores();
        mostrarDelimitadores();
        mostrarTiposDatos();
        mostrarEstructurasControl();
        mostrarLiterales();
        mostrarIdentificadores();
        mostrarTokensIgnorados();

        System.out.println("=".repeat(80));
        System.out.println();
    }

    private static void mostrarPalabrasReservadas() {
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
    }

    private static void mostrarOperadores() {
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
    }

    private static void mostrarDelimitadores() {
        System.out.println("3. DELIMITADORES");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "TOKEN", "PATRÓN");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "DOS_PUNTOS", "':'");
        System.out.printf("%-20s %-30s%n", "PUNTO_Y_COMA", "';'");
        System.out.printf("%-20s %-30s%n", "PARENTESIS_IZQ", "'('");
        System.out.printf("%-20s %-30s%n", "PARENTESIS_DER", "')'");
        System.out.println();
    }

    private static void mostrarTiposDatos() {
        System.out.println("4. TIPOS DE DATOS BÁSICOS");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "TOKEN", "PATRÓN");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "ENTERO_TIPO", "'entero'");
        System.out.printf("%-20s %-30s%n", "REAL_TIPO", "'real'");
        System.out.printf("%-20s %-30s%n", "LOGICO_TIPO", "'logico'");
        System.out.printf("%-20s %-30s%n", "TEXTO_TIPO", "'texto'");
        System.out.println();
    }

    private static void mostrarEstructurasControl() {
        System.out.println("5. ESTRUCTURAS DE CONTROL");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "ESTRUCTURA", "SINTAXIS");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "Condicional", "pregunta <expr>: ... fin");
        System.out.printf("%-20s %-30s%n", "Condicional else", "pregunta <expr>: ... sino: ... fin");
        System.out.printf("%-20s %-30s%n", "Bucle while", "mientras <expr>: ... fin");
        System.out.println();
    }

    private static void mostrarLiterales() {
        System.out.println("6. LITERALES");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "TOKEN", "PATRÓN");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "ENTERO", "[0-9]+");
        System.out.printf("%-20s %-30s%n", "REAL", "[0-9]+'.'[0-9]+");
        System.out.printf("%-20s %-30s%n", "CADENA", "'\"' (~[\"])* '\"'");
        System.out.printf("%-20s %-30s%n", "BOOLEANO", "'verdadero' | 'falso'");
        System.out.println();
    }

    private static void mostrarIdentificadores() {
        System.out.println("7. IDENTIFICADORES");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "TOKEN", "PATRÓN");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "ID", "[a-zA-Z_][a-zA-Z0-9_]*");
        System.out.println();
    }

    private static void mostrarTokensIgnorados() {
        System.out.println("8. TOKENS IGNORADOS");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "TOKEN", "PATRÓN");
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %-30s%n", "WS", "[ \\t\\r\\n]+ -> skip");
        System.out.printf("%-20s %-30s%n", "COMENTARIO", "'//' ~[\\r\\n]* -> skip");
        System.out.println();
    }
}

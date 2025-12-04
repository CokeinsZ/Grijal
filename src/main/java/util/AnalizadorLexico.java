package util;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import generated.SpajingLexer;

/**
 * Clase encargada de mostrar información del análisis léxico
 */
public class AnalizadorLexico {

    /**
     * Muestra el encabezado del analizador léxico
     */
    public static void mostrarEncabezado() {
        System.out.println("=".repeat(80));
        System.out.println("ANALIZADOR LÉXICO DEL LENGUAJE SPAJING");
        System.out.println("=".repeat(80));
        System.out.println();
    }

    /**
     * Muestra el código fuente proporcionado
     * @param codigoFuente El código fuente a mostrar
     */
    public static void mostrarCodigoFuente(String codigoFuente) {
        System.out.println("CÓDIGO FUENTE:");
        System.out.println("-".repeat(40));
        System.out.println(codigoFuente);
        System.out.println("-".repeat(40));
        System.out.println();
    }

    /**
     * Muestra los tokens encontrados en el código
     * @param tokens El stream de tokens a mostrar
     */
    public static void mostrarTokens(CommonTokenStream tokens) {
        System.out.println("TOKENS ENCONTRADOS EN EL CÓDIGO:");
        System.out.println("-".repeat(110));
        System.out.printf("%-20s %-20s %-30s %-15s %-10s%n", "TOKEN", "LEXEMA", "PATRÓN", "TIPO", "LÍNEA:COL");
        System.out.println("-".repeat(110));

        for (Token token : tokens.getTokens()) {
            if (token.getType() != Token.EOF) {
                String nombreToken = SpajingLexer.VOCABULARY.getSymbolicName(token.getType());
                String lexema = token.getText().replace("\n", "\\n").replace("\r", "\\r");
                String tipoCategoria = TokenCategorizador.obtenerCategoria(token.getType());
                String patron = TokenCategorizador.obtenerPatron(token.getType());
                String posicion = token.getLine() + ":" + token.getCharPositionInLine();

                System.out.printf("%-20s %-20s %-30s %-15s %-10s%n",
                        nombreToken != null ? nombreToken : "LITERAL",
                        lexema.length() > 18 ? lexema.substring(0, 15) + "..." : lexema,
                        patron,
                        tipoCategoria,
                        posicion);
            }
        }
        System.out.println("-".repeat(110));
        System.out.println();
    }

    /**
     * Muestra el encabezado de ejecución del programa
     */
    public static void mostrarEncabezadoEjecucion() {
        System.out.println();
        System.out.println("=".repeat(80));
        System.out.println("EJECUCIÓN DEL PROGRAMA");
        System.out.println("=".repeat(80));
    }

    /**
     * Muestra el pie de ejecución
     */
    public static void mostrarPieEjecucion() {
        System.out.println("=".repeat(80));
    }
}

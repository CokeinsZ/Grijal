package util;

import generated.SpajingLexer;

/**
 * Clase encargada de categorizar los tokens del lenguaje Spajing
 */
public class TokenCategorizador {

    /**
     * Obtiene la categoría de un token según su tipo
     * @param tipo El tipo de token (constante del lexer)
     * @return La categoría del token como String
     */
    public static String obtenerCategoria(int tipo) {
        switch (tipo) {
            case SpajingLexer.CLASE:
            case SpajingLexer.FUNCION:
            case SpajingLexer.RETORNAR:
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

    /**
     * Obtiene el patrón de un token según su tipo
     * @param tipo El tipo de token (constante del lexer)
     * @return El patrón del token como String
     */
    public static String obtenerPatron(int tipo) {
        switch (tipo) {
            // Palabras reservadas
            case SpajingLexer.CLASE:
                return "'Clase'";
            case SpajingLexer.FUNCION:
                return "'funcion'";
            case SpajingLexer.RETORNAR:
                return "'retornar'";
            case SpajingLexer.PREGUNTA:
                return "'pregunta'";
            case SpajingLexer.SINO:
                return "'sino'";
            case SpajingLexer.MIENTRAS:
                return "'mientras'";
            case SpajingLexer.MOSTRAR:
                return "'mostrar'";
            case SpajingLexer.FIN:
                return "'Fin'";
            case SpajingLexer.FIN_CONDICIONAL:
                return "'fin'";
            // Tipos de datos
            case SpajingLexer.ENTERO_TIPO:
                return "'entero'";
            case SpajingLexer.REAL_TIPO:
                return "'real'";
            case SpajingLexer.LOGICO_TIPO:
                return "'logico'";
            case SpajingLexer.TEXTO_TIPO:
                return "'texto'";
            // Operadores lógicos
            case SpajingLexer.AND:
                return "'y'";
            case SpajingLexer.OR:
                return "'o'";
            case SpajingLexer.NOT:
                return "'no'";
            case SpajingLexer.ASIGNACION:
                return "'--:'";
            // Literales
            case SpajingLexer.BOOLEANO:
                return "'verdadero' | 'falso'";
            case SpajingLexer.ENTERO:
                return "[0-9]+";
            case SpajingLexer.REAL:
                return "[0-9]+'.'[0-9]+";
            case SpajingLexer.CADENA:
                return "'\"' (~[\"])* '\"'";
            // Identificadores
            case SpajingLexer.ID:
                return "[a-zA-Z_][a-zA-Z0-9_]*";
            default:
                return "literal";
        }
    }
}

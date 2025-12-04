package util;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Clase encargada de mostrar el árbol sintáctico de forma visual
 */
public class ArbolSintactico {

    /**
     * Muestra el árbol sintáctico de forma visual con indentación
     * @param tree El árbol de análisis
     * @param parser El parser usado para obtener nombres de reglas
     */
    public static void mostrar(ParseTree tree, Parser parser) {
        System.out.println();
        System.out.println("=".repeat(80));
        System.out.println("ÁRBOL DE ANÁLISIS SINTÁCTICO");
        System.out.println("=".repeat(80));
        imprimirArbol(tree, parser, "", true);
        System.out.println("=".repeat(80));
    }

    /**
     * Imprime el árbol de forma recursiva con formato visual
     * @param tree Nodo actual del árbol
     * @param parser Parser para obtener nombres de reglas
     * @param prefijo Prefijo para la indentación
     * @param esUltimo Indica si es el último hijo
     */
    private static void imprimirArbol(ParseTree tree, Parser parser, String prefijo, boolean esUltimo) {
        String nombreNodo = obtenerNombreNodo(tree, parser);
        
        // Imprimir el nodo actual
        System.out.println(prefijo + (esUltimo ? "└── " : "├── ") + nombreNodo);
        
        // Preparar el prefijo para los hijos
        String nuevoPrefijo = prefijo + (esUltimo ? "    " : "│   ");
        
        // Imprimir los hijos recursivamente
        int numHijos = tree.getChildCount();
        for (int i = 0; i < numHijos; i++) {
            imprimirArbol(tree.getChild(i), parser, nuevoPrefijo, i == numHijos - 1);
        }
    }

    /**
     * Obtiene el nombre del nodo para mostrar
     * @param tree Nodo del árbol
     * @param parser Parser para obtener nombres de reglas
     * @return Nombre formateado del nodo
     */
    private static String obtenerNombreNodo(ParseTree tree, Parser parser) {
        // Si es un nodo terminal (hoja), mostrar el texto del token
        if (tree.getChildCount() == 0) {
            String texto = tree.getText();
            // Escapar caracteres especiales
            texto = texto.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
            return "'" + texto + "'";
        }
        
        // Si es un nodo de regla, obtener el nombre de la regla
        String className = tree.getClass().getSimpleName();
        // Quitar "Context" del nombre si está presente
        if (className.endsWith("Context")) {
            className = className.substring(0, className.length() - 7);
        }
        return className;
    }
}

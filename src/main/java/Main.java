import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import generated.*;
import visitor.Visitor;
import util.AnalizadorLexico;
import util.ArbolSintactico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Verificar que se proporcione un archivo
        if (args.length < 1) {
            System.out.println("Es necesario un argumento <archivo.txt>");
            return;
        }

        String archivo = args[0];
        
        try {
            // Leer el código fuente desde el archivo .txt
            String codigoFuente = new String(Files.readAllBytes(Paths.get(archivo)));
            
            // Crear el lexer y parser
            CharStream cs = CharStreams.fromString(codigoFuente);
            SpajingLexer lexer = new SpajingLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Obtener todos los tokens para análisis
            tokens.fill();
            
            // Parsear el código
            SpajingParser parser = new SpajingParser(tokens);
            ParseTree tree = parser.programa();
            
            // Verificar errores de sintaxis
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.out.println("Se encontraron " + parser.getNumberOfSyntaxErrors() + " errores de sintaxis.");
            } else {
                // 1. Primero ejecutar el programa usando el Visitor
                AnalizadorLexico.mostrarEncabezadoEjecucion();
                
                tokens.reset();
                SpajingParser parserExec = new SpajingParser(tokens);
                ParseTree treeExec = parserExec.programa();
                
                Visitor visitor = new Visitor();
                visitor.visit(treeExec);
                
                AnalizadorLexico.mostrarPieEjecucion();
                
                System.out.println("✓ Análisis léxico y sintáctico completado sin errores.");
            }
            
            // 2. Luego mostrar tabla de tokens
            AnalizadorLexico.mostrarTokens(tokens);
            
            // 3. Finalmente mostrar árbol sintáctico
            ArbolSintactico.mostrar(tree, parser);
            
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import visitor.*;
import visitor.LenguajeLexer;
import visitor.LenguajeParser;

public class Main {
    public static void main(String[] args) throws Exception {
        // Cargar entrada (ejemplo: desde un string)
        String input = "asignar x<entero> = 5\n" +
                "asignar y<entero> = 10\n" +
                "x + y";
        CharStream cs = CharStreams.fromString(input);

        // Lexer y parser generados a partir de Lenguaje.g4
        LenguajeLexer lexer = new LenguajeLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LenguajeParser parser = new LenguajeParser(tokens);

        // Parsear desde la regla inicial
        ParseTree tree = parser.programa();

        // Usar el visitor personalizado
        Visitor visitor = new Visitor();
        visitor.visit(tree);
    }
}

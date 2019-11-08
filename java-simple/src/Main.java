import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "./resources/test.txt";
        InputStream input = new FileInputStream(fileName);
        ANTLRInputStream stream = new ANTLRInputStream(input);
        //Lexico
        JavaSimpleLexer lexer = new JavaSimpleLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer); 
        //Sintatico
        JavaSimpleParser parser = new JavaSimpleParser(tokens);
        ParseTree tree = parser.r();
        System.out.println();
        System.out.println(tree.toStringTree(parser));
    }

}
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import symboltable.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.gui.TreeViewer;

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
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

}
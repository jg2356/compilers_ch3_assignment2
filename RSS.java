import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class RSS {

	public static void main(String[] args) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		
		RSSLexer lexer = new RSSLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		RSSParser parser = new RSSParser(tokens);
		
		ParseTree tree = parser.prog();
		
		CalculatorVisitor calc = new CalculatorVisitor();
		calc.visit(tree);
	}

}

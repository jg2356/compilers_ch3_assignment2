import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class CalculatorVisitor extends RSSBaseVisitor<Double> {
	private Map<String, Double> variables;
	
	public CalculatorVisitor()
	{
		variables = new HashMap<String, Double>();
	}
	
	@Override public Double visitDefvar(RSSParser.DefvarContext ctx) {
		String id = ctx.ID().getText();
		Double value = visit(ctx.expr());
		
		variables.put(id, value);
		
		return value;
	}
	
	@Override public Double visitRefvar(RSSParser.RefvarContext ctx) { 
		String id = ctx.ID().getText();
		
		Double value = variables.get(id);
		
		if (value == null)
			throw new RuntimeException(id + " is not defined.");
		
		return value;
	}
	
	@Override public Double visitProg(RSSParser.ProgContext ctx) {
		Double result = null;
		for(RSSParser.ExprContext ectx : ctx.expr()) {
			result = visit(ectx);
		}
		if (result != null)
			System.out.println(result);
		return result;
	}

	@Override public Double visitDouble(RSSParser.DoubleContext ctx) { 
		return new Double(ctx.DOUBLE().getText());		
	}

	@Override public Double visitOperation(RSSParser.OperationContext ctx) {
		String op = ctx.RATOR().getText();
		Double result = 0.0;

		switch(op) {
		case "^":
		{
			result = 1.0;
			for (RSSParser.ExprContext expr : ctx.expr()) {
				result = Math.pow(result, visit(expr));				
			}
			break;
		}
		case "*":
		{
			result = 1.0;
			for (RSSParser.ExprContext expr : ctx.expr()) {
				result = result * visit(expr);				
			}
			break;
		}
		case "/":
		{
			result = null;
			for (RSSParser.ExprContext expr : ctx.expr()) {
				if (ctx.expr().size() == 1) {
					result = 1.0 / visit(expr);
				}
				else if (result == null)
				{
					result = visit(expr);
				}
				else {
					result = result / visit(expr);	
				}
			}
			break;
		}
		case "+":
		{
			result = 0.0;
			for (RSSParser.ExprContext expr : ctx.expr()) {
				result = result + visit(expr);				
			}
			break;
		}
		case "-":
		{
			result = null;
			for (RSSParser.ExprContext expr : ctx.expr()) {
				if (ctx.expr().size() == 1) {
					result = 0.0 - visit(expr);
				}
				else if (result == null)
				{
					result = visit(expr);
				}
				else {
					result = result - visit(expr);	
				}			
			}
			break;
		}
		}
		
		return result;
	}
}

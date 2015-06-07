import java.util.HashMap;
import java.util.Map;

public class CalculatorVisitor extends RSSBaseVisitor<Double> {
	private Map<String, Double> variables;
	
	public CalculatorVisitor()
	{
		variables = new HashMap<String, Double>();
		variables.put("^", 1.0);
		variables.put("*", 1.0);
		variables.put("/", 1.0);
		variables.put("+", 0.0);
		variables.put("-", 0.0);
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
		switch(op) {
		case "+":
		{
			Double result = variables.get(op);
			for (RSSParser.ExprContext expr : ctx.expr()) {
				result = result + visit(expr);				
			}
			return result;
		}
		case "^":
		case "*":
		{
			Double result = variables.get(op);
			for (RSSParser.ExprContext expr : ctx.expr()) {
				switch(op) {
				case "^":
					result = Math.pow(result, visit(expr));
					break;
				case "*":
					result = result * visit(expr);
					break;
				}
			}
			return result;
		}
		case "/":
		case "-":
		{
			if (ctx.expr().isEmpty())
				throw new RuntimeException("illegal: (" + op + ")");

			Double result = null;
			for (RSSParser.ExprContext expr : ctx.expr()) {
				if (result == null)
				{
					if (ctx.expr().iterator().hasNext()) {
						result = visit(expr);
						continue;
					}
					else {
						result = variables.get(op);
					}
				}
				else {
					switch(op)
					{
					case "/":
						result = result / visit(expr);
						break;
					case "-":
						result = result - visit(expr);
						break;
					}
				}	
			}
			return result;
		}
		default:
			throw new RuntimeException("illegal operator: " + op);
		}
	}
}

public class CalculatorVisitor extends RSSBaseVisitor<Double> {
	@Override public Double visitProg(RSSParser.ProgContext ctx) {
		for(RSSParser.ExprContext ectx : ctx.expr()) {
			Double result = visit(ectx);
			System.out.println(result);
		}
		return 0.0;
	}

	@Override public Double visitDouble(RSSParser.DoubleContext ctx) { 
		return new Double(ctx.DOUBLE().getText());		
	}

	@Override public Double visitOperation(RSSParser.OperationContext ctx) {
		String op = ctx.RATOR().getText();
		Double le = visit(ctx.expr(0));
		Double re = visit(ctx.expr(1));
		switch(op) {
		case "^": return Math.pow(le, re);
		case "*": return le * re;
		case "/": return le / re;
		case "+": return le + re;
		case "-": return le - re;
		}
		return null;
	}
}
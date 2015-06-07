// Generated from RSS.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RSSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RSSParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(RSSParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double}
	 * labeled alternative in {@link RSSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(RSSParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operation}
	 * labeled alternative in {@link RSSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(RSSParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defvar}
	 * labeled alternative in {@link RSSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(RSSParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refvar}
	 * labeled alternative in {@link RSSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefvar(RSSParser.RefvarContext ctx);
}
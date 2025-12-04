// Generated from C:/Users/stive/IdeaProjects/lenguaje/src/main/antlr4/Spajing.g4 by ANTLR 4.13.2

package generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SpajingParser}.
 */
public interface SpajingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SpajingParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SpajingParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpajingParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SpajingParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpajingParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(SpajingParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpajingParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(SpajingParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpajingParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(SpajingParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpajingParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(SpajingParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpajingParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(SpajingParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpajingParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(SpajingParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpajingParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(SpajingParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpajingParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(SpajingParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpajingParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(SpajingParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpajingParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(SpajingParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpajingParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(SpajingParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpajingParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(SpajingParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpajingParser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(SpajingParser.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpajingParser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(SpajingParser.BucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpajingParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(SpajingParser.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpajingParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(SpajingParser.MostrarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(SpajingParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(SpajingParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparacion}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(SpajingParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparacion}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(SpajingParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(SpajingParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(SpajingParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Adicion}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAdicion(SpajingParser.AdicionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Adicion}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAdicion(SpajingParser.AdicionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(SpajingParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(SpajingParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(SpajingParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(SpajingParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(SpajingParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(SpajingParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplicacion}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacion(SpajingParser.MultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplicacion}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacion(SpajingParser.MultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(SpajingParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(SpajingParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpajingParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SpajingParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpajingParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SpajingParser.LiteralContext ctx);
}
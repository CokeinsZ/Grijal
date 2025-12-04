// Generated from C:/Users/stive/IdeaProjects/lenguaje/src/main/antlr4/Spajing.g4 by ANTLR 4.13.2

package compiler.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpajingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpajingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SpajingParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(SpajingParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpajingParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(SpajingParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpajingParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(SpajingParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpajingParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(SpajingParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpajingParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(SpajingParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpajingParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(SpajingParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpajingParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(SpajingParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpajingParser#bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle(SpajingParser.BucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpajingParser#mostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrar(SpajingParser.MostrarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(SpajingParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparacion}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(SpajingParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(SpajingParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Adicion}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdicion(SpajingParser.AdicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(SpajingParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(SpajingParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(SpajingParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplicacion}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(SpajingParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link SpajingParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(SpajingParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpajingParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SpajingParser.LiteralContext ctx);
}
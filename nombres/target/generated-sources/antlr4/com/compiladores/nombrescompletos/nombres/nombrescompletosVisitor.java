// Generated from com\compiladores\nombrescompletos\nombres\nombrescompletos.g4 by ANTLR 4.5.1
package com.compiladores.nombrescompletos.nombres;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link nombrescompletosParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface nombrescompletosVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link nombrescompletosParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(nombrescompletosParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link nombrescompletosParser#bebida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBebida(nombrescompletosParser.BebidaContext ctx);
}
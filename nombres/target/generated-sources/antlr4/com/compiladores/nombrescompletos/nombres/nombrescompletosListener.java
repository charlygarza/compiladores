// Generated from com\compiladores\nombrescompletos\nombres\nombrescompletos.g4 by ANTLR 4.5.1
package com.compiladores.nombrescompletos.nombres;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link nombrescompletosParser}.
 */
public interface nombrescompletosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link nombrescompletosParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(nombrescompletosParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link nombrescompletosParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(nombrescompletosParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link nombrescompletosParser#bebida}.
	 * @param ctx the parse tree
	 */
	void enterBebida(nombrescompletosParser.BebidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link nombrescompletosParser#bebida}.
	 * @param ctx the parse tree
	 */
	void exitBebida(nombrescompletosParser.BebidaContext ctx);
}
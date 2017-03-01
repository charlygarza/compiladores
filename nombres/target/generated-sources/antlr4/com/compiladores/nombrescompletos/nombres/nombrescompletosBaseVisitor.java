// Generated from com\compiladores\nombrescompletos\nombres\nombrescompletos.g4 by ANTLR 4.5.1
package com.compiladores.nombrescompletos.nombres;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link nombrescompletosVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class nombrescompletosBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements nombrescompletosVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInicio(nombrescompletosParser.InicioContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBebida(nombrescompletosParser.BebidaContext ctx) { return visitChildren(ctx); }
}
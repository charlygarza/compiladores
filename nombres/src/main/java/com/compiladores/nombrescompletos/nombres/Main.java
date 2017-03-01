
package com.compiladores.nombrescompletos.nombres;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "ncs";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		nombrescompletosLexer lexer = new nombrescompletosLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		nombrescompletosParser parser = new nombrescompletosParser(tokens);

		nombrescompletosParser.InicioContext tree = parser.inicio();

		nombrescompletosCustomVisitor visitor = new nombrescompletosCustomVisitor();
		visitor.visit(tree);

		System.out.println("ANALISIS TERMINADO");

	}

	

}

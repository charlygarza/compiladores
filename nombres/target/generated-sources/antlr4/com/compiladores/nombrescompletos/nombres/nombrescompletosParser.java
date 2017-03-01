// Generated from com\compiladores\nombrescompletos\nombres\nombrescompletos.g4 by ANTLR 4.5.1
package com.compiladores.nombrescompletos.nombres;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class nombrescompletosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARTICULO=1, DE=2, RECIPIENTE=3, TEXTO=4, WS=5;
	public static final int
		RULE_inicio = 0, RULE_bebida = 1;
	public static final String[] ruleNames = {
		"inicio", "bebida"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'de'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ARTICULO", "DE", "RECIPIENTE", "TEXTO", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "nombrescompletos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public nombrescompletosParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InicioContext extends ParserRuleContext {
		public TerminalNode RECIPIENTE() { return getToken(nombrescompletosParser.RECIPIENTE, 0); }
		public TerminalNode DE() { return getToken(nombrescompletosParser.DE, 0); }
		public BebidaContext bebida() {
			return getRuleContext(BebidaContext.class,0);
		}
		public TerminalNode ARTICULO() { return getToken(nombrescompletosParser.ARTICULO, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nombrescompletosListener ) ((nombrescompletosListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nombrescompletosListener ) ((nombrescompletosListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nombrescompletosVisitor ) return ((nombrescompletosVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_la = _input.LA(1);
			if (_la==ARTICULO) {
				{
				setState(4);
				match(ARTICULO);
				}
			}

			setState(7);
			match(RECIPIENTE);
			setState(8);
			match(DE);
			setState(9);
			bebida();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BebidaContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(nombrescompletosParser.TEXTO, 0); }
		public BebidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bebida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nombrescompletosListener ) ((nombrescompletosListener)listener).enterBebida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nombrescompletosListener ) ((nombrescompletosListener)listener).exitBebida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nombrescompletosVisitor ) return ((nombrescompletosVisitor<? extends T>)visitor).visitBebida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BebidaContext bebida() throws RecognitionException {
		BebidaContext _localctx = new BebidaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bebida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			match(TEXTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\20\4\2\t\2\4\3"+
		"\t\3\3\2\5\2\b\n\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\2\2\4\2\4\2\2\16\2\7\3"+
		"\2\2\2\4\r\3\2\2\2\6\b\7\3\2\2\7\6\3\2\2\2\7\b\3\2\2\2\b\t\3\2\2\2\t\n"+
		"\7\5\2\2\n\13\7\4\2\2\13\f\5\4\3\2\f\3\3\2\2\2\r\16\7\6\2\2\16\5\3\2\2"+
		"\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
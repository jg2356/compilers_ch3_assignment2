// Generated from RSS.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, RATOR=5, NEWLINE=6, DOUBLE=7, WS=8;
	public static final int
		RULE_prog = 0, RULE_expr = 1;
	public static final String[] ruleNames = {
		"prog", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'def'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ID", "RATOR", "NEWLINE", "DOUBLE", "WS"
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
	public String getGrammarFileName() { return "RSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RSSParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RSSParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSSVisitor ) return ((RSSVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				expr();
				setState(5);
				match(NEWLINE);
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ID) | (1L << DOUBLE))) != 0) );
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperationContext extends ExprContext {
		public TerminalNode RATOR() { return getToken(RSSParser.RATOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSSVisitor ) return ((RSSVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefvarContext extends ExprContext {
		public TerminalNode ID() { return getToken(RSSParser.ID, 0); }
		public RefvarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSSVisitor ) return ((RSSVisitor<? extends T>)visitor).visitRefvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefvarContext extends ExprContext {
		public TerminalNode ID() { return getToken(RSSParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefvarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSSVisitor ) return ((RSSVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(RSSParser.DOUBLE, 0); }
		public DoubleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RSSVisitor ) return ((RSSVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(DOUBLE);
				}
				break;
			case 2:
				_localctx = new OperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(T__0);
				setState(13);
				match(RATOR);
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ID) | (1L << DOUBLE))) != 0)) {
					{
					{
					setState(14);
					expr();
					}
					}
					setState(19);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(20);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new DefvarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				match(T__0);
				setState(22);
				match(T__2);
				setState(23);
				match(ID);
				setState(24);
				expr();
				setState(25);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new RefvarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				match(ID);
				}
				break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n!\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\7\3\22\n\3\f\3\16"+
		"\3\25\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\3\2\2\4\2\4\2"+
		"\2#\2\t\3\2\2\2\4\36\3\2\2\2\6\7\5\4\3\2\7\b\7\b\2\2\b\n\3\2\2\2\t\6\3"+
		"\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\37\7\t\2\2"+
		"\16\17\7\3\2\2\17\23\7\7\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\25\3\2\2\2"+
		"\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\37\7\4\2\2"+
		"\27\30\7\3\2\2\30\31\7\5\2\2\31\32\7\6\2\2\32\33\5\4\3\2\33\34\7\4\2\2"+
		"\34\37\3\2\2\2\35\37\7\6\2\2\36\r\3\2\2\2\36\16\3\2\2\2\36\27\3\2\2\2"+
		"\36\35\3\2\2\2\37\5\3\2\2\2\5\13\23\36";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
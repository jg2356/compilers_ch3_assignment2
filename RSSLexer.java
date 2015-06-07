// Generated from RSS.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, RATOR=5, NEWLINE=6, DOUBLE=7, WS=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "ID", "RATOR", "NEWLINE", "DOUBLE", "WS", "DIGIT", 
		"LETTER"
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


	public RSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\nG\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5$\n\5\f\5\16\5"+
		"\'\13\5\3\6\3\6\3\7\5\7,\n\7\3\7\3\7\3\b\5\b\61\n\b\3\b\6\b\64\n\b\r\b"+
		"\16\b\65\3\b\3\b\6\b:\n\b\r\b\16\b;\5\b>\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2\3\2\6\6\2"+
		",-//\61\61``\4\2\13\13\"\"\3\2\62;\4\2C\\c|L\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\33\3\2\2\2\t\37\3\2\2\2\13(\3\2\2\2\r"+
		"+\3\2\2\2\17\60\3\2\2\2\21?\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27\30\7*\2"+
		"\2\30\4\3\2\2\2\31\32\7+\2\2\32\6\3\2\2\2\33\34\7f\2\2\34\35\7g\2\2\35"+
		"\36\7h\2\2\36\b\3\2\2\2\37%\5\25\13\2 $\5\25\13\2!$\5\23\n\2\"$\7a\2\2"+
		"# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\n\3\2"+
		"\2\2\'%\3\2\2\2()\t\2\2\2)\f\3\2\2\2*,\7\17\2\2+*\3\2\2\2+,\3\2\2\2,-"+
		"\3\2\2\2-.\7\f\2\2.\16\3\2\2\2/\61\7/\2\2\60/\3\2\2\2\60\61\3\2\2\2\61"+
		"\63\3\2\2\2\62\64\5\23\n\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65"+
		"\66\3\2\2\2\66=\3\2\2\2\679\7\60\2\28:\5\23\n\298\3\2\2\2:;\3\2\2\2;9"+
		"\3\2\2\2;<\3\2\2\2<>\3\2\2\2=\67\3\2\2\2=>\3\2\2\2>\20\3\2\2\2?@\t\3\2"+
		"\2@A\3\2\2\2AB\b\t\2\2B\22\3\2\2\2CD\t\4\2\2D\24\3\2\2\2EF\t\5\2\2F\26"+
		"\3\2\2\2\n\2#%+\60\65;=\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
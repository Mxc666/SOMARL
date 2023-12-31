// Generated from /home/lesire/Work/HierarchicalPlanning/pddl-python/PDDL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PDDLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LP=1, RP=2, OF=3, EQUALS=4, DEFINE=5, DOMAIN=6, PROBLEM=7, DDOMAIN=8, 
		REQUIREMENTS=9, TYPES=10, CONSTANTS=11, PREDICATES=12, OBJECTS=13, INIT=14, 
		GOAL=15, ACTION=16, PARAMETERS=17, PRECONDITION=18, EFFECT=19, OBSERVE=20, 
		TASK=21, METHOD=22, ORDERED=23, SUBTASKS=24, ORDERING=25, CONSTRAINTS=26, 
		HTN=27, BEFORE=28, NOT=29, AND=30, FORALL=31, WHEN=32, EITHER=33, UNKNOWN=34, 
		OR=35, ONEOF=36, REQUIRE_KEY=37, NAME=38, VARIABLE=39, NUMBER=40, LINE_COMMENT=41, 
		WHITESPACE=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LP", "RP", "OF", "EQUALS", "DEFINE", "DOMAIN", "PROBLEM", "DDOMAIN", 
			"REQUIREMENTS", "TYPES", "CONSTANTS", "PREDICATES", "OBJECTS", "INIT", 
			"GOAL", "ACTION", "PARAMETERS", "PRECONDITION", "EFFECT", "OBSERVE", 
			"TASK", "METHOD", "ORDERED", "SUBTASKS", "ORDERING", "CONSTRAINTS", "HTN", 
			"BEFORE", "NOT", "AND", "FORALL", "WHEN", "EITHER", "UNKNOWN", "OR", 
			"ONEOF", "REQUIRE_KEY", "NAME", "LETTER", "ANY_CHAR", "VARIABLE", "NUMBER", 
			"DIGIT", "LINE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'-'", "'='", "'define'", "'domain'", "'problem'", 
			"':domain'", "':requirements'", "':types'", "':constants'", "':predicates'", 
			"':objects'", "':init'", "':goal'", "':action'", "':parameters'", "':precondition'", 
			"':effect'", "':observe'", "':task'", "':method'", null, null, null, 
			"':constraints'", "':htn'", "'<'", "'not'", "'and'", "'forall'", "'when'", 
			"'either'", "'unknown'", "'or'", "'oneof'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LP", "RP", "OF", "EQUALS", "DEFINE", "DOMAIN", "PROBLEM", "DDOMAIN", 
			"REQUIREMENTS", "TYPES", "CONSTANTS", "PREDICATES", "OBJECTS", "INIT", 
			"GOAL", "ACTION", "PARAMETERS", "PRECONDITION", "EFFECT", "OBSERVE", 
			"TASK", "METHOD", "ORDERED", "SUBTASKS", "ORDERING", "CONSTRAINTS", "HTN", 
			"BEFORE", "NOT", "AND", "FORALL", "WHEN", "EITHER", "UNKNOWN", "OR", 
			"ONEOF", "REQUIRE_KEY", "NAME", "VARIABLE", "NUMBER", "LINE_COMMENT", 
			"WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public PDDLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PDDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0304\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\5\30\u0125\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0136\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0147\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u02ca\n"+
		"&\3\'\3\'\7\'\u02ce\n\'\f\'\16\'\u02d1\13\'\3(\3(\3)\3)\5)\u02d7\n)\3"+
		"*\3*\3*\7*\u02dc\n*\f*\16*\u02df\13*\3+\6+\u02e2\n+\r+\16+\u02e3\3+\3"+
		"+\6+\u02e8\n+\r+\16+\u02e9\5+\u02ec\n+\3,\3,\3-\3-\7-\u02f2\n-\f-\16-"+
		"\u02f5\13-\3-\5-\u02f8\n-\3-\3-\3-\3-\3.\6.\u02ff\n.\r.\16.\u0300\3.\3"+
		".\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S)U*W\2Y+[,\3\2\6\4\2C\\c|\5\2//\62"+
		";aa\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u031e\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3"+
		"\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13e\3\2\2\2\rl\3\2\2\2\17s\3\2\2\2\21{\3"+
		"\2\2\2\23\u0083\3\2\2\2\25\u0091\3\2\2\2\27\u0098\3\2\2\2\31\u00a3\3\2"+
		"\2\2\33\u00af\3\2\2\2\35\u00b8\3\2\2\2\37\u00be\3\2\2\2!\u00c4\3\2\2\2"+
		"#\u00cc\3\2\2\2%\u00d8\3\2\2\2\'\u00e6\3\2\2\2)\u00ee\3\2\2\2+\u00f7\3"+
		"\2\2\2-\u00fd\3\2\2\2/\u0124\3\2\2\2\61\u0135\3\2\2\2\63\u0146\3\2\2\2"+
		"\65\u0148\3\2\2\2\67\u0155\3\2\2\29\u015a\3\2\2\2;\u015c\3\2\2\2=\u0160"+
		"\3\2\2\2?\u0164\3\2\2\2A\u016b\3\2\2\2C\u0170\3\2\2\2E\u0177\3\2\2\2G"+
		"\u017f\3\2\2\2I\u0182\3\2\2\2K\u02c9\3\2\2\2M\u02cb\3\2\2\2O\u02d2\3\2"+
		"\2\2Q\u02d6\3\2\2\2S\u02d8\3\2\2\2U\u02e1\3\2\2\2W\u02ed\3\2\2\2Y\u02ef"+
		"\3\2\2\2[\u02fe\3\2\2\2]^\7*\2\2^\4\3\2\2\2_`\7+\2\2`\6\3\2\2\2ab\7/\2"+
		"\2b\b\3\2\2\2cd\7?\2\2d\n\3\2\2\2ef\7f\2\2fg\7g\2\2gh\7h\2\2hi\7k\2\2"+
		"ij\7p\2\2jk\7g\2\2k\f\3\2\2\2lm\7f\2\2mn\7q\2\2no\7o\2\2op\7c\2\2pq\7"+
		"k\2\2qr\7p\2\2r\16\3\2\2\2st\7r\2\2tu\7t\2\2uv\7q\2\2vw\7d\2\2wx\7n\2"+
		"\2xy\7g\2\2yz\7o\2\2z\20\3\2\2\2{|\7<\2\2|}\7f\2\2}~\7q\2\2~\177\7o\2"+
		"\2\177\u0080\7c\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\22\3\2"+
		"\2\2\u0083\u0084\7<\2\2\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7s\2\2\u0087\u0088\7w\2\2\u0088\u0089\7k\2\2\u0089\u008a\7t\2\2\u008a"+
		"\u008b\7g\2\2\u008b\u008c\7o\2\2\u008c\u008d\7g\2\2\u008d\u008e\7p\2\2"+
		"\u008e\u008f\7v\2\2\u008f\u0090\7u\2\2\u0090\24\3\2\2\2\u0091\u0092\7"+
		"<\2\2\u0092\u0093\7v\2\2\u0093\u0094\7{\2\2\u0094\u0095\7r\2\2\u0095\u0096"+
		"\7g\2\2\u0096\u0097\7u\2\2\u0097\26\3\2\2\2\u0098\u0099\7<\2\2\u0099\u009a"+
		"\7e\2\2\u009a\u009b\7q\2\2\u009b\u009c\7p\2\2\u009c\u009d\7u\2\2\u009d"+
		"\u009e\7v\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7v\2\2"+
		"\u00a1\u00a2\7u\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\7<\2\2\u00a4\u00a5\7"+
		"r\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9"+
		"\7k\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\u00ae\7u\2\2\u00ae\32\3\2\2\2\u00af\u00b0\7<\2\2\u00b0"+
		"\u00b1\7q\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7l\2\2\u00b3\u00b4\7g\2\2"+
		"\u00b4\u00b5\7e\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7u\2\2\u00b7\34\3\2"+
		"\2\2\u00b8\u00b9\7<\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc"+
		"\7k\2\2\u00bc\u00bd\7v\2\2\u00bd\36\3\2\2\2\u00be\u00bf\7<\2\2\u00bf\u00c0"+
		"\7i\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		" \3\2\2\2\u00c4\u00c5\7<\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7e\2\2\u00c7"+
		"\u00c8\7v\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7p\2\2"+
		"\u00cb\"\3\2\2\2\u00cc\u00cd\7<\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7c"+
		"\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7o\2\2\u00d2\u00d3"+
		"\7g\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7t\2\2\u00d6"+
		"\u00d7\7u\2\2\u00d7$\3\2\2\2\u00d8\u00d9\7<\2\2\u00d9\u00da\7r\2\2\u00da"+
		"\u00db\7t\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7q\2\2"+
		"\u00de\u00df\7p\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2"+
		"\7v\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7p\2\2\u00e5"+
		"&\3\2\2\2\u00e6\u00e7\7<\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7h\2\2\u00e9"+
		"\u00ea\7h\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7v\2\2"+
		"\u00ed(\3\2\2\2\u00ee\u00ef\7<\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7d\2"+
		"\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5"+
		"\7x\2\2\u00f5\u00f6\7g\2\2\u00f6*\3\2\2\2\u00f7\u00f8\7<\2\2\u00f8\u00f9"+
		"\7v\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7m\2\2\u00fc"+
		",\3\2\2\2\u00fd\u00fe\7<\2\2\u00fe\u00ff\7o\2\2\u00ff\u0100\7g\2\2\u0100"+
		"\u0101\7v\2\2\u0101\u0102\7j\2\2\u0102\u0103\7q\2\2\u0103\u0104\7f\2\2"+
		"\u0104.\3\2\2\2\u0105\u0106\7<\2\2\u0106\u0107\7q\2\2\u0107\u0108\7t\2"+
		"\2\u0108\u0109\7f\2\2\u0109\u010a\7g\2\2\u010a\u010b\7t\2\2\u010b\u010c"+
		"\7g\2\2\u010c\u010d\7f\2\2\u010d\u010e\7/\2\2\u010e\u010f\7v\2\2\u010f"+
		"\u0110\7c\2\2\u0110\u0111\7u\2\2\u0111\u0112\7m\2\2\u0112\u0125\7u\2\2"+
		"\u0113\u0114\7<\2\2\u0114\u0115\7q\2\2\u0115\u0116\7t\2\2\u0116\u0117"+
		"\7f\2\2\u0117\u0118\7g\2\2\u0118\u0119\7t\2\2\u0119\u011a\7g\2\2\u011a"+
		"\u011b\7f\2\2\u011b\u011c\7/\2\2\u011c\u011d\7u\2\2\u011d\u011e\7w\2\2"+
		"\u011e\u011f\7d\2\2\u011f\u0120\7v\2\2\u0120\u0121\7c\2\2\u0121\u0122"+
		"\7u\2\2\u0122\u0123\7m\2\2\u0123\u0125\7u\2\2\u0124\u0105\3\2\2\2\u0124"+
		"\u0113\3\2\2\2\u0125\60\3\2\2\2\u0126\u0127\7<\2\2\u0127\u0128\7u\2\2"+
		"\u0128\u0129\7w\2\2\u0129\u012a\7d\2\2\u012a\u012b\7v\2\2\u012b\u012c"+
		"\7c\2\2\u012c\u012d\7u\2\2\u012d\u012e\7m\2\2\u012e\u0136\7u\2\2\u012f"+
		"\u0130\7<\2\2\u0130\u0131\7v\2\2\u0131\u0132\7c\2\2\u0132\u0133\7u\2\2"+
		"\u0133\u0134\7m\2\2\u0134\u0136\7u\2\2\u0135\u0126\3\2\2\2\u0135\u012f"+
		"\3\2\2\2\u0136\62\3\2\2\2\u0137\u0138\7<\2\2\u0138\u0139\7q\2\2\u0139"+
		"\u013a\7t\2\2\u013a\u013b\7f\2\2\u013b\u013c\7g\2\2\u013c\u0147\7t\2\2"+
		"\u013d\u013e\7<\2\2\u013e\u013f\7q\2\2\u013f\u0140\7t\2\2\u0140\u0141"+
		"\7f\2\2\u0141\u0142\7g\2\2\u0142\u0143\7t\2\2\u0143\u0144\7k\2\2\u0144"+
		"\u0145\7p\2\2\u0145\u0147\7i\2\2\u0146\u0137\3\2\2\2\u0146\u013d\3\2\2"+
		"\2\u0147\64\3\2\2\2\u0148\u0149\7<\2\2\u0149\u014a\7e\2\2\u014a\u014b"+
		"\7q\2\2\u014b\u014c\7p\2\2\u014c\u014d\7u\2\2\u014d\u014e\7v\2\2\u014e"+
		"\u014f\7t\2\2\u014f\u0150\7c\2\2\u0150\u0151\7k\2\2\u0151\u0152\7p\2\2"+
		"\u0152\u0153\7v\2\2\u0153\u0154\7u\2\2\u0154\66\3\2\2\2\u0155\u0156\7"+
		"<\2\2\u0156\u0157\7j\2\2\u0157\u0158\7v\2\2\u0158\u0159\7p\2\2\u01598"+
		"\3\2\2\2\u015a\u015b\7>\2\2\u015b:\3\2\2\2\u015c\u015d\7p\2\2\u015d\u015e"+
		"\7q\2\2\u015e\u015f\7v\2\2\u015f<\3\2\2\2\u0160\u0161\7c\2\2\u0161\u0162"+
		"\7p\2\2\u0162\u0163\7f\2\2\u0163>\3\2\2\2\u0164\u0165\7h\2\2\u0165\u0166"+
		"\7q\2\2\u0166\u0167\7t\2\2\u0167\u0168\7c\2\2\u0168\u0169\7n\2\2\u0169"+
		"\u016a\7n\2\2\u016a@\3\2\2\2\u016b\u016c\7y\2\2\u016c\u016d\7j\2\2\u016d"+
		"\u016e\7g\2\2\u016e\u016f\7p\2\2\u016fB\3\2\2\2\u0170\u0171\7g\2\2\u0171"+
		"\u0172\7k\2\2\u0172\u0173\7v\2\2\u0173\u0174\7j\2\2\u0174\u0175\7g\2\2"+
		"\u0175\u0176\7t\2\2\u0176D\3\2\2\2\u0177\u0178\7w\2\2\u0178\u0179\7p\2"+
		"\2\u0179\u017a\7m\2\2\u017a\u017b\7p\2\2\u017b\u017c\7q\2\2\u017c\u017d"+
		"\7y\2\2\u017d\u017e\7p\2\2\u017eF\3\2\2\2\u017f\u0180\7q\2\2\u0180\u0181"+
		"\7t\2\2\u0181H\3\2\2\2\u0182\u0183\7q\2\2\u0183\u0184\7p\2\2\u0184\u0185"+
		"\7g\2\2\u0185\u0186\7q\2\2\u0186\u0187\7h\2\2\u0187J\3\2\2\2\u0188\u0189"+
		"\7<\2\2\u0189\u018a\7u\2\2\u018a\u018b\7v\2\2\u018b\u018c\7t\2\2\u018c"+
		"\u018d\7k\2\2\u018d\u018e\7r\2\2\u018e\u02ca\7u\2\2\u018f\u0190\7<\2\2"+
		"\u0190\u0191\7v\2\2\u0191\u0192\7{\2\2\u0192\u0193\7r\2\2\u0193\u0194"+
		"\7k\2\2\u0194\u0195\7p\2\2\u0195\u02ca\7i\2\2\u0196\u0197\7<\2\2\u0197"+
		"\u0198\7p\2\2\u0198\u0199\7g\2\2\u0199\u019a\7i\2\2\u019a\u019b\7c\2\2"+
		"\u019b\u019c\7v\2\2\u019c\u019d\7k\2\2\u019d\u019e\7x\2\2\u019e\u019f"+
		"\7g\2\2\u019f\u01a0\7/\2\2\u01a0\u01a1\7r\2\2\u01a1\u01a2\7t\2\2\u01a2"+
		"\u01a3\7g\2\2\u01a3\u01a4\7e\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6\7p\2\2"+
		"\u01a6\u01a7\7f\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7v\2\2\u01a9\u01aa"+
		"\7k\2\2\u01aa\u01ab\7q\2\2\u01ab\u01ac\7p\2\2\u01ac\u02ca\7u\2\2\u01ad"+
		"\u01ae\7<\2\2\u01ae\u01af\7f\2\2\u01af\u01b0\7k\2\2\u01b0\u01b1\7u\2\2"+
		"\u01b1\u01b2\7l\2\2\u01b2\u01b3\7w\2\2\u01b3\u01b4\7p\2\2\u01b4\u01b5"+
		"\7e\2\2\u01b5\u01b6\7v\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7x\2\2\u01b8"+
		"\u01b9\7g\2\2\u01b9\u01ba\7/\2\2\u01ba\u01bb\7r\2\2\u01bb\u01bc\7t\2\2"+
		"\u01bc\u01bd\7g\2\2\u01bd\u01be\7e\2\2\u01be\u01bf\7q\2\2\u01bf\u01c0"+
		"\7p\2\2\u01c0\u01c1\7f\2\2\u01c1\u01c2\7k\2\2\u01c2\u01c3\7v\2\2\u01c3"+
		"\u01c4\7k\2\2\u01c4\u01c5\7q\2\2\u01c5\u01c6\7p\2\2\u01c6\u02ca\7u\2\2"+
		"\u01c7\u01c8\7<\2\2\u01c8\u01c9\7g\2\2\u01c9\u01ca\7s\2\2\u01ca\u01cb"+
		"\7w\2\2\u01cb\u01cc\7c\2\2\u01cc\u01cd\7n\2\2\u01cd\u01ce\7k\2\2\u01ce"+
		"\u01cf\7v\2\2\u01cf\u02ca\7{\2\2\u01d0\u01d1\7<\2\2\u01d1\u01d2\7g\2\2"+
		"\u01d2\u01d3\7z\2\2\u01d3\u01d4\7k\2\2\u01d4\u01d5\7u\2\2\u01d5\u01d6"+
		"\7v\2\2\u01d6\u01d7\7g\2\2\u01d7\u01d8\7p\2\2\u01d8\u01d9\7v\2\2\u01d9"+
		"\u01da\7k\2\2\u01da\u01db\7c\2\2\u01db\u01dc\7n\2\2\u01dc\u01dd\7/\2\2"+
		"\u01dd\u01de\7r\2\2\u01de\u01df\7t\2\2\u01df\u01e0\7g\2\2\u01e0\u01e1"+
		"\7e\2\2\u01e1\u01e2\7q\2\2\u01e2\u01e3\7p\2\2\u01e3\u01e4\7f\2\2\u01e4"+
		"\u01e5\7k\2\2\u01e5\u01e6\7v\2\2\u01e6\u01e7\7k\2\2\u01e7\u01e8\7q\2\2"+
		"\u01e8\u01e9\7p\2\2\u01e9\u02ca\7u\2\2\u01ea\u01eb\7<\2\2\u01eb\u01ec"+
		"\7w\2\2\u01ec\u01ed\7p\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef\7x\2\2\u01ef"+
		"\u01f0\7g\2\2\u01f0\u01f1\7t\2\2\u01f1\u01f2\7u\2\2\u01f2\u01f3\7c\2\2"+
		"\u01f3\u01f4\7n\2\2\u01f4\u01f5\7/\2\2\u01f5\u01f6\7r\2\2\u01f6\u01f7"+
		"\7t\2\2\u01f7\u01f8\7g\2\2\u01f8\u01f9\7e\2\2\u01f9\u01fa\7q\2\2\u01fa"+
		"\u01fb\7p\2\2\u01fb\u01fc\7f\2\2\u01fc\u01fd\7k\2\2\u01fd\u01fe\7v\2\2"+
		"\u01fe\u01ff\7k\2\2\u01ff\u0200\7q\2\2\u0200\u0201\7p\2\2\u0201\u02ca"+
		"\7u\2\2\u0202\u0203\7<\2\2\u0203\u0204\7w\2\2\u0204\u0205\7p\2\2\u0205"+
		"\u0206\7k\2\2\u0206\u0207\7x\2\2\u0207\u0208\7g\2\2\u0208\u0209\7t\2\2"+
		"\u0209\u020a\7u\2\2\u020a\u020b\7c\2\2\u020b\u020c\7n\2\2\u020c\u020d"+
		"\7/\2\2\u020d\u020e\7r\2\2\u020e\u020f\7t\2\2\u020f\u0210\7g\2\2\u0210"+
		"\u0211\7e\2\2\u0211\u0212\7q\2\2\u0212\u0213\7p\2\2\u0213\u0214\7f\2\2"+
		"\u0214\u0215\7k\2\2\u0215\u0216\7v\2\2\u0216\u0217\7k\2\2\u0217\u0218"+
		"\7q\2\2\u0218\u02ca\7p\2\2\u0219\u021a\7<\2\2\u021a\u021b\7s\2\2\u021b"+
		"\u021c\7w\2\2\u021c\u021d\7c\2\2\u021d\u021e\7p\2\2\u021e\u021f\7v\2\2"+
		"\u021f\u0220\7k\2\2\u0220\u0221\7h\2\2\u0221\u0222\7k\2\2\u0222\u0223"+
		"\7g\2\2\u0223\u0224\7f\2\2\u0224\u0225\7/\2\2\u0225\u0226\7r\2\2\u0226"+
		"\u0227\7t\2\2\u0227\u0228\7g\2\2\u0228\u0229\7e\2\2\u0229\u022a\7q\2\2"+
		"\u022a\u022b\7p\2\2\u022b\u022c\7f\2\2\u022c\u022d\7k\2\2\u022d\u022e"+
		"\7v\2\2\u022e\u022f\7k\2\2\u022f\u0230\7q\2\2\u0230\u0231\7p\2\2\u0231"+
		"\u02ca\7u\2\2\u0232\u0233\7<\2\2\u0233\u0234\7e\2\2\u0234\u0235\7q\2\2"+
		"\u0235\u0236\7p\2\2\u0236\u0237\7f\2\2\u0237\u0238\7k\2\2\u0238\u0239"+
		"\7v\2\2\u0239\u023a\7k\2\2\u023a\u023b\7q\2\2\u023b\u023c\7p\2\2\u023c"+
		"\u023d\7c\2\2\u023d\u023e\7n\2\2\u023e\u023f\7/\2\2\u023f\u0240\7g\2\2"+
		"\u0240\u0241\7h\2\2\u0241\u0242\7h\2\2\u0242\u0243\7g\2\2\u0243\u0244"+
		"\7e\2\2\u0244\u0245\7v\2\2\u0245\u02ca\7u\2\2\u0246\u0247\7<\2\2\u0247"+
		"\u0248\7h\2\2\u0248\u0249\7n\2\2\u0249\u024a\7w\2\2\u024a\u024b\7g\2\2"+
		"\u024b\u024c\7p\2\2\u024c\u024d\7v\2\2\u024d\u02ca\7u\2\2\u024e\u024f"+
		"\7<\2\2\u024f\u0250\7c\2\2\u0250\u0251\7f\2\2\u0251\u02ca\7n\2\2\u0252"+
		"\u0253\7<\2\2\u0253\u0254\7f\2\2\u0254\u0255\7w\2\2\u0255\u0256\7t\2\2"+
		"\u0256\u0257\7c\2\2\u0257\u0258\7v\2\2\u0258\u0259\7k\2\2\u0259\u025a"+
		"\7x\2\2\u025a\u025b\7g\2\2\u025b\u025c\7/\2\2\u025c\u025d\7c\2\2\u025d"+
		"\u025e\7e\2\2\u025e\u025f\7v\2\2\u025f\u0260\7k\2\2\u0260\u0261\7q\2\2"+
		"\u0261\u0262\7p\2\2\u0262\u02ca\7u\2\2\u0263\u0264\7<\2\2\u0264\u0265"+
		"\7f\2\2\u0265\u0266\7w\2\2\u0266\u0267\7t\2\2\u0267\u0268\7c\2\2\u0268"+
		"\u0269\7v\2\2\u0269\u026a\7k\2\2\u026a\u026b\7q\2\2\u026b\u026c\7p\2\2"+
		"\u026c\u026d\7/\2\2\u026d\u026e\7k\2\2\u026e\u026f\7p\2\2\u026f\u0270"+
		"\7g\2\2\u0270\u0271\7s\2\2\u0271\u0272\7w\2\2\u0272\u0273\7c\2\2\u0273"+
		"\u0274\7n\2\2\u0274\u0275\7k\2\2\u0275\u0276\7v\2\2\u0276\u0277\7k\2\2"+
		"\u0277\u0278\7g\2\2\u0278\u02ca\7u\2\2\u0279\u027a\7<\2\2\u027a\u027b"+
		"\7e\2\2\u027b\u027c\7q\2\2\u027c\u027d\7p\2\2\u027d\u027e\7v\2\2\u027e"+
		"\u027f\7k\2\2\u027f\u0280\7p\2\2\u0280\u0281\7w\2\2\u0281\u0282\7q\2\2"+
		"\u0282\u0283\7w\2\2\u0283\u0284\7u\2\2\u0284\u0285\7/\2\2\u0285\u0286"+
		"\7g\2\2\u0286\u0287\7h\2\2\u0287\u0288\7h\2\2\u0288\u0289\7g\2\2\u0289"+
		"\u028a\7e\2\2\u028a\u028b\7v\2\2\u028b\u02ca\7u\2\2\u028c\u028d\7<\2\2"+
		"\u028d\u028e\7j\2\2\u028e\u028f\7k\2\2\u028f\u0290\7g\2\2\u0290\u0291"+
		"\7t\2\2\u0291\u0292\7c\2\2\u0292\u0293\7e\2\2\u0293\u0294\7j\2\2\u0294"+
		"\u0295\7k\2\2\u0295\u02ca\7g\2\2\u0296\u0297\7<\2\2\u0297\u0298\7j\2\2"+
		"\u0298\u0299\7k\2\2\u0299\u029a\7g\2\2\u029a\u029b\7t\2\2\u029b\u029c"+
		"\7c\2\2\u029c\u029d\7t\2\2\u029d\u029e\7e\2\2\u029e\u029f\7j\2\2\u029f"+
		"\u02ca\7{\2\2\u02a0\u02a1\7<\2\2\u02a1\u02a2\7o\2\2\u02a2\u02a3\7g\2\2"+
		"\u02a3\u02a4\7v\2\2\u02a4\u02a5\7j\2\2\u02a5\u02a6\7q\2\2\u02a6\u02a7"+
		"\7f\2\2\u02a7\u02a8\7/\2\2\u02a8\u02a9\7r\2\2\u02a9\u02aa\7t\2\2\u02aa"+
		"\u02ab\7g\2\2\u02ab\u02ac\7e\2\2\u02ac\u02ad\7q\2\2\u02ad\u02ae\7p\2\2"+
		"\u02ae\u02af\7f\2\2\u02af\u02b0\7k\2\2\u02b0\u02b1\7v\2\2\u02b1\u02b2"+
		"\7k\2\2\u02b2\u02b3\7q\2\2\u02b3\u02ca\7p\2\2\u02b4\u02b5\7<\2\2\u02b5"+
		"\u02b6\7o\2\2\u02b6\u02b7\7g\2\2\u02b7\u02b8\7v\2\2\u02b8\u02b9\7j\2\2"+
		"\u02b9\u02ba\7q\2\2\u02ba\u02bb\7f\2\2\u02bb\u02bc\7/\2\2\u02bc\u02bd"+
		"\7r\2\2\u02bd\u02be\7t\2\2\u02be\u02bf\7g\2\2\u02bf\u02c0\7e\2\2\u02c0"+
		"\u02c1\7q\2\2\u02c1\u02c2\7p\2\2\u02c2\u02c3\7f\2\2\u02c3\u02c4\7k\2\2"+
		"\u02c4\u02c5\7v\2\2\u02c5\u02c6\7k\2\2\u02c6\u02c7\7q\2\2\u02c7\u02c8"+
		"\7p\2\2\u02c8\u02ca\7u\2\2\u02c9\u0188\3\2\2\2\u02c9\u018f\3\2\2\2\u02c9"+
		"\u0196\3\2\2\2\u02c9\u01ad\3\2\2\2\u02c9\u01c7\3\2\2\2\u02c9\u01d0\3\2"+
		"\2\2\u02c9\u01ea\3\2\2\2\u02c9\u0202\3\2\2\2\u02c9\u0219\3\2\2\2\u02c9"+
		"\u0232\3\2\2\2\u02c9\u0246\3\2\2\2\u02c9\u024e\3\2\2\2\u02c9\u0252\3\2"+
		"\2\2\u02c9\u0263\3\2\2\2\u02c9\u0279\3\2\2\2\u02c9\u028c\3\2\2\2\u02c9"+
		"\u0296\3\2\2\2\u02c9\u02a0\3\2\2\2\u02c9\u02b4\3\2\2\2\u02caL\3\2\2\2"+
		"\u02cb\u02cf\5O(\2\u02cc\u02ce\5Q)\2\u02cd\u02cc\3\2\2\2\u02ce\u02d1\3"+
		"\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0N\3\2\2\2\u02d1\u02cf"+
		"\3\2\2\2\u02d2\u02d3\t\2\2\2\u02d3P\3\2\2\2\u02d4\u02d7\5O(\2\u02d5\u02d7"+
		"\t\3\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7R\3\2\2\2\u02d8"+
		"\u02d9\7A\2\2\u02d9\u02dd\5O(\2\u02da\u02dc\5Q)\2\u02db\u02da\3\2\2\2"+
		"\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02deT\3"+
		"\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e2\5W,\2\u02e1\u02e0\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02eb\3\2"+
		"\2\2\u02e5\u02e7\7\60\2\2\u02e6\u02e8\5W,\2\u02e7\u02e6\3\2\2\2\u02e8"+
		"\u02e9\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2"+
		"\2\2\u02eb\u02e5\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ecV\3\2\2\2\u02ed\u02ee"+
		"\4\62;\2\u02eeX\3\2\2\2\u02ef\u02f3\7=\2\2\u02f0\u02f2\n\4\2\2\u02f1\u02f0"+
		"\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f8\7\17\2\2\u02f7\u02f6\3"+
		"\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\7\f\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02fc\b-\2\2\u02fcZ\3\2\2\2\u02fd\u02ff\t\5\2\2\u02fe"+
		"\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\u0302\3\2\2\2\u0302\u0303\b.\2\2\u0303\\\3\2\2\2\20\2\u0124"+
		"\u0135\u0146\u02c9\u02cf\u02d6\u02dd\u02e3\u02e9\u02eb\u02f3\u02f7\u0300"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
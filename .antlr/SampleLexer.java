// Generated from c:/Users/Administrator/Desktop/PPL/lab/Sample_Function_Call/POKE.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SampleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		IDENTIFIER=18, STRING=19, INT=20, FLOAT=21, BOOLEAN=22, WHITESPACE=23, 
		COMMENT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"IDENTIFIER", "STRING", "INT", "FLOAT", "BOOLEAN", "WHITESPACE", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pokemon'", "'{'", "'}'", "';'", "':'", "'move'", "'uses'", "'update'", 
			"'.'", "'to'", "'if'", "'('", "')'", "'<'", "'>'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "IDENTIFIER", "STRING", "INT", "FLOAT", 
			"BOOLEAN", "WHITESPACE", "COMMENT"
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


	public SampleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "POKE.g4"; }

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
		"\u0004\u0000\u0018\u00a5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011"+
		"k\b\u0011\n\u0011\f\u0011n\t\u0011\u0001\u0012\u0001\u0012\u0005\u0012"+
		"r\b\u0012\n\u0012\f\u0012u\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0004\u0013z\b\u0013\u000b\u0013\f\u0013{\u0001\u0014\u0004\u0014\u007f"+
		"\b\u0014\u000b\u0014\f\u0014\u0080\u0001\u0014\u0001\u0014\u0004\u0014"+
		"\u0085\b\u0014\u000b\u0014\f\u0014\u0086\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0092\b\u0015\u0001\u0016\u0004\u0016\u0095\b\u0016"+
		"\u000b\u0016\f\u0016\u0096\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u009f\b\u0017\n\u0017\f\u0017\u00a2"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001s\u0000\u0018\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000"+
		"\u0005\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  \u0002\u0000\n\n\r\r\u00ac\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001"+
		"\u0000\u0000\u0000\u00039\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000"+
		"\u0000\u0007=\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000b"+
		"A\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000fK\u0001\u0000"+
		"\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013T\u0001\u0000\u0000\u0000"+
		"\u0015W\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019\\"+
		"\u0001\u0000\u0000\u0000\u001b^\u0001\u0000\u0000\u0000\u001d`\u0001\u0000"+
		"\u0000\u0000\u001fb\u0001\u0000\u0000\u0000!e\u0001\u0000\u0000\u0000"+
		"#h\u0001\u0000\u0000\u0000%o\u0001\u0000\u0000\u0000\'y\u0001\u0000\u0000"+
		"\u0000)~\u0001\u0000\u0000\u0000+\u0091\u0001\u0000\u0000\u0000-\u0094"+
		"\u0001\u0000\u0000\u0000/\u009a\u0001\u0000\u0000\u000012\u0005p\u0000"+
		"\u000023\u0005o\u0000\u000034\u0005k\u0000\u000045\u0005e\u0000\u0000"+
		"56\u0005m\u0000\u000067\u0005o\u0000\u000078\u0005n\u0000\u00008\u0002"+
		"\u0001\u0000\u0000\u00009:\u0005{\u0000\u0000:\u0004\u0001\u0000\u0000"+
		"\u0000;<\u0005}\u0000\u0000<\u0006\u0001\u0000\u0000\u0000=>\u0005;\u0000"+
		"\u0000>\b\u0001\u0000\u0000\u0000?@\u0005:\u0000\u0000@\n\u0001\u0000"+
		"\u0000\u0000AB\u0005m\u0000\u0000BC\u0005o\u0000\u0000CD\u0005v\u0000"+
		"\u0000DE\u0005e\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005u\u0000"+
		"\u0000GH\u0005s\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005s\u0000\u0000"+
		"J\u000e\u0001\u0000\u0000\u0000KL\u0005u\u0000\u0000LM\u0005p\u0000\u0000"+
		"MN\u0005d\u0000\u0000NO\u0005a\u0000\u0000OP\u0005t\u0000\u0000PQ\u0005"+
		"e\u0000\u0000Q\u0010\u0001\u0000\u0000\u0000RS\u0005.\u0000\u0000S\u0012"+
		"\u0001\u0000\u0000\u0000TU\u0005t\u0000\u0000UV\u0005o\u0000\u0000V\u0014"+
		"\u0001\u0000\u0000\u0000WX\u0005i\u0000\u0000XY\u0005f\u0000\u0000Y\u0016"+
		"\u0001\u0000\u0000\u0000Z[\u0005(\u0000\u0000[\u0018\u0001\u0000\u0000"+
		"\u0000\\]\u0005)\u0000\u0000]\u001a\u0001\u0000\u0000\u0000^_\u0005<\u0000"+
		"\u0000_\u001c\u0001\u0000\u0000\u0000`a\u0005>\u0000\u0000a\u001e\u0001"+
		"\u0000\u0000\u0000bc\u0005=\u0000\u0000cd\u0005=\u0000\u0000d \u0001\u0000"+
		"\u0000\u0000ef\u0005!\u0000\u0000fg\u0005=\u0000\u0000g\"\u0001\u0000"+
		"\u0000\u0000hl\u0007\u0000\u0000\u0000ik\u0007\u0001\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000m$\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000os\u0005\"\u0000\u0000pr\t\u0000\u0000\u0000qp\u0001\u0000\u0000"+
		"\u0000ru\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0005"+
		"\"\u0000\u0000w&\u0001\u0000\u0000\u0000xz\u0007\u0002\u0000\u0000yx\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|(\u0001\u0000\u0000\u0000}\u007f\u0007\u0002"+
		"\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0005.\u0000\u0000\u0083\u0085"+
		"\u0007\u0002\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087*\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"t\u0000\u0000\u0089\u008a\u0005r\u0000\u0000\u008a\u008b\u0005u\u0000"+
		"\u0000\u008b\u0092\u0005e\u0000\u0000\u008c\u008d\u0005f\u0000\u0000\u008d"+
		"\u008e\u0005a\u0000\u0000\u008e\u008f\u0005l\u0000\u0000\u008f\u0090\u0005"+
		"s\u0000\u0000\u0090\u0092\u0005e\u0000\u0000\u0091\u0088\u0001\u0000\u0000"+
		"\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0092,\u0001\u0000\u0000\u0000"+
		"\u0093\u0095\u0007\u0003\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0006\u0016\u0000\u0000\u0099.\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005/\u0000\u0000\u009b\u009c\u0005/\u0000\u0000\u009c\u00a0\u0001"+
		"\u0000\u0000\u0000\u009d\u009f\b\u0004\u0000\u0000\u009e\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006\u0017"+
		"\u0000\u0000\u00a40\u0001\u0000\u0000\u0000\t\u0000ls{\u0080\u0086\u0091"+
		"\u0096\u00a0\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
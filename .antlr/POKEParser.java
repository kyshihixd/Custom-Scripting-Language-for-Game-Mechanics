// Generated from c:/Users/Administrator/Desktop/PPL/lab/PROJECTFINAL/POKE.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class POKEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, STRING=29, INT=30, FLOAT=31, BOOLEAN=32, 
		RANDOM=33, IDENTIFIER=34, WHITESPACE=35, COMMENT=36;
	public static final int
		RULE_script = 0, RULE_statement = 1, RULE_pokemon = 2, RULE_pokemon_body = 3, 
		RULE_pokemon_attribute = 4, RULE_move = 5, RULE_move_body = 6, RULE_move_attribute = 7, 
		RULE_action_statement = 8, RULE_trigger_statement = 9, RULE_trigger_condition = 10, 
		RULE_trigger_elif = 11, RULE_trigger_else = 12, RULE_trigger_action = 13, 
		RULE_arithmatic = 14, RULE_term = 15, RULE_factor = 16, RULE_status = 17, 
		RULE_update_attr_statement = 18, RULE_condition = 19, RULE_expression = 20, 
		RULE_comparison_operator = 21, RULE_value = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "statement", "pokemon", "pokemon_body", "pokemon_attribute", 
			"move", "move_body", "move_attribute", "action_statement", "trigger_statement", 
			"trigger_condition", "trigger_elif", "trigger_else", "trigger_action", 
			"arithmatic", "term", "factor", "status", "update_attr_statement", "condition", 
			"expression", "comparison_operator", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pokemon'", "'{'", "'}'", "';'", "':'", "'move'", "'uses'", "'on'", 
			"'trigger'", "'('", "','", "')'", "'if'", "'else'", "'elif'", "'.'", 
			"'='", "'+'", "'-'", "'/'", "'*'", "'status'", "'update'", "'to'", "'<'", 
			"'>'", "'=='", "'!='", null, null, null, null, "'random'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "STRING", "INT", "FLOAT", "BOOLEAN", "RANDOM", 
			"IDENTIFIER", "WHITESPACE", "COMMENT"
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

	@Override
	public String getGrammarFileName() { return "POKE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public POKEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17192452674L) != 0)) {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public PokemonContext pokemon() {
			return getRuleContext(PokemonContext.class,0);
		}
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public Action_statementContext action_statement() {
			return getRuleContext(Action_statementContext.class,0);
		}
		public Update_attr_statementContext update_attr_statement() {
			return getRuleContext(Update_attr_statementContext.class,0);
		}
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public Trigger_statementContext trigger_statement() {
			return getRuleContext(Trigger_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				pokemon();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				move();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				action_statement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				update_attr_statement();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				status();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				trigger_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PokemonContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(POKEParser.IDENTIFIER, 0); }
		public Pokemon_bodyContext pokemon_body() {
			return getRuleContext(Pokemon_bodyContext.class,0);
		}
		public PokemonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokemon; }
	}

	public final PokemonContext pokemon() throws RecognitionException {
		PokemonContext _localctx = new PokemonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pokemon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__0);
			setState(61);
			match(IDENTIFIER);
			setState(62);
			match(T__1);
			setState(63);
			pokemon_body();
			setState(64);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pokemon_bodyContext extends ParserRuleContext {
		public List<Pokemon_attributeContext> pokemon_attribute() {
			return getRuleContexts(Pokemon_attributeContext.class);
		}
		public Pokemon_attributeContext pokemon_attribute(int i) {
			return getRuleContext(Pokemon_attributeContext.class,i);
		}
		public Pokemon_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokemon_body; }
	}

	public final Pokemon_bodyContext pokemon_body() throws RecognitionException {
		Pokemon_bodyContext _localctx = new Pokemon_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pokemon_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(66);
				pokemon_attribute();
				setState(67);
				match(T__3);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pokemon_attributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(POKEParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Pokemon_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokemon_attribute; }
	}

	public final Pokemon_attributeContext pokemon_attribute() throws RecognitionException {
		Pokemon_attributeContext _localctx = new Pokemon_attributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pokemon_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IDENTIFIER);
			setState(75);
			match(T__4);
			setState(76);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MoveContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(POKEParser.IDENTIFIER, 0); }
		public Move_bodyContext move_body() {
			return getRuleContext(Move_bodyContext.class,0);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__5);
			setState(79);
			match(IDENTIFIER);
			setState(80);
			match(T__1);
			setState(81);
			move_body();
			setState(82);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Move_bodyContext extends ParserRuleContext {
		public List<Move_attributeContext> move_attribute() {
			return getRuleContexts(Move_attributeContext.class);
		}
		public Move_attributeContext move_attribute(int i) {
			return getRuleContext(Move_attributeContext.class,i);
		}
		public Move_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_body; }
	}

	public final Move_bodyContext move_body() throws RecognitionException {
		Move_bodyContext _localctx = new Move_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_move_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(84);
				move_attribute();
				setState(85);
				match(T__3);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Move_attributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(POKEParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Move_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_attribute; }
	}

	public final Move_attributeContext move_attribute() throws RecognitionException {
		Move_attributeContext _localctx = new Move_attributeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_move_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(T__4);
			setState(94);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Action_statementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(POKEParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(POKEParser.IDENTIFIER, i);
		}
		public Action_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_statement; }
	}

	public final Action_statementContext action_statement() throws RecognitionException {
		Action_statementContext _localctx = new Action_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_action_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IDENTIFIER);
			setState(97);
			match(T__6);
			setState(98);
			match(IDENTIFIER);
			setState(99);
			match(T__7);
			setState(100);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Trigger_statementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(POKEParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(POKEParser.IDENTIFIER, i);
		}
		public List<Trigger_actionContext> trigger_action() {
			return getRuleContexts(Trigger_actionContext.class);
		}
		public Trigger_actionContext trigger_action(int i) {
			return getRuleContext(Trigger_actionContext.class,i);
		}
		public List<Trigger_conditionContext> trigger_condition() {
			return getRuleContexts(Trigger_conditionContext.class);
		}
		public Trigger_conditionContext trigger_condition(int i) {
			return getRuleContext(Trigger_conditionContext.class,i);
		}
		public Trigger_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_statement; }
	}

	public final Trigger_statementContext trigger_statement() throws RecognitionException {
		Trigger_statementContext _localctx = new Trigger_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_trigger_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__8);
			setState(103);
			match(IDENTIFIER);
			setState(104);
			match(T__9);
			setState(105);
			match(IDENTIFIER);
			setState(106);
			match(T__10);
			setState(107);
			match(IDENTIFIER);
			setState(108);
			match(T__11);
			setState(109);
			match(T__1);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==IDENTIFIER) {
				{
				{
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(110);
					trigger_action();
					}
					break;
				case T__12:
					{
					setState(111);
					trigger_condition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114);
				match(T__3);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Trigger_conditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<Trigger_actionContext> trigger_action() {
			return getRuleContexts(Trigger_actionContext.class);
		}
		public Trigger_actionContext trigger_action(int i) {
			return getRuleContext(Trigger_actionContext.class,i);
		}
		public List<Trigger_elifContext> trigger_elif() {
			return getRuleContexts(Trigger_elifContext.class);
		}
		public Trigger_elifContext trigger_elif(int i) {
			return getRuleContext(Trigger_elifContext.class,i);
		}
		public List<Trigger_elseContext> trigger_else() {
			return getRuleContexts(Trigger_elseContext.class);
		}
		public Trigger_elseContext trigger_else(int i) {
			return getRuleContext(Trigger_elseContext.class,i);
		}
		public Trigger_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_condition; }
	}

	public final Trigger_conditionContext trigger_condition() throws RecognitionException {
		Trigger_conditionContext _localctx = new Trigger_conditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_trigger_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__12);
			setState(124);
			match(T__9);
			setState(125);
			condition();
			setState(126);
			match(T__11);
			setState(127);
			match(T__1);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(128);
				trigger_action();
				setState(129);
				match(T__3);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(T__2);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(137);
				trigger_elif();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(143);
				match(T__13);
				setState(144);
				match(T__1);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(145);
					trigger_else();
					setState(146);
					match(T__3);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__2);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class Trigger_elifContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<Trigger_actionContext> trigger_action() {
			return getRuleContexts(Trigger_actionContext.class);
		}
		public Trigger_actionContext trigger_action(int i) {
			return getRuleContext(Trigger_actionContext.class,i);
		}
		public Trigger_elifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_elif; }
	}

	public final Trigger_elifContext trigger_elif() throws RecognitionException {
		Trigger_elifContext _localctx = new Trigger_elifContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_trigger_elif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__14);
			setState(157);
			match(T__9);
			setState(158);
			condition();
			setState(159);
			match(T__11);
			setState(160);
			match(T__1);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(161);
				trigger_action();
				setState(162);
				match(T__3);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Trigger_elseContext extends ParserRuleContext {
		public Trigger_actionContext trigger_action() {
			return getRuleContext(Trigger_actionContext.class,0);
		}
		public Trigger_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_else; }
	}

	public final Trigger_elseContext trigger_else() throws RecognitionException {
		Trigger_elseContext _localctx = new Trigger_elseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_trigger_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			trigger_action();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Trigger_actionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(POKEParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(POKEParser.IDENTIFIER, i);
		}
		public ArithmaticContext arithmatic() {
			return getRuleContext(ArithmaticContext.class,0);
		}
		public Trigger_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_action; }
	}

	public final Trigger_actionContext trigger_action() throws RecognitionException {
		Trigger_actionContext _localctx = new Trigger_actionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_trigger_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(IDENTIFIER);
			setState(174);
			match(T__15);
			setState(175);
			match(IDENTIFIER);
			setState(176);
			match(T__16);
			setState(177);
			arithmatic(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmaticContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArithmaticContext arithmatic() {
			return getRuleContext(ArithmaticContext.class,0);
		}
		public ArithmaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmatic; }
	}

	public final ArithmaticContext arithmatic() throws RecognitionException {
		return arithmatic(0);
	}

	private ArithmaticContext arithmatic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmaticContext _localctx = new ArithmaticContext(_ctx, _parentState);
		ArithmaticContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_arithmatic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmaticContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmatic);
					setState(182);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(183);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(184);
					term(0);
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(191);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(193);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(194);
					_la = _input.LA(1);
					if ( !(_la==T__19 || _la==T__20) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(195);
					factor();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public ArithmaticContext arithmatic() {
			return getRuleContext(ArithmaticContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(POKEParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(POKEParser.IDENTIFIER, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(T__9);
				setState(202);
				arithmatic(0);
				setState(203);
				match(T__11);
				}
				break;
			case STRING:
			case INT:
			case FLOAT:
			case BOOLEAN:
			case RANDOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				value();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(IDENTIFIER);
				setState(207);
				match(T__15);
				setState(208);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatusContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(POKEParser.IDENTIFIER, 0); }
		public StatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status; }
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_status);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__21);
			setState(212);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Update_attr_statementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(POKEParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(POKEParser.IDENTIFIER, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Update_attr_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_attr_statement; }
	}

	public final Update_attr_statementContext update_attr_statement() throws RecognitionException {
		Update_attr_statementContext _localctx = new Update_attr_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_update_attr_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__22);
			setState(215);
			match(IDENTIFIER);
			setState(216);
			match(T__15);
			setState(217);
			match(IDENTIFIER);
			setState(218);
			match(T__23);
			setState(219);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			expression();
			setState(222);
			comparison_operator();
			setState(223);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(POKEParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(POKEParser.IDENTIFIER, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(IDENTIFIER);
				setState(226);
				match(T__15);
				setState(227);
				match(IDENTIFIER);
				}
				break;
			case STRING:
			case INT:
			case FLOAT:
			case BOOLEAN:
			case RANDOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comparison_operatorContext extends ParserRuleContext {
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode RANDOM() { return getToken(POKEParser.RANDOM, 0); }
		public TerminalNode INT() { return getToken(POKEParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(POKEParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(POKEParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(POKEParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16642998272L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return arithmatic_sempred((ArithmaticContext)_localctx, predIndex);
		case 15:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmatic_sempred(ArithmaticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u00ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003F\b\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"X\b\u0006\n\u0006\f\u0006[\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tq\b\t\u0001\t\u0001\t\u0005\tu\b\t\n\t\f\tx\t\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0084"+
		"\b\n\n\n\f\n\u0087\t\n\u0001\n\u0001\n\u0005\n\u008b\b\n\n\n\f\n\u008e"+
		"\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0095\b\n\n\n\f\n"+
		"\u0098\t\n\u0001\n\u0003\n\u009b\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00a5\b\u000b\n\u000b\f\u000b\u00a8\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00ba\b\u000e\n\u000e\f\u000e\u00bd\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00c5\b\u000f\n"+
		"\u000f\f\u000f\u00c8\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d2"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00e6\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0000\u0002\u001c\u001e\u0017\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000"+
		"\u0004\u0001\u0000\u0012\u0013\u0001\u0000\u0014\u0015\u0001\u0000\u0019"+
		"\u001c\u0001\u0000\u001d!\u00e8\u00001\u0001\u0000\u0000\u0000\u0002:"+
		"\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006G\u0001\u0000"+
		"\u0000\u0000\bJ\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fY"+
		"\u0001\u0000\u0000\u0000\u000e\\\u0001\u0000\u0000\u0000\u0010`\u0001"+
		"\u0000\u0000\u0000\u0012f\u0001\u0000\u0000\u0000\u0014{\u0001\u0000\u0000"+
		"\u0000\u0016\u009c\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000\u0000"+
		"\u0000\u001a\u00ad\u0001\u0000\u0000\u0000\u001c\u00b3\u0001\u0000\u0000"+
		"\u0000\u001e\u00be\u0001\u0000\u0000\u0000 \u00d1\u0001\u0000\u0000\u0000"+
		"\"\u00d3\u0001\u0000\u0000\u0000$\u00d6\u0001\u0000\u0000\u0000&\u00dd"+
		"\u0001\u0000\u0000\u0000(\u00e5\u0001\u0000\u0000\u0000*\u00e7\u0001\u0000"+
		"\u0000\u0000,\u00e9\u0001\u0000\u0000\u0000.0\u0003\u0002\u0001\u0000"+
		"/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u00002\u0001\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u00004;\u0003\u0004\u0002\u00005;\u0003\n\u0005\u00006;\u0003"+
		"\u0010\b\u00007;\u0003$\u0012\u00008;\u0003\"\u0011\u00009;\u0003\u0012"+
		"\t\u0000:4\u0001\u0000\u0000\u0000:5\u0001\u0000\u0000\u0000:6\u0001\u0000"+
		"\u0000\u0000:7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:9\u0001"+
		"\u0000\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0005\u0001\u0000"+
		"\u0000=>\u0005\"\u0000\u0000>?\u0005\u0002\u0000\u0000?@\u0003\u0006\u0003"+
		"\u0000@A\u0005\u0003\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0003"+
		"\b\u0004\u0000CD\u0005\u0004\u0000\u0000DF\u0001\u0000\u0000\u0000EB\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000JK\u0005\"\u0000\u0000KL\u0005\u0005\u0000\u0000LM\u0003,"+
		"\u0016\u0000M\t\u0001\u0000\u0000\u0000NO\u0005\u0006\u0000\u0000OP\u0005"+
		"\"\u0000\u0000PQ\u0005\u0002\u0000\u0000QR\u0003\f\u0006\u0000RS\u0005"+
		"\u0003\u0000\u0000S\u000b\u0001\u0000\u0000\u0000TU\u0003\u000e\u0007"+
		"\u0000UV\u0005\u0004\u0000\u0000VX\u0001\u0000\u0000\u0000WT\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\r\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\]\u0005\"\u0000\u0000]^\u0005\u0005\u0000\u0000^_\u0003,\u0016\u0000"+
		"_\u000f\u0001\u0000\u0000\u0000`a\u0005\"\u0000\u0000ab\u0005\u0007\u0000"+
		"\u0000bc\u0005\"\u0000\u0000cd\u0005\b\u0000\u0000de\u0005\"\u0000\u0000"+
		"e\u0011\u0001\u0000\u0000\u0000fg\u0005\t\u0000\u0000gh\u0005\"\u0000"+
		"\u0000hi\u0005\n\u0000\u0000ij\u0005\"\u0000\u0000jk\u0005\u000b\u0000"+
		"\u0000kl\u0005\"\u0000\u0000lm\u0005\f\u0000\u0000mv\u0005\u0002\u0000"+
		"\u0000nq\u0003\u001a\r\u0000oq\u0003\u0014\n\u0000pn\u0001\u0000\u0000"+
		"\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005\u0004"+
		"\u0000\u0000su\u0001\u0000\u0000\u0000tp\u0001\u0000\u0000\u0000ux\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005\u0003\u0000"+
		"\u0000z\u0013\u0001\u0000\u0000\u0000{|\u0005\r\u0000\u0000|}\u0005\n"+
		"\u0000\u0000}~\u0003&\u0013\u0000~\u007f\u0005\f\u0000\u0000\u007f\u0085"+
		"\u0005\u0002\u0000\u0000\u0080\u0081\u0003\u001a\r\u0000\u0081\u0082\u0005"+
		"\u0004\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0080\u0001"+
		"\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008c\u0005"+
		"\u0003\u0000\u0000\u0089\u008b\u0003\u0016\u000b\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u009a\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"\u000e\u0000\u0000\u0090\u0096\u0005\u0002\u0000\u0000\u0091\u0092\u0003"+
		"\u0018\f\u0000\u0092\u0093\u0005\u0004\u0000\u0000\u0093\u0095\u0001\u0000"+
		"\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0005\u0003\u0000\u0000\u009a\u008f\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0015\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u000f\u0000\u0000\u009d\u009e\u0005\n\u0000"+
		"\u0000\u009e\u009f\u0003&\u0013\u0000\u009f\u00a0\u0005\f\u0000\u0000"+
		"\u00a0\u00a6\u0005\u0002\u0000\u0000\u00a1\u00a2\u0003\u001a\r\u0000\u00a2"+
		"\u00a3\u0005\u0004\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005\u0003\u0000\u0000\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0003\u001a\r\u0000\u00ac\u0019\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005\"\u0000\u0000\u00ae\u00af\u0005\u0010\u0000\u0000\u00af\u00b0\u0005"+
		"\"\u0000\u0000\u00b0\u00b1\u0005\u0011\u0000\u0000\u00b1\u00b2\u0003\u001c"+
		"\u000e\u0000\u00b2\u001b\u0001\u0000\u0000\u0000\u00b3\u00b4\u0006\u000e"+
		"\uffff\uffff\u0000\u00b4\u00b5\u0003\u001e\u000f\u0000\u00b5\u00bb\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\n\u0002\u0000\u0000\u00b7\u00b8\u0007\u0000"+
		"\u0000\u0000\u00b8\u00ba\u0003\u001e\u000f\u0000\u00b9\u00b6\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u001d\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00bf\u0006\u000f"+
		"\uffff\uffff\u0000\u00bf\u00c0\u0003 \u0010\u0000\u00c0\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\n\u0002\u0000\u0000\u00c2\u00c3\u0007\u0001\u0000"+
		"\u0000\u00c3\u00c5\u0003 \u0010\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u001f\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\n\u0000\u0000\u00ca"+
		"\u00cb\u0003\u001c\u000e\u0000\u00cb\u00cc\u0005\f\u0000\u0000\u00cc\u00d2"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d2\u0003,\u0016\u0000\u00ce\u00cf\u0005"+
		"\"\u0000\u0000\u00cf\u00d0\u0005\u0010\u0000\u0000\u00d0\u00d2\u0005\""+
		"\u0000\u0000\u00d1\u00c9\u0001\u0000\u0000\u0000\u00d1\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d2!\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0016\u0000\u0000\u00d4\u00d5\u0005\"\u0000\u0000"+
		"\u00d5#\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0017\u0000\u0000\u00d7"+
		"\u00d8\u0005\"\u0000\u0000\u00d8\u00d9\u0005\u0010\u0000\u0000\u00d9\u00da"+
		"\u0005\"\u0000\u0000\u00da\u00db\u0005\u0018\u0000\u0000\u00db\u00dc\u0003"+
		"(\u0014\u0000\u00dc%\u0001\u0000\u0000\u0000\u00dd\u00de\u0003(\u0014"+
		"\u0000\u00de\u00df\u0003*\u0015\u0000\u00df\u00e0\u0003(\u0014\u0000\u00e0"+
		"\'\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\"\u0000\u0000\u00e2\u00e3"+
		"\u0005\u0010\u0000\u0000\u00e3\u00e6\u0005\"\u0000\u0000\u00e4\u00e6\u0003"+
		",\u0016\u0000\u00e5\u00e1\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e6)\u0001\u0000\u0000\u0000\u00e7\u00e8\u0007\u0002\u0000"+
		"\u0000\u00e8+\u0001\u0000\u0000\u0000\u00e9\u00ea\u0007\u0003\u0000\u0000"+
		"\u00ea-\u0001\u0000\u0000\u0000\u000f1:GYpv\u0085\u008c\u0096\u009a\u00a6"+
		"\u00bb\u00c6\u00d1\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
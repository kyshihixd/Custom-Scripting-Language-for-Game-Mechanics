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
		T__24=25, T__25=26, T__26=27, T__27=28, IDENTIFIER=29, STRING=30, INT=31, 
		FLOAT=32, BOOLEAN=33, WHITESPACE=34, COMMENT=35;
	public static final int
		RULE_script = 0, RULE_statement = 1, RULE_pokemon = 2, RULE_pokemon_body = 3, 
		RULE_pokemon_attribute = 4, RULE_move = 5, RULE_move_body = 6, RULE_move_attribute = 7, 
		RULE_action_statement = 8, RULE_trigger_statement = 9, RULE_trigger_condition = 10, 
		RULE_trigger_elif = 11, RULE_trigger_else = 12, RULE_trigger_action = 13, 
		RULE_arithmatic = 14, RULE_term = 15, RULE_factor = 16, RULE_status = 17, 
		RULE_update_attr_statement = 18, RULE_condition_statement = 19, RULE_condition = 20, 
		RULE_expression = 21, RULE_comparison_operator = 22, RULE_value = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "statement", "pokemon", "pokemon_body", "pokemon_attribute", 
			"move", "move_body", "move_attribute", "action_statement", "trigger_statement", 
			"trigger_condition", "trigger_elif", "trigger_else", "trigger_action", 
			"arithmatic", "term", "factor", "status", "update_attr_statement", "condition_statement", 
			"condition", "expression", "comparison_operator", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pokemon'", "'{'", "'}'", "';'", "':'", "'move'", "'uses'", "'on'", 
			"'trigger'", "'('", "','", "')'", "'if'", "'else'", "'elif'", "'.'", 
			"'='", "'+'", "'-'", "'/'", "'*'", "'status'", "'update'", "'to'", "'<'", 
			"'>'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "IDENTIFIER", "STRING", "INT", "FLOAT", 
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549462594L) != 0)) {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(53);
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
		public Condition_statementContext condition_statement() {
			return getRuleContext(Condition_statementContext.class,0);
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
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				pokemon();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				move();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				action_statement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				condition_statement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				update_attr_statement();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				status();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
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
			setState(63);
			match(T__0);
			setState(64);
			match(IDENTIFIER);
			setState(65);
			match(T__1);
			setState(66);
			pokemon_body();
			setState(67);
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
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(69);
				pokemon_attribute();
				setState(70);
				match(T__3);
				}
				}
				setState(76);
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
			setState(77);
			match(IDENTIFIER);
			setState(78);
			match(T__4);
			setState(79);
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
			setState(81);
			match(T__5);
			setState(82);
			match(IDENTIFIER);
			setState(83);
			match(T__1);
			setState(84);
			move_body();
			setState(85);
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
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(87);
				move_attribute();
				setState(88);
				match(T__3);
				}
				}
				setState(94);
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
			setState(95);
			match(IDENTIFIER);
			setState(96);
			match(T__4);
			setState(97);
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
			setState(99);
			match(IDENTIFIER);
			setState(100);
			match(T__6);
			setState(101);
			match(IDENTIFIER);
			setState(102);
			match(T__7);
			setState(103);
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
			setState(105);
			match(T__8);
			setState(106);
			match(IDENTIFIER);
			setState(107);
			match(T__9);
			setState(108);
			match(IDENTIFIER);
			setState(109);
			match(T__10);
			setState(110);
			match(IDENTIFIER);
			setState(111);
			match(T__11);
			setState(112);
			match(T__1);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==IDENTIFIER) {
				{
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(113);
					trigger_action();
					}
					break;
				case T__12:
					{
					setState(114);
					trigger_condition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(117);
				match(T__3);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
			setState(126);
			match(T__12);
			setState(127);
			match(T__9);
			setState(128);
			condition();
			setState(129);
			match(T__11);
			setState(130);
			match(T__1);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(131);
				trigger_action();
				setState(132);
				match(T__3);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(T__2);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(140);
				trigger_elif();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(146);
				match(T__13);
				setState(147);
				match(T__1);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(148);
					trigger_else();
					setState(149);
					match(T__3);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
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
			setState(159);
			match(T__14);
			setState(160);
			match(T__9);
			setState(161);
			condition();
			setState(162);
			match(T__11);
			setState(163);
			match(T__1);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(164);
				trigger_action();
				setState(165);
				match(T__3);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
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
			setState(174);
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
			setState(176);
			match(IDENTIFIER);
			setState(177);
			match(T__15);
			setState(178);
			match(IDENTIFIER);
			setState(179);
			match(T__16);
			setState(180);
			arithmatic();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArithmaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmatic; }
	}

	public final ArithmaticContext arithmatic() throws RecognitionException {
		ArithmaticContext _localctx = new ArithmaticContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arithmatic);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				expression();
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				term(0);
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
			setState(190);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
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
					setState(192);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(193);
					_la = _input.LA(1);
					if ( !(_la==T__19 || _la==T__20) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(194);
					factor();
					}
					} 
				}
				setState(199);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__9);
				setState(201);
				expression();
				setState(202);
				match(T__11);
				}
				break;
			case STRING:
			case INT:
			case FLOAT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				value();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(IDENTIFIER);
				setState(206);
				match(T__15);
				setState(207);
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
			setState(210);
			match(T__21);
			setState(211);
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
			setState(213);
			match(T__22);
			setState(214);
			match(IDENTIFIER);
			setState(215);
			match(T__15);
			setState(216);
			match(IDENTIFIER);
			setState(217);
			match(T__23);
			setState(218);
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
	public static class Condition_statementContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<Action_statementContext> action_statement() {
			return getRuleContexts(Action_statementContext.class);
		}
		public Action_statementContext action_statement(int i) {
			return getRuleContext(Action_statementContext.class,i);
		}
		public List<Condition_statementContext> condition_statement() {
			return getRuleContexts(Condition_statementContext.class);
		}
		public Condition_statementContext condition_statement(int i) {
			return getRuleContext(Condition_statementContext.class,i);
		}
		public List<Update_attr_statementContext> update_attr_statement() {
			return getRuleContexts(Update_attr_statementContext.class);
		}
		public Update_attr_statementContext update_attr_statement(int i) {
			return getRuleContext(Update_attr_statementContext.class,i);
		}
		public List<StatusContext> status() {
			return getRuleContexts(StatusContext.class);
		}
		public StatusContext status(int i) {
			return getRuleContext(StatusContext.class,i);
		}
		public Condition_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_statement; }
	}

	public final Condition_statementContext condition_statement() throws RecognitionException {
		Condition_statementContext _localctx = new Condition_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__12);
			setState(221);
			match(T__9);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16642998272L) != 0)) {
				{
				{
				setState(222);
				condition();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(223);
					match(T__3);
					}
				}

				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(T__11);
			setState(232);
			match(T__1);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549462016L) != 0)) {
				{
				{
				setState(237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(233);
					action_statement();
					}
					break;
				case T__12:
					{
					setState(234);
					condition_statement();
					}
					break;
				case T__22:
					{
					setState(235);
					update_attr_statement();
					}
					break;
				case T__21:
					{
					setState(236);
					status();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(239);
					match(T__3);
					}
				}

				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
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
		enterRule(_localctx, 40, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			expression();
			setState(250);
			comparison_operator();
			setState(251);
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
		enterRule(_localctx, 42, RULE_expression);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(IDENTIFIER);
				setState(254);
				match(T__15);
				setState(255);
				match(IDENTIFIER);
				}
				break;
			case STRING:
			case INT:
			case FLOAT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
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
		enterRule(_localctx, 44, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
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
		public TerminalNode STRING() { return getToken(POKEParser.STRING, 0); }
		public TerminalNode INT() { return getToken(POKEParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(POKEParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(POKEParser.BOOLEAN, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
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
		case 15:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u0108\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003I\b\u0003\n\u0003\f\u0003"+
		"L\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006[\b\u0006\n\u0006\f\u0006^\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tt\b\t\u0001\t\u0001\t\u0005"+
		"\tx\b\t\n\t\f\t{\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0087\b\n\n\n\f\n\u008a\t\n\u0001\n"+
		"\u0001\n\u0005\n\u008e\b\n\n\n\f\n\u0091\t\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0098\b\n\n\n\f\n\u009b\t\n\u0001\n\u0003\n\u009e\b"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00a8\b\u000b\n\u000b\f\u000b\u00ab"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00bc\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00c4\b\u000f\n\u000f"+
		"\f\u000f\u00c7\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d1\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00e1\b\u0013\u0005\u0013\u00e3\b"+
		"\u0013\n\u0013\f\u0013\u00e6\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00ee\b\u0013\u0001\u0013"+
		"\u0003\u0013\u00f1\b\u0013\u0005\u0013\u00f3\b\u0013\n\u0013\f\u0013\u00f6"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0102"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0000"+
		"\u0001\u001e\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0004\u0001\u0000\u0012"+
		"\u0013\u0001\u0000\u0014\u0015\u0001\u0000\u0019\u001c\u0001\u0000\u001e"+
		"!\u010b\u00003\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000"+
		"\u0004?\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\bM\u0001"+
		"\u0000\u0000\u0000\nQ\u0001\u0000\u0000\u0000\f\\\u0001\u0000\u0000\u0000"+
		"\u000e_\u0001\u0000\u0000\u0000\u0010c\u0001\u0000\u0000\u0000\u0012i"+
		"\u0001\u0000\u0000\u0000\u0014~\u0001\u0000\u0000\u0000\u0016\u009f\u0001"+
		"\u0000\u0000\u0000\u0018\u00ae\u0001\u0000\u0000\u0000\u001a\u00b0\u0001"+
		"\u0000\u0000\u0000\u001c\u00bb\u0001\u0000\u0000\u0000\u001e\u00bd\u0001"+
		"\u0000\u0000\u0000 \u00d0\u0001\u0000\u0000\u0000\"\u00d2\u0001\u0000"+
		"\u0000\u0000$\u00d5\u0001\u0000\u0000\u0000&\u00dc\u0001\u0000\u0000\u0000"+
		"(\u00f9\u0001\u0000\u0000\u0000*\u0101\u0001\u0000\u0000\u0000,\u0103"+
		"\u0001\u0000\u0000\u0000.\u0105\u0001\u0000\u0000\u000002\u0003\u0002"+
		"\u0001\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u00004\u0001\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u00006>\u0003\u0004\u0002\u00007>\u0003\n\u0005"+
		"\u00008>\u0003\u0010\b\u00009>\u0003&\u0013\u0000:>\u0003$\u0012\u0000"+
		";>\u0003\"\u0011\u0000<>\u0003\u0012\t\u0000=6\u0001\u0000\u0000\u0000"+
		"=7\u0001\u0000\u0000\u0000=8\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000"+
		"\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000"+
		"\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?@\u0005\u0001\u0000\u0000"+
		"@A\u0005\u001d\u0000\u0000AB\u0005\u0002\u0000\u0000BC\u0003\u0006\u0003"+
		"\u0000CD\u0005\u0003\u0000\u0000D\u0005\u0001\u0000\u0000\u0000EF\u0003"+
		"\b\u0004\u0000FG\u0005\u0004\u0000\u0000GI\u0001\u0000\u0000\u0000HE\u0001"+
		"\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000K\u0007\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000MN\u0005\u001d\u0000\u0000NO\u0005\u0005\u0000\u0000OP\u0003"+
		".\u0017\u0000P\t\u0001\u0000\u0000\u0000QR\u0005\u0006\u0000\u0000RS\u0005"+
		"\u001d\u0000\u0000ST\u0005\u0002\u0000\u0000TU\u0003\f\u0006\u0000UV\u0005"+
		"\u0003\u0000\u0000V\u000b\u0001\u0000\u0000\u0000WX\u0003\u000e\u0007"+
		"\u0000XY\u0005\u0004\u0000\u0000Y[\u0001\u0000\u0000\u0000ZW\u0001\u0000"+
		"\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]\r\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"_`\u0005\u001d\u0000\u0000`a\u0005\u0005\u0000\u0000ab\u0003.\u0017\u0000"+
		"b\u000f\u0001\u0000\u0000\u0000cd\u0005\u001d\u0000\u0000de\u0005\u0007"+
		"\u0000\u0000ef\u0005\u001d\u0000\u0000fg\u0005\b\u0000\u0000gh\u0005\u001d"+
		"\u0000\u0000h\u0011\u0001\u0000\u0000\u0000ij\u0005\t\u0000\u0000jk\u0005"+
		"\u001d\u0000\u0000kl\u0005\n\u0000\u0000lm\u0005\u001d\u0000\u0000mn\u0005"+
		"\u000b\u0000\u0000no\u0005\u001d\u0000\u0000op\u0005\f\u0000\u0000py\u0005"+
		"\u0002\u0000\u0000qt\u0003\u001a\r\u0000rt\u0003\u0014\n\u0000sq\u0001"+
		"\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0005\u0004\u0000\u0000vx\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000"+
		"\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005"+
		"\u0003\u0000\u0000}\u0013\u0001\u0000\u0000\u0000~\u007f\u0005\r\u0000"+
		"\u0000\u007f\u0080\u0005\n\u0000\u0000\u0080\u0081\u0003(\u0014\u0000"+
		"\u0081\u0082\u0005\f\u0000\u0000\u0082\u0088\u0005\u0002\u0000\u0000\u0083"+
		"\u0084\u0003\u001a\r\u0000\u0084\u0085\u0005\u0004\u0000\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0087\u008a"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008b\u008f\u0005\u0003\u0000\u0000\u008c\u008e"+
		"\u0003\u0016\u000b\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u009d\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u000e\u0000\u0000\u0093\u0099"+
		"\u0005\u0002\u0000\u0000\u0094\u0095\u0003\u0018\f\u0000\u0095\u0096\u0005"+
		"\u0004\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0094\u0001"+
		"\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009e\u0005"+
		"\u0003\u0000\u0000\u009d\u0092\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u0015\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"\u000f\u0000\u0000\u00a0\u00a1\u0005\n\u0000\u0000\u00a1\u00a2\u0003("+
		"\u0014\u0000\u00a2\u00a3\u0005\f\u0000\u0000\u00a3\u00a9\u0005\u0002\u0000"+
		"\u0000\u00a4\u00a5\u0003\u001a\r\u0000\u00a5\u00a6\u0005\u0004\u0000\u0000"+
		"\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0003\u0000\u0000"+
		"\u00ad\u0017\u0001\u0000\u0000\u0000\u00ae\u00af\u0003\u001a\r\u0000\u00af"+
		"\u0019\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u001d\u0000\u0000\u00b1"+
		"\u00b2\u0005\u0010\u0000\u0000\u00b2\u00b3\u0005\u001d\u0000\u0000\u00b3"+
		"\u00b4\u0005\u0011\u0000\u0000\u00b4\u00b5\u0003\u001c\u000e\u0000\u00b5"+
		"\u001b\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003*\u0015\u0000\u00b7\u00b8"+
		"\u0007\u0000\u0000\u0000\u00b8\u00b9\u0003\u001e\u000f\u0000\u00b9\u00bc"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bc\u0003\u001e\u000f\u0000\u00bb\u00b6"+
		"\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u001d"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0006\u000f\uffff\uffff\u0000\u00be"+
		"\u00bf\u0003 \u0010\u0000\u00bf\u00c5\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\n\u0002\u0000\u0000\u00c1\u00c2\u0007\u0001\u0000\u0000\u00c2\u00c4\u0003"+
		" \u0010\u0000\u00c3\u00c0\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u001f\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0005\n\u0000\u0000\u00c9\u00ca\u0003*\u0015"+
		"\u0000\u00ca\u00cb\u0005\f\u0000\u0000\u00cb\u00d1\u0001\u0000\u0000\u0000"+
		"\u00cc\u00d1\u0003.\u0017\u0000\u00cd\u00ce\u0005\u001d\u0000\u0000\u00ce"+
		"\u00cf\u0005\u0010\u0000\u0000\u00cf\u00d1\u0005\u001d\u0000\u0000\u00d0"+
		"\u00c8\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d0"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d1!\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0005\u0016\u0000\u0000\u00d3\u00d4\u0005\u001d\u0000\u0000\u00d4#\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005\u0017\u0000\u0000\u00d6\u00d7\u0005"+
		"\u001d\u0000\u0000\u00d7\u00d8\u0005\u0010\u0000\u0000\u00d8\u00d9\u0005"+
		"\u001d\u0000\u0000\u00d9\u00da\u0005\u0018\u0000\u0000\u00da\u00db\u0003"+
		"*\u0015\u0000\u00db%\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\r\u0000"+
		"\u0000\u00dd\u00e4\u0005\n\u0000\u0000\u00de\u00e0\u0003(\u0014\u0000"+
		"\u00df\u00e1\u0005\u0004\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e2\u00de\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0005\f\u0000\u0000\u00e8\u00f4\u0005\u0002\u0000\u0000\u00e9"+
		"\u00ee\u0003\u0010\b\u0000\u00ea\u00ee\u0003&\u0013\u0000\u00eb\u00ee"+
		"\u0003$\u0012\u0000\u00ec\u00ee\u0003\"\u0011\u0000\u00ed\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f1\u0005\u0004\u0000\u0000\u00f0\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f2\u00ed\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005\u0003\u0000\u0000\u00f8\'\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0003*\u0015\u0000\u00fa\u00fb\u0003,\u0016\u0000"+
		"\u00fb\u00fc\u0003*\u0015\u0000\u00fc)\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0005\u001d\u0000\u0000\u00fe\u00ff\u0005\u0010\u0000\u0000\u00ff\u0102"+
		"\u0005\u001d\u0000\u0000\u0100\u0102\u0003.\u0017\u0000\u0101\u00fd\u0001"+
		"\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102+\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0007\u0002\u0000\u0000\u0104-\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0007\u0003\u0000\u0000\u0106/\u0001\u0000\u0000\u0000"+
		"\u00143=J\\sy\u0088\u008f\u0099\u009d\u00a9\u00bb\u00c5\u00d0\u00e0\u00e4"+
		"\u00ed\u00f0\u00f4\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
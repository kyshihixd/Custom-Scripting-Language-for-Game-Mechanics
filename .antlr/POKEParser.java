// Generated from c:/Users/Administrator/Desktop/PPL/lab/Sample_Function_Call/POKE.g4 by ANTLR 4.13.1
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
		T__24=25, T__25=26, IDENTIFIER=27, STRING=28, INT=29, FLOAT=30, BOOLEAN=31, 
		WHITESPACE=32, COMMENT=33;
	public static final int
		RULE_script = 0, RULE_statement = 1, RULE_pokemon = 2, RULE_pokemon_body = 3, 
		RULE_pokemon_attribute = 4, RULE_move = 5, RULE_move_body = 6, RULE_move_attribute = 7, 
		RULE_action_statement = 8, RULE_trigger_definition = 9, RULE_trigger_action = 10, 
		RULE_target_operator = 11, RULE_status = 12, RULE_update_attr_statement = 13, 
		RULE_condition_statement = 14, RULE_condition = 15, RULE_expression = 16, 
		RULE_comparison_operator = 17, RULE_value = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "statement", "pokemon", "pokemon_body", "pokemon_attribute", 
			"move", "move_body", "move_attribute", "action_statement", "trigger_definition", 
			"trigger_action", "target_operator", "status", "update_attr_statement", 
			"condition_statement", "condition", "expression", "comparison_operator", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pokemon'", "'{'", "'}'", "';'", "':'", "'move'", "'uses'", "'on'", 
			"'trigger'", "'target'", "'.'", "'+='", "'-='", "'='", "'*='", "'/='", 
			"'status'", "'update'", "'to'", "'if'", "'('", "')'", "'<'", "'>'", "'=='", 
			"'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IDENTIFIER", "STRING", "INT", "FLOAT", "BOOLEAN", 
			"WHITESPACE", "COMMENT"
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 135659586L) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				pokemon();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				move();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				action_statement();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				condition_statement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				update_attr_statement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				status();
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
			setState(52);
			match(T__0);
			setState(53);
			match(IDENTIFIER);
			setState(54);
			match(T__1);
			setState(55);
			pokemon_body();
			setState(56);
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
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(58);
				pokemon_attribute();
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(59);
					match(T__3);
					}
				}

				}
				}
				setState(66);
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
			setState(67);
			match(IDENTIFIER);
			setState(68);
			match(T__4);
			setState(69);
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
			setState(71);
			match(T__5);
			setState(72);
			match(IDENTIFIER);
			setState(73);
			match(T__1);
			setState(74);
			move_body();
			setState(75);
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(77);
				move_attribute();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(78);
					match(T__3);
					}
				}

				}
				}
				setState(85);
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
			setState(86);
			match(IDENTIFIER);
			setState(87);
			match(T__4);
			setState(88);
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
			setState(90);
			match(IDENTIFIER);
			setState(91);
			match(T__6);
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(T__7);
			setState(94);
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
	public static class Trigger_definitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(POKEParser.IDENTIFIER, 0); }
		public List<Trigger_actionContext> trigger_action() {
			return getRuleContexts(Trigger_actionContext.class);
		}
		public Trigger_actionContext trigger_action(int i) {
			return getRuleContext(Trigger_actionContext.class,i);
		}
		public Trigger_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_definition; }
	}

	public final Trigger_definitionContext trigger_definition() throws RecognitionException {
		Trigger_definitionContext _localctx = new Trigger_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_trigger_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__8);
			setState(97);
			match(IDENTIFIER);
			setState(98);
			match(T__1);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(99);
				trigger_action();
				setState(100);
				match(T__3);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
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
	public static class Trigger_actionContext extends ParserRuleContext {
		public Target_operatorContext target_operator() {
			return getRuleContext(Target_operatorContext.class,0);
		}
		public Trigger_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_action; }
	}

	public final Trigger_actionContext trigger_action() throws RecognitionException {
		Trigger_actionContext _localctx = new Trigger_actionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_trigger_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			target_operator();
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
	public static class Target_operatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(POKEParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Target_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_operator; }
	}

	public final Target_operatorContext target_operator() throws RecognitionException {
		Target_operatorContext _localctx = new Target_operatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_target_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__9);
			setState(112);
			match(T__10);
			setState(113);
			match(IDENTIFIER);
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126976L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(115);
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
	public static class StatusContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(POKEParser.IDENTIFIER, 0); }
		public StatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status; }
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_status);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__16);
			setState(118);
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
		enterRule(_localctx, 26, RULE_update_attr_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__17);
			setState(121);
			match(IDENTIFIER);
			setState(122);
			match(T__10);
			setState(123);
			match(IDENTIFIER);
			setState(124);
			match(T__18);
			setState(125);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Condition_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_statement; }
	}

	public final Condition_statementContext condition_statement() throws RecognitionException {
		Condition_statementContext _localctx = new Condition_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__19);
			setState(128);
			match(T__20);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) {
				{
				{
				setState(129);
				condition();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(130);
					match(T__3);
					}
				}

				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(T__21);
			setState(139);
			match(T__1);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 135659586L) != 0)) {
				{
				{
				setState(140);
				statement();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(141);
					match(T__3);
					}
				}

				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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
		enterRule(_localctx, 30, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			expression();
			setState(152);
			comparison_operator();
			setState(153);
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
		enterRule(_localctx, 32, RULE_expression);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(IDENTIFIER);
				setState(156);
				match(T__10);
				setState(157);
				match(IDENTIFIER);
				}
				break;
			case STRING:
			case INT:
			case FLOAT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
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
		enterRule(_localctx, 34, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4026531840L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001!\u00a6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"3\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003\u0005\u0003"+
		"?\b\u0003\n\u0003\f\u0003B\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006P\b\u0006\u0005\u0006"+
		"R\b\u0006\n\u0006\f\u0006U\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tg\b\t\n\t\f\tj\t\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0084\b\u000e\u0005\u000e\u0086\b\u000e\n\u000e\f\u000e\u0089"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u008f"+
		"\b\u000e\u0005\u000e\u0091\b\u000e\n\u000e\f\u000e\u0094\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00a0\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0000\u0013"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$\u0000\u0003\u0001\u0000\f\u0010\u0001\u0000\u0017\u001a"+
		"\u0001\u0000\u001c\u001f\u00a2\u0000)\u0001\u0000\u0000\u0000\u00022\u0001"+
		"\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000"+
		"\u0000\bC\u0001\u0000\u0000\u0000\nG\u0001\u0000\u0000\u0000\fS\u0001"+
		"\u0000\u0000\u0000\u000eV\u0001\u0000\u0000\u0000\u0010Z\u0001\u0000\u0000"+
		"\u0000\u0012`\u0001\u0000\u0000\u0000\u0014m\u0001\u0000\u0000\u0000\u0016"+
		"o\u0001\u0000\u0000\u0000\u0018u\u0001\u0000\u0000\u0000\u001ax\u0001"+
		"\u0000\u0000\u0000\u001c\u007f\u0001\u0000\u0000\u0000\u001e\u0097\u0001"+
		"\u0000\u0000\u0000 \u009f\u0001\u0000\u0000\u0000\"\u00a1\u0001\u0000"+
		"\u0000\u0000$\u00a3\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001\u0000"+
		"\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*\u0001\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000,3\u0003\u0004\u0002\u0000-3\u0003\n\u0005\u0000.3\u0003"+
		"\u0010\b\u0000/3\u0003\u001c\u000e\u000003\u0003\u001a\r\u000013\u0003"+
		"\u0018\f\u00002,\u0001\u0000\u0000\u00002-\u0001\u0000\u0000\u00002.\u0001"+
		"\u0000\u0000\u00002/\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"21\u0001\u0000\u0000\u00003\u0003\u0001\u0000\u0000\u000045\u0005\u0001"+
		"\u0000\u000056\u0005\u001b\u0000\u000067\u0005\u0002\u0000\u000078\u0003"+
		"\u0006\u0003\u000089\u0005\u0003\u0000\u00009\u0005\u0001\u0000\u0000"+
		"\u0000:<\u0003\b\u0004\u0000;=\u0005\u0004\u0000\u0000<;\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000>:\u0001\u0000"+
		"\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A\u0007\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000CD\u0005\u001b\u0000\u0000DE\u0005\u0005\u0000\u0000EF\u0003$\u0012"+
		"\u0000F\t\u0001\u0000\u0000\u0000GH\u0005\u0006\u0000\u0000HI\u0005\u001b"+
		"\u0000\u0000IJ\u0005\u0002\u0000\u0000JK\u0003\f\u0006\u0000KL\u0005\u0003"+
		"\u0000\u0000L\u000b\u0001\u0000\u0000\u0000MO\u0003\u000e\u0007\u0000"+
		"NP\u0005\u0004\u0000\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PR\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000RU\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\r\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005\u001b\u0000\u0000"+
		"WX\u0005\u0005\u0000\u0000XY\u0003$\u0012\u0000Y\u000f\u0001\u0000\u0000"+
		"\u0000Z[\u0005\u001b\u0000\u0000[\\\u0005\u0007\u0000\u0000\\]\u0005\u001b"+
		"\u0000\u0000]^\u0005\b\u0000\u0000^_\u0005\u001b\u0000\u0000_\u0011\u0001"+
		"\u0000\u0000\u0000`a\u0005\t\u0000\u0000ab\u0005\u001b\u0000\u0000bh\u0005"+
		"\u0002\u0000\u0000cd\u0003\u0014\n\u0000de\u0005\u0004\u0000\u0000eg\u0001"+
		"\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000kl\u0005\u0003\u0000\u0000l\u0013\u0001"+
		"\u0000\u0000\u0000mn\u0003\u0016\u000b\u0000n\u0015\u0001\u0000\u0000"+
		"\u0000op\u0005\n\u0000\u0000pq\u0005\u000b\u0000\u0000qr\u0005\u001b\u0000"+
		"\u0000rs\u0007\u0000\u0000\u0000st\u0003 \u0010\u0000t\u0017\u0001\u0000"+
		"\u0000\u0000uv\u0005\u0011\u0000\u0000vw\u0005\u001b\u0000\u0000w\u0019"+
		"\u0001\u0000\u0000\u0000xy\u0005\u0012\u0000\u0000yz\u0005\u001b\u0000"+
		"\u0000z{\u0005\u000b\u0000\u0000{|\u0005\u001b\u0000\u0000|}\u0005\u0013"+
		"\u0000\u0000}~\u0003 \u0010\u0000~\u001b\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005\u0014\u0000\u0000\u0080\u0087\u0005\u0015\u0000\u0000\u0081"+
		"\u0083\u0003\u001e\u000f\u0000\u0082\u0084\u0005\u0004\u0000\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0016\u0000\u0000\u008b"+
		"\u0092\u0005\u0002\u0000\u0000\u008c\u008e\u0003\u0002\u0001\u0000\u008d"+
		"\u008f\u0005\u0004\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090"+
		"\u008c\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005\u0003\u0000\u0000\u0096\u001d\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0003 \u0010\u0000\u0098\u0099\u0003\"\u0011\u0000\u0099\u009a"+
		"\u0003 \u0010\u0000\u009a\u001f\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u001b\u0000\u0000\u009c\u009d\u0005\u000b\u0000\u0000\u009d\u00a0\u0005"+
		"\u001b\u0000\u0000\u009e\u00a0\u0003$\u0012\u0000\u009f\u009b\u0001\u0000"+
		"\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0!\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0007\u0001\u0000\u0000\u00a2#\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0007\u0002\u0000\u0000\u00a4%\u0001\u0000\u0000\u0000\f"+
		")2<@OSh\u0083\u0087\u008e\u0092\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
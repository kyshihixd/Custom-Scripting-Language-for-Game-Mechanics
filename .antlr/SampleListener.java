// Generated from c:/Users/Administrator/Desktop/PPL/lab/Sample_Function_Call/Sample.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SampleParser}.
 */
public interface SampleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SampleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SampleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SampleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SampleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SampleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SampleParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SampleParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SampleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SampleParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SampleParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(SampleParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SampleParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(SampleParser.FuncCallContext ctx);
}
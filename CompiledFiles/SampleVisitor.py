# Generated from Sample.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SampleParser import SampleParser
else:
    from SampleParser import SampleParser

# This class defines a complete generic visitor for a parse tree produced by SampleParser.

class SampleVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by SampleParser#program.
    def visitProgram(self, ctx:SampleParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#statement.
    def visitStatement(self, ctx:SampleParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#pokemon.
    def visitPokemon(self, ctx:SampleParser.PokemonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#pokemon_body.
    def visitPokemon_body(self, ctx:SampleParser.Pokemon_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#pokemon_attribute.
    def visitPokemon_attribute(self, ctx:SampleParser.Pokemon_attributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#move.
    def visitMove(self, ctx:SampleParser.MoveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#move_body.
    def visitMove_body(self, ctx:SampleParser.Move_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#move_attribute.
    def visitMove_attribute(self, ctx:SampleParser.Move_attributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#action_statement.
    def visitAction_statement(self, ctx:SampleParser.Action_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#update_attr_statement.
    def visitUpdate_attr_statement(self, ctx:SampleParser.Update_attr_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#condition_statement.
    def visitCondition_statement(self, ctx:SampleParser.Condition_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#condition.
    def visitCondition(self, ctx:SampleParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#expression.
    def visitExpression(self, ctx:SampleParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#comparison_operator.
    def visitComparison_operator(self, ctx:SampleParser.Comparison_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SampleParser#value.
    def visitValue(self, ctx:SampleParser.ValueContext):
        return self.visitChildren(ctx)



del SampleParser
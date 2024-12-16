# Generated from POKE.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .POKEParser import POKEParser
else:
    from POKEParser import POKEParser

# This class defines a complete generic visitor for a parse tree produced by POKEParser.

class POKEVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by POKEParser#script.
    def visitScript(self, ctx:POKEParser.ScriptContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#statement.
    def visitStatement(self, ctx:POKEParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#pokemon.
    def visitPokemon(self, ctx:POKEParser.PokemonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#pokemon_body.
    def visitPokemon_body(self, ctx:POKEParser.Pokemon_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#pokemon_attribute.
    def visitPokemon_attribute(self, ctx:POKEParser.Pokemon_attributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#move.
    def visitMove(self, ctx:POKEParser.MoveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#move_body.
    def visitMove_body(self, ctx:POKEParser.Move_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#move_attribute.
    def visitMove_attribute(self, ctx:POKEParser.Move_attributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#action_statement.
    def visitAction_statement(self, ctx:POKEParser.Action_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#update_attr_statement.
    def visitUpdate_attr_statement(self, ctx:POKEParser.Update_attr_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#condition_statement.
    def visitCondition_statement(self, ctx:POKEParser.Condition_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#condition.
    def visitCondition(self, ctx:POKEParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#expression.
    def visitExpression(self, ctx:POKEParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#comparison_operator.
    def visitComparison_operator(self, ctx:POKEParser.Comparison_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by POKEParser#value.
    def visitValue(self, ctx:POKEParser.ValueContext):
        return self.visitChildren(ctx)



del POKEParser
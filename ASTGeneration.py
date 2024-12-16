from CompiledFiles.POKEVisitor import POKEVisitor
from CompiledFiles.POKEParser import POKEParser
from ASTUtils import *

class ASTGeneration(POKEVisitor):
    def visitScript(self, ctx: POKEParser.ScriptContext):
        return Script([stmt.accept(self) for stmt in ctx.statement()])

    def visitPokemon(self, ctx: POKEParser.PokemonContext):
        name = ctx.IDENTIFIER().getText()
        attributes = [attr.accept(self) for attr in ctx.pokemon_body().pokemon_attribute()]
        return Pokemon(name, attributes)

    def visitPokemon_attribute(self, ctx: POKEParser.Pokemon_attributeContext):
        key = ctx.IDENTIFIER().getText()
        value = ctx.value().accept(self)
        return Attribute(key, value)

    def visitMove(self, ctx: POKEParser.MoveContext):
        name = ctx.IDENTIFIER().getText()
        attributes = [attr.accept(self) for attr in ctx.move_body().move_attribute()]
        return Move(name, attributes)

    def visitMove_attribute(self, ctx: POKEParser.Move_attributeContext):
        key = ctx.IDENTIFIER().getText()
        value = ctx.value().accept(self)
        return Attribute(key, value)

    def visitAction_statement(self, ctx: POKEParser.Action_statementContext):
        pokemon = ctx.IDENTIFIER(0).getText()
        move = ctx.IDENTIFIER(1).getText()
        return ActionStatement(pokemon, move)

    def visitUpdate_attr_statement(self, ctx: POKEParser.Update_attr_statementContext):
        target = ctx.IDENTIFIER(0).getText()
        attribute = ctx.IDENTIFIER(1).getText()
        value = ctx.value().accept(self)
        return UpdateAttribute(target, attribute, value)

    def visitCondition_statement(self, ctx: POKEParser.Condition_statementContext):
        conditions = [cond.accept(self) for cond in ctx.condition()]
        body = [stmt.accept(self) for stmt in ctx.statement()]
        return ConditionStatement(conditions, body)

    def visitCondition(self, ctx: POKEParser.ConditionContext):
        left = ctx.expression(0).accept(self)
        operator = ctx.comparison_operator().getText()
        right = ctx.expression(1).accept(self)
        return Condition(left, operator, right)

    def visitExpression(self, ctx: POKEParser.ExpressionContext):
        if ctx.IDENTIFIER():
            return AttributeAccess(ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText())
        return ctx.value().accept(self)

    def visitValue(self, ctx: POKEParser.ValueContext):
        if ctx.STRING():
            return String(ctx.STRING().getText().strip('"'))
        elif ctx.INT():
            return Int(int(ctx.INT().getText()))
        elif ctx.FLOAT():
            return Float(float(ctx.FLOAT().getText()))
        elif ctx.BOOLEAN():
            return Boolean(ctx.BOOLEAN().getText() == "true")

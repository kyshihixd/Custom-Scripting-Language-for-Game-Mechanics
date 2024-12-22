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
    
    def visitStatus(self, ctx: POKEParser.StatusContext):
        name = ctx.IDENTIFIER().getText()
        return Status(name)

    def visitAction_statement(self, ctx: POKEParser.Action_statementContext):
        pokemon = ctx.IDENTIFIER(0).getText()
        move = ctx.IDENTIFIER(1).getText()
        target = ctx.IDENTIFIER(2).getText()
        return ActionStatement(pokemon, move, target)

    def visitUpdate_attr_statement(self, ctx: POKEParser.Update_attr_statementContext):
        target = ctx.IDENTIFIER(0).getText()
        attribute = ctx.IDENTIFIER(1).getText()
        expression = ctx.expression().accept(self)
        return UpdateAttribute(target, attribute, expression)

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
            entity = ctx.IDENTIFIER(0).getText()
            attribute = ctx.IDENTIFIER(1).getText()
            return AttributeAccess(entity, attribute)
        else:
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

    def visitTrigger_statement(self, ctx: POKEParser.Trigger_statementContext):
        move = ctx.IDENTIFIER(0).getText()
        user = ctx.IDENTIFIER(1).getText()
        target = ctx.IDENTIFIER(2).getText()
        actions = [action.accept(self) for action in ctx.trigger_action() + ctx.trigger_condition()]
        return TriggerStatement(move,user, target, actions)
    
    def visitTrigger_condition(self, ctx: POKEParser.Trigger_conditionContext):
        condition = ctx.condition().accept(self)
        if_body = [action.accept(self) for action in ctx.trigger_action()]
        else_body = None
        if ctx.trigger_else():
            else_body = [action.accept(self) for action in ctx.trigger_else()]
        return TriggerCondition(condition, if_body, else_body)

    def visitTrigger_else(self, ctx: POKEParser.Trigger_elseContext):
        actions = ctx.trigger_action().accept(self)
        return TriggerElse(actions)
    
    def visitTrigger_action(self, ctx: POKEParser.Trigger_actionContext):
        entity = ctx.IDENTIFIER(0).getText()
        attribute = ctx.IDENTIFIER(1).getText()
        arithmetic = ctx.arithmatic().accept(self)
        return TriggerAction(entity, attribute, arithmetic)

    def visitArithmatic(self, ctx: POKEParser.ArithmaticContext):
        if ctx.getChildCount() == 1:
           return ctx.term().accept(self)
        else:
           left = ctx.expression().accept(self)
           operator = ctx.getChild(1).getText()
           right = ctx.term().accept(self)
           return ArithmeticExpression(left, operator, right)
    
    def visitTerm(self, ctx: POKEParser.TermContext):
        if ctx.getChildCount() == 1:
                return ctx.factor().accept(self)
        else:
                left = ctx.term().accept(self)
                operator = ctx.getChild(1).getText()
                right = ctx.factor().accept(self)
                return ArithmeticTerm(left, operator, right)

    def visitFactor(self, ctx: POKEParser.FactorContext):
        if ctx.expression():
            return ctx.expression().accept(self)
        elif ctx.IDENTIFIER():
            return AttributeAccess(entity = ctx.IDENTIFIER(0).getText(), attribute = ctx.IDENTIFIER(1).getText())
        else:
            return ctx.value().accept(self)
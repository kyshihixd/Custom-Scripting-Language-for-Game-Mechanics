import math
from ASTUtils import *

class CodeRunner:
    def __init__(self):
        self.pokemon = {}
        self.moves = {}
        self.triggers = {}

    def visitScript(self, ctx: Script):
        results = []
        for stmt in ctx.statements:
            result = stmt.accept(self)
            results.append(result)
        return results


    def visitPokemon(self, ctx: Pokemon):
        attributes = {attr.key: attr.value for attr in ctx.attributes}
        self.pokemon[ctx.name] = attributes

    def visitMove(self, ctx: Move):
        attributes = {attr.key: attr.value for attr in ctx.attributes}
        self.moves[ctx.name] = attributes

    def visitActionStatement(self, ctx: ActionStatement):
        trigger_name = ctx.move

        if (ctx.pokemon != self.triggers[trigger_name].user or ctx.move != self.triggers[trigger_name].move or ctx.target != self.triggers[trigger_name].target):
            raise Exception(f"Unknown target: unknown trigger")

        if trigger_name in self.triggers:
            for action in self.triggers[trigger_name].action:
                
                action.accept(self)
        

    def visitStatus(self, ctx: Status):
        name = ctx.name
        if name in self.pokemon:
            attr = self.pokemon[name]
            final = "{"+", ".join(f"{k}: {v}" for k, v in attr.items())+"}"
            result = f"Status of Pokemon '{name}': {final}"
            print(result)
            return result
        elif name in self.moves:
            attr = self.moves[name]
            final = "{"+", ".join(f"{k}: {v}" for k, v in attr.items())+"}"
            result= f"Status of Pokemon '{name}': {final}"
            print(result)
            return result
        else:
            result = f"Status of Pokemon '{name}': {final}"
            print(result)
            return result

    def visitUpdateAttribute(self, ctx: UpdateAttribute):
        new_value = ctx.expression.accept(self)

        if ctx.target in self.pokemon:
            self.pokemon[ctx.target][ctx.attribute] = new_value
        elif ctx.target in self.moves:
            self.moves[ctx.target][ctx.attribute] = new_value
        else:
            raise Exception(f"Unknown target: {ctx.target}")

    def visitConditionStatement(self, ctx: ConditionStatement):
        for condition in ctx.conditions:
            if not condition.accept(self):
                return
            
        for statement in ctx.statements:
            statement.accept(self)

    def visitCondition(self, ctx: Condition):
        if isinstance(ctx.left.accept(self), int):
            left_value = ctx.left.accept(self)
        elif isinstance(ctx.left.accept(self), str):
            left_value = ctx.left.accept(self)
        else: left_value = ctx.left.accept(self).value
        
        if isinstance(ctx.right.accept(self),int):
            right_value = ctx.right.accept(self)
        elif isinstance(ctx.right.accept(self), str):
            right_value = ctx.right.accept(self)   
        else: right_value = ctx.right.accept(self).value

        if ctx.operator == "<":
            return left_value < right_value
        elif ctx.operator == ">":
            return left_value > right_value
        elif ctx.operator == "==":
            return left_value == right_value
        elif ctx.operator == "!=":
            return left_value != right_value
        else:
            raise Exception(f"Unknown comparison operator: {ctx.operator}")

    def visitAttributeAccess(self, ctx: AttributeAccess):
        entity_name = ctx.entity 
        attribute = ctx.attribute
        if entity_name in self.pokemon:
            entity = self.pokemon[entity_name]
        elif entity_name in self.moves:
            entity = self.moves[entity_name]
        else:
            raise Exception(f"Unknown entity: {entity_name}")

        if attribute in entity:
            return entity[attribute]
        else:
            raise Exception(f"Attribute '{attribute}' not found in {entity_name}")

    def visitInt(self, ctx: Int): return ctx.value
    def visitFloat(self, ctx: Float): return ctx.value
    def visitString(self, ctx: String): return ctx.value
    def visitBoolean(self, ctx: Boolean): return ctx.value

    def visitTriggerStatement(self, ctx: TriggerStatement):
        self.triggers[ctx.move] = ctx

    def visitTriggerCondition(self, ctx: TriggerCondition):
        if ctx.conditions.accept(self):
            for action in ctx.if_:
                action.accept(self)
        elif ctx.else_:
            for action in ctx.else_:
                action.accept(self)

    def visitTriggerElse(self, ctx: TriggerElse):
        ctx.actions.accept(self)

    def visitTriggerAction(self, ctx: TriggerAction):
        target_pokemon = self.pokemon[ctx.target]
        new_value = ctx.arithmetic.accept(self)
        target_pokemon[ctx.attribute] = new_value

    def visitArithmeticExpression(self, ctx: ArithmeticExpression):
        left_value = ctx.left.accept(self)
        right_value = ctx.right.accept(self)
        if isinstance(left_value, Int) or isinstance(left_value, Float) or isinstance(left_value, Boolean):
            left_value = left_value.value
        if isinstance(right_value, Int) or isinstance(right_value, Float) or isinstance(right_value, Boolean):
            right_value = right_value.value
        if ctx.operator == "+":
            return Int(value = left_value + right_value)
        elif ctx.operator == "-":
            return Int(value = left_value - right_value)
        else:
            raise Exception("Unknown arithmetic operator")
    
    def visitArithmeticTerm(self, ctx: ArithmeticTerm):
        left_value = ctx.left.accept(self)
        right_value = ctx.right.accept(self)

        if isinstance(left_value, Int) or isinstance(left_value, Float) or isinstance(left_value, Boolean):
            left_value = left_value.value
        if isinstance(right_value, Int) or isinstance(right_value, Float) or isinstance(right_value, Boolean):
            right_value = right_value.value
        if ctx.operator == "*":
            return Int(value = left_value * right_value)
        elif ctx.operator == "/":
            return Int(value = left_value / right_value)
        else:
            raise Exception("Unknown arithmetic operator")

    def visitArithmeticFactor(self, ctx: ArithmeticFactor):
       return ctx.expression.accept(self)
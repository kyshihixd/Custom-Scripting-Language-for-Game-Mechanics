import math
from ASTUtils import *

class CodeRunner:
    def __init__(self):
        self.pokemon = {}
        self.moves = {}

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
        pokemon = self.pokemon[ctx.pokemon]
        move = self.moves[ctx.move]
        damage = (move["power"].value + pokemon["power"].value)
        print(f"{ctx.pokemon} uses {ctx.move}, dealing {damage} damage to {ctx.target}!")
        self.pokemon[ctx.target]["hp"].value -= damage
        print(f"{ctx.target} is now {self.pokemon[ctx.target]['hp']} hp")
        return f"{ctx.pokemon} uses {ctx.move}, dealing {damage} damage to {ctx.target}!" + f"{ctx.target} is now {self.pokemon[ctx.target]['hp']} hp"
        
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
        left_value = ctx.left.accept(self).value
        right_value = ctx.right.accept(self).value

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
        entity_name = ctx.pokemon  # This can refer to either Pokémon or a Move
        attribute = ctx.attribute

        # Check Pokémon dictionary
        if entity_name in self.pokemon:
            entity = self.pokemon[entity_name]
        # Check Moves dictionary
        elif entity_name in self.moves:
            entity = self.moves[entity_name]
        else:
            raise Exception(f"Unknown entity: {entity_name}")

        # Retrieve the attribute from the entity
        if attribute in entity:
            return entity[attribute]
        else:
            raise Exception(f"Attribute '{attribute}' not found in {entity_name}")



    def visitInt(self, ctx: Int): return ctx.value
    def visitFloat(self, ctx: Float): return ctx.value
    def visitString(self, ctx: String): return ctx.value
    def visitBoolean(self, ctx: Boolean): return ctx.value

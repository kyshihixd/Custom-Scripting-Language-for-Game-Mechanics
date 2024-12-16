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
        damage = (move["power"])
        print(f"{ctx.pokemon} uses {ctx.move}, dealing {damage} damage!")

    def visitUpdateAttribute(self, ctx: UpdateAttribute):
        self.pokemon[ctx.target][ctx.attribute] = ctx.value

    def visitConditionStatement(self, ctx: ConditionStatement):
        if all(cond.accept(self) for cond in ctx.conditions):
            for stmt in ctx.body:
                stmt.accept(self)

    def visitCondition(self, ctx: Condition):
        left = ctx.left.accept(self)
        right = ctx.right.accept(self)
        op = ctx.operator
        if op == "<": return left < right
        if op == ">": return left > right
        if op == "==": return left == right
        if op == "!=": return left != right

    def visitAttributeAccess(self, ctx: AttributeAccess):
        return self.pokemon[ctx.pokemon][ctx.attribute]

    def visitInt(self, ctx: Int): return ctx.value
    def visitFloat(self, ctx: Float): return ctx.value
    def visitString(self, ctx: String): return ctx.value
    def visitBoolean(self, ctx: Boolean): return ctx.value

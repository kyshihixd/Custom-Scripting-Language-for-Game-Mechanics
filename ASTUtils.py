from dataclasses import dataclass
from typing import List

@dataclass
class Script:
    statements: List
    def accept(self, visitor):
        return visitor.visitScript(self)


@dataclass
class Pokemon:
    name: str
    attributes: List
    def accept(self, visitor):
        return visitor.visitPokemon(self)

@dataclass
class Move:
    name: str
    attributes: List
    def accept(self, visitor):
        return visitor.visitMove(self)

@dataclass
class Attribute:
    key: str
    value: any
    def accept(self, visitor):
        return visitor.visitAttribute(self)

@dataclass
class ActionStatement:
    pokemon: str
    move: str
    def accept(self, visitor):
        return visitor.visitActionStatement(self)

@dataclass
class UpdateAttribute:
    target: str
    attribute: str
    value: any
    def accept(self, visitor):
        return visitor.visitUpdateAttribute(self)

@dataclass
class ConditionStatement:
    conditions: List
    body: List
    def accept(self, visitor):
        return visitor.visitConditionStatement(self)

@dataclass
class Condition:
    left: any
    operator: str
    right: any
    def accept(self, visitor):
        return visitor.visitCondition(self)

@dataclass
class AttributeAccess:
    pokemon: str
    attribute: str
    def accept(self, visitor):
        return visitor.visitAttributeAccess(self)

@dataclass
class String:
    value: str
    def __str__(self):
        return self.value
    def accept(self, visitor):
        return visitor.visitString(self)

@dataclass
class Int:
    value: int
    def __str__(self):
        return str(self.value)
    def accept(self, visitor):
        return visitor.visitInt(self)

@dataclass
class Float:
    value: float
    def __str__(self):
        return str(self.value)
    def accept(self, visitor):
        return visitor.visitFloat(self)

@dataclass
class Boolean:
    value: bool
    def accept(self, visitor):
        return visitor.visitBoolean(self)
    def accept(self, visitor):
        return visitor.visitBoolean(self)

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
    target: str
    def accept(self, visitor):
        return visitor.visitActionStatement(self)

@dataclass
class Status:
    name: str
    def __str__(self):
        return self.name
    def accept(self, visitor):
        return visitor.visitStatus(self)
    
@dataclass
class UpdateAttribute:
    target: str
    attribute: str
    expression: any
    def accept(self, visitor):
        return visitor.visitUpdateAttribute(self)


@dataclass
class Condition:
    left: any
    operator: str
    right: any
    def accept(self, visitor):
        return visitor.visitCondition(self)

@dataclass
class AttributeAccess:
    entity: str
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
class RandomValue:
    def accept(self, visitor):
        return visitor.visitRandomValue(self)

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
    def __str__(self):
        return str(self.value)
    def accept(self, visitor):
        return visitor.visitBoolean(self)
    
@dataclass
class TriggerStatement:
    move: str
    user: str
    target: str
    action: List
    def accept(self, visitor):
        return visitor.visitTriggerStatement(self)
    
@dataclass
class TriggerCondition:
    conditions: List
    if_: List
    elif_: List
    else_: List

    def accept(self, visitor):
        return visitor.visitTriggerCondition(self)
    
@dataclass
class TriggerElse:
    actions: any
    def accept(self, visitor):
        return visitor.visitTriggerElse(self)
    
@dataclass
class TriggerElif:
    condition: any
    actions: List
    def accept(self, visitor):
        return visitor.visitTriggerElif(self)

@dataclass
class TriggerAction:
    target: str
    attribute: str
    arithmetic: any

    def accept(self, visitor):
        return visitor.visitTriggerAction(self)
    
@dataclass
class ArithmeticExpression:
    left: any
    operator: str
    right: any
    def accept(self, visitor):
        return visitor.visitArithmeticExpression(self)

@dataclass
class ArithmeticTerm:
    left: any
    operator: str
    right: any
    def accept(self, visitor):
        return visitor.visitArithmeticTerm(self)

@dataclass
class ArithmeticFactor:
    expression: any
    def accept(self, visitor):
        return visitor.visitArithmeticFactor(self)
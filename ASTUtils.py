from dataclasses import dataclass
from abc import ABC, abstractmethod
from typing import List

# Base Class for AST Nodes
class AST(ABC):
    @abstractmethod
    def accept(self, v):
        pass

# Program Node
@dataclass
class Prog(AST):
    expr: AST

    def __str__(self):
        return f"Prog({self.expr})"

    def accept(self, v):
        return v.visitProg(self)

# Binary Operation Node
@dataclass
class BinOp(AST):
    op: str
    left: AST
    right: AST

    def __str__(self):
        return f"BinOp(\"{self.op}\", {self.left}, {self.right})"

    def accept(self, v):
        return v.visitBinOp(self)

# Integer Literal Node
@dataclass
class Int(AST):
    value: int

    def __str__(self):
        return f"Int({self.value})"

    def accept(self, v):
        return v.visitInt(self)

# Variable Reference Node
@dataclass
class Var(AST):
    name: str

    def __str__(self):
        return f"Var(\"{self.name}\")"

    def accept(self, v):
        return v.visitVar(self)

# Parentheses Node
@dataclass
class Parens(AST):
    expr: AST

    def __str__(self):
        return f"Parens({self.expr})"

    def accept(self, v):
        return v.visitParens(self)

# **New Node: Function Call**
@dataclass
class FuncCall(AST):
    func_name: str
    args: List[AST]

    def __str__(self):
        return f"FuncCall(\"{self.func_name}\", {self.args})"

    def accept(self, v):
        return v.visitFuncCall(self)

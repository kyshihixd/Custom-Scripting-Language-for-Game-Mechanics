from CompiledFiles.SampleVisitor import SampleVisitor
from CompiledFiles.SampleParser import SampleParser
from ASTUtils import *

class ASTGeneration(SampleVisitor):
    def visitProgram(self, ctx: SampleParser.ProgramContext):
        return Prog(ctx.expression().accept(self))

    def visitExpression(self, ctx: SampleParser.ExpressionContext):
        if ctx.expression():
            op = "+" if ctx.Add() else "-"
            return BinOp(op, ctx.expression().accept(self), ctx.term().accept(self))
        else:
            return ctx.term().accept(self)

    def visitTerm(self, ctx:SampleParser.TermContext):
        if ctx.term():
            sign = ""
            if ctx.Mul():
                sign = "*"
            elif ctx.Div():
                sign = "/"
            
            return BinOp(sign, ctx.term().accept(self), ctx.factor().accept(self))
        else:
            return ctx.factor().accept(self)
        
    def visitFactor(self, ctx: SampleParser.FactorContext):
        if ctx.funcCall():
            return ctx.funcCall().accept(self)
        elif ctx.expression():
            return Parens(ctx.expression().accept(self))
        if ctx.Integer():
            return self.visitInteger(ctx.Integer())
        
    def visitFuncCall(self, ctx: SampleParser.FuncCallContext):
        func_name = ctx.Id().getText()
        args = [arg.accept(self) for arg in ctx.expression()]
        return FuncCall(func_name, args)

    def visitInteger(self, node: SampleParser.Integer):
        return Int(int(node.getText()))

  
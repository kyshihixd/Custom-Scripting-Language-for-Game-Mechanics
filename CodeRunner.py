import math
from ASTUtils import *

class CodeRunner:
    def visitProg(self, ctx: Prog):
        return ctx.expr.accept(self)

    def visitBinOp(self, ctx: BinOp):
        left = ctx.left.accept(self)
        right = ctx.right.accept(self)

        if ctx.op == "+":
            return left + right
        elif ctx.op == "-":
            return left - right
        elif ctx.op == "*":
            return left * right
        elif ctx.op == "/":
            if right == 0:
                raise ZeroDivisionError("Division by zero.")
            return left / right
        

    def visitInt(self, ctx: Int):
        return ctx.value

    def visitVar(self, ctx: Var):
        raise NotImplementedError("Variables are not supported yet.")

    def visitParens(self, ctx: Parens):
        return ctx.expr.accept(self)

    def visitFuncCall(self, ctx: FuncCall):
        func_name = ctx.func_name
        args = [arg.accept(self) for arg in ctx.args]

        if func_name == "sin":
            return math.sin(args[0])
        elif func_name == "cos":
            return math.cos(args[0])
        elif func_name == "max":
            return max(args)
        elif func_name == "min":
            return min(args)
        else:
            raise NotImplementedError(f"Function '{func_name}' is not supported.")


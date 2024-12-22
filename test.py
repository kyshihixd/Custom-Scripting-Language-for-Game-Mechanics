import sys, os
import subprocess
import unittest
from antlr4 import *
from tkinter import Tk, Text, Button, Label, scrolledtext, END

from CompiledFiles.POKELexer import POKELexer
from CompiledFiles.POKEParser import POKEParser
from antlr4.error.ErrorListener import ErrorListener
# Define your variables
DIR = os.path.dirname(__file__)
ANTLR_JAR = 'C:/Users/Administrator/Desktop/PPL/lab/antlr4-4.9.2-complete.jar' # your location is going here
CPL_Dest = 'CompiledFiles'
SRC = 'POKE.g4'
TESTS = os.path.join(DIR, './tests')

def printUsage():
    print('python run.py gen')
    print('python run.py test')

def printBreak():
    print('-----------------------------------------------')

def generateAntlr2Python():
    print('Antlr4 is running...')
    subprocess.run(['java', '-jar', ANTLR_JAR, '-o', CPL_Dest, '-no-listener', '-visitor', '-Dlanguage=Python3', SRC])    
    print('Generate successfully')

def runCode(astTree):    
    from CodeRunner import CodeRunner
    code_runner = CodeRunner()
    result = astTree.accept(code_runner)
    
    print("Result:", result)

class runTree:
    class CustomErrorListener(ErrorListener):
        def __init__(self):
            self.errors = []

        def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
            self.errors.append(f"Syntax Error: {msg} (Line {line}, Column {column})")

    def __init__(self):
        self.error_listener = self.CustomErrorListener()
        from CodeRunner import CodeRunner  # Import CodeRunner once
        self.code_runner = CodeRunner()

    def process_input(self, input_text):
        """Processes the input text using ANTLR."""
        try:
            # Initialize ANTLR input stream
            input_stream = InputStream(input_text)

            # Lexer and Token Stream
            lexer = POKELexer(input_stream)
            token_stream = CommonTokenStream(lexer)

            # Parser
            parser = POKEParser(token_stream)
            parser.removeErrorListeners()
            parser.addErrorListener(self.error_listener)

            # Parse the input using the 'script' rule
            tree = parser.script()

            # Check for syntax errors
            if self.error_listener.errors:
                return {"success": False, "errors": self.error_listener.errors}

            from ASTGeneration import ASTGeneration
            # Generate AST
            parse_tree_str = tree.toStringTree(recog=parser)
            ast_generator = ASTGeneration()
            ast_tree = tree.accept(ast_generator)

            # Execute the AST using CodeRunner
            result = ast_tree.accept(self.code_runner)

            # Return results
            return {
                "success": True,
                "parse_tree": parse_tree_str,
                "ast": ast_tree,
                "result": result
            }

        except Exception as e:
            return {"success": False, "errors": [str(e)]}

        
def runTest():
    print('Running testcases...')
       
    from CompiledFiles.POKELexer import POKELexer
    from CompiledFiles.POKEParser import POKEParser
    from antlr4.error.ErrorListener import ErrorListener

    class CustomErrorListener(ErrorListener):
        def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
            print(f"Input rejected: {msg}")
            exit(1)  # Exit the program with an error

    filename = 'testcase.txt'
    inputFile = os.path.join(DIR, './tests', filename)    
    
    # Reset the input stream for parsing and catch the error
    lexer = POKELexer(FileStream(inputFile))
    token_stream = CommonTokenStream(lexer)

    parser = POKEParser(token_stream)   
    parser.removeErrorListeners()
    parser.addErrorListener(CustomErrorListener())    
    try:
        parser.script()
        print("Input accepted")
    except SystemExit:        
        pass
    
    printBreak()
    print('Run tests completely')
    
    
    input_stream = FileStream(inputFile)
    lexer = POKELexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = POKEParser(stream)
    tree = parser.script()  
    print(tree.toStringTree(recog=parser))
    
    from ASTGeneration import ASTGeneration
    ast_generator = ASTGeneration()

    asttree = tree.accept(ast_generator)    
    print('This is ast string: ', asttree)
    
    from CodeRunner import CodeRunner
    code_runner = CodeRunner()
    result = asttree.accept(code_runner)
    

def main(argv):
    print('Complete jar file ANTLR  :  ' + str(ANTLR_JAR))
    print('Length of arguments      :  ' + str(len(argv)))    
    printBreak()

    if len(argv) < 1:
        printUsage()
    elif argv[0] == 'gen':
        generateAntlr2Python()    
    elif argv[0] == 'test':       
        runTest()
    else:
        printUsage()



if __name__ == '__main__':
    main(sys.argv[1:])  
    
    
    
grammar POKE;

// Parser rules
script         : statement*;

statement       : pokemon
                | move
                | action_statement
                | condition_statement
                | update_attr_statement
                ;

pokemon: 'pokemon' IDENTIFIER '{' pokemon_body '}';
pokemon_body : (pokemon_attribute (';')?)*;
pokemon_attribute       : IDENTIFIER ':' value;


move : 'move' IDENTIFIER '{' move_body '}';
move_body       : (move_attribute (';')?)*;
move_attribute  : IDENTIFIER ':' value;

action_statement: IDENTIFIER 'uses' IDENTIFIER;

update_attr_statement: 'update' IDENTIFIER '.' IDENTIFIER 'to' value ';';
condition_statement: 'if' '(' (condition(';')?)* ')' '{' (statement(';')?)* '}';
condition       : expression comparison_operator expression;

expression      : IDENTIFIER'.'IDENTIFIER
                | value
                ;

comparison_operator
                : '<' | '>' | '==' | '!=';

value           : STRING
                | INT
                | FLOAT
                | BOOLEAN
                ;

// Lexer rules
IDENTIFIER      : [a-zA-Z_][a-zA-Z_0-9]*;
STRING          : '"' .*? '"';
INT             : [0-9]+;
FLOAT           : [0-9]+ '.' [0-9]+;
BOOLEAN         : 'true' | 'false';

WHITESPACE      : [ \t\r\n]+ -> skip;
COMMENT         : '//' ~[\r\n]* -> skip;
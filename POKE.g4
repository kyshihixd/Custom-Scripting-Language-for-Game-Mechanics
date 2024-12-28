grammar POKE;

// Parser rules
script         : statement*;

statement       : pokemon
                | move
                | action_statement
                | update_attr_statement
                | status
                | trigger_statement
                ;

pokemon: 'pokemon' IDENTIFIER '{' pokemon_body '}';
pokemon_body : (pokemon_attribute ';')*;
pokemon_attribute       : IDENTIFIER ':' value;


move : 'move' IDENTIFIER '{' move_body '}';
move_body       : (move_attribute ';')*;
move_attribute  : IDENTIFIER ':' value;


action_statement: IDENTIFIER 'uses' IDENTIFIER 'on' IDENTIFIER;

trigger_statement: 'trigger' IDENTIFIER '('IDENTIFIER ',' IDENTIFIER')' '{' ((trigger_action | trigger_condition) ';')* '}';
trigger_condition: 'if' '(' condition ')' '{' (trigger_action ';')* '}' (trigger_elif)* ('else' '{' (trigger_else ';')* '}')? ;
trigger_elif: 'elif' '(' condition ')' '{' (trigger_action ';')* '}';
trigger_else: trigger_action;
trigger_action: IDENTIFIER '.' IDENTIFIER '=' arithmatic;
arithmatic: arithmatic ('+' | '-') term | term;
term: term ('/' | '*') factor | factor;
factor:'(' arithmatic ')'| value | IDENTIFIER'.'IDENTIFIER;



status: 'status' IDENTIFIER;
update_attr_statement: 'update' IDENTIFIER '.' IDENTIFIER 'to' expression;


condition       : expression comparison_operator expression ;
expression      : IDENTIFIER'.'IDENTIFIER
                | value
                ;
comparison_operator
                : '<' | '>' | '==' | '!=';

// Lexer rules

STRING          : '"' .*? '"';
INT             : [0-9]+;
FLOAT           : [0-9]+ '.' [0-9]+;
BOOLEAN         : 'true' | 'false';
RANDOM          : 'random'; 
IDENTIFIER      : [a-zA-Z_][a-zA-Z_0-9]*;

value           : RANDOM
                | INT
                | FLOAT
                | BOOLEAN
                | STRING
                ;


WHITESPACE      : [ \t\r\n]+ -> skip;
COMMENT         : '//' ~[\r\n]* -> skip;
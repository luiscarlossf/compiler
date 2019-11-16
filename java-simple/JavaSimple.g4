grammar JavaSimple;
r : PROGRAM ID '{' stmt? func_stmt block_stmt '}';
//Declaração de variáveis e constantes
stmt: vars ';' stmt? 
	| constant ';' stmt?;
vars : type ':' ID (',' ID)*;
constant : CONST type ID '=' NUMBER ;
type: TYPE;

//Declaração de funções
func_stmt: ('func' type ID '(' params? ')' '{' block '}')*;
params: param (',' param)*;
param: type ':' ID;

rtn_stmt:'return' '(' (expr| '') ')';
 
//Block
block_stmt: 'block' '{' block '}';
block: (builtin_stmt ';' | assign ';' | if_stmt | for_stmt | expr ';' | rtn_stmt ';')*;

//Funções nativas
builtin_stmt: PRINT '(' expr_list ')' 
	| READ  '(' var_list ')';
	
expr_list: expr (',' expr)*;
var_list: ID (',' ID)*;

//Comando de atribuição
assign:  ID '=' expr ;

//Expressões
expr: 
	| '!' expr
	| '-' expr
	| ('++'|'--') expr
	| expr ('*' | '/') expr
	| expr ('+' | '-') expr
	| expr ('==' | '!=') expr
	| expr ('>='|'<='|'>'|'<') expr
	| '('expr')'
	| ID '(' (expr_list| '') ')'
	| (ID | NUMBER | STRING | BOOLEAN);

if_stmt: IF '(' expr ')''{' block '}'( ELSE '{' block '}')?;
	
	

for_stmt: FOR '('(assign (',' assign)*)? ';' expr ';' (assign (',' assign)*)? ')''{' for_block '}';
for_block: block
         | 'break'';';


fragment
Letra : [a-z]+;

fragment
Digito: [0-9];

fragment
Inteiro: Digito+;

fragment
Float: Digito+ '.' Digito* | '.' Digito+;

fragment
ESC: '\\' [btnr"\\]; // \b, \t, \n, etc...

//Comentários
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip;
COMMENT: '/*' .*? '*/' -> skip;

//Palavras reservadas
IF: 'if'{System.out.print(" IF ");};
PROGRAM: 'program' {System.out.print("\n PROGRAM ");};
FUNC: 'func'{System.out.print(" FUNC ");};
RETURN: 'return'{System.out.print(" RETURN ");};
ELSE: 'else' {System.out.print(" ELSE ");};
PRINT: 'print' {System.out.print(" PRINT ");};
BLOCK: 'block' {System.out.print(" BLOCK ");};
READ: 'read' {System.out.print(" READ ");};
FOR: 'for' {System.out.print(" FOR ");};
ASSIGN: '=' {System.out.print(" ASSIGN ");};
CONST: 'const' {System.out.print(" CONST ");};
TYPE: ('int'|'string'|'boolean'|'float') {System.out.print(" TYPE ");};

//Tipos
STRING: '"' (ESC|.)*? '"'{System.out.print(" STRING ");}; 
BOOLEAN: ('TRUE'|'FALSE') {System.out.print(" BOOLEAN ");};
NUMBER: (Inteiro|Float) {System.out.print(" NUMBER ");};

DOISPONTOS: ':'{System.out.print(" : ");};
VIRGULA: ',' {System.out.print(" , ");};
CHAVEIN: '{'{System.out.print(" { ");};
CHAVEOUT: '}'{System.out.print(" } ");};
PARAIN: '('{System.out.print(" ( ");};
PARAOUT: ')'{System.out.print(" ) ");};
PONTOVIRGULA: ';'{System.out.print(" ; ");};


//Operadores
/*
 NEG: '!' {System.out.print(" NEG ");};
 LESS: '-' {System.out.print(" LESS ");};
 PLUS: '+' {System.out.print(" PLUS ");};
 SUB: '-' {System.out.print(" SUB ");};
 MULT: '*' {System.out.print(" MULT ");};
 DIV: '/' {System.out.print(" DIV ");};
 INC: '++' {System.out.print(" INC ");};
 DEC: '--' {System.out.print(" DEC ");};
 RELOP: ('=='|'!='|'>='|'<='|'>'|'<') {System.out.print(" RELOP ");};
*/ 
 
//Identificadores
 ID : Letra (Letra|Inteiro)* {System.out.print(" ID ");}; 
 
 WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
 
 

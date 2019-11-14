grammar JavaSimple;
r : PROGRAM ID '{' decl? '}';
decl: variable decl? | constant decl?;
variable : type ':' ids;
constant : CONST type ID '=' NUMBER ';';
ids: ID (',' ID)* ';';
type: TYPE;

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
 NEG: '!' {System.out.print(" NEG ");};
 LESS: '-' {System.out.print(" LESS ");};
 PLUS: '+' {System.out.print(" PLUS ");};
 SUB: '-' {System.out.print(" SUB ");};
 MULT: '*' {System.out.print(" MULT ");};
 DIV: '/' {System.out.print(" DIV ");};
 INC: '++' {System.out.print(" INC ");};
 DEC: '--' {System.out.print(" DEC ");};
 RELOP: ('=='|'!='|'>='|'<='|'>'|'<') {System.out.print(" RELOP ");};
 
 
//Identificadores
 ID : Letra (Letra|Inteiro)* {System.out.print(" ID ");}; 
 
 WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
 
 

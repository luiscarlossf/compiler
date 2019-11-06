
grammar JavaSimple;
r : 'Hello'; //NÃO ENTENDI PRA QUE SERVE ISSO!!!!!!!!!!!!

fragment
Letra : [a-z]+;
fragment
Inteiro: [0-9]+;
fragment
Float: Inteiro '.'?Inteiro*;

DOISPONTOS: ':';
VIRGULA: ',';
CHAVEIN: '{';
CHAVEOUT: '}';
PARAIN: '(';
PARAOUT: ')';
PONTOVIRGULA: ';';

//Palavras reservadas
IF: 'if';
PROGRAM: 'program';
FUNC: 'func';
RETURN: 'return';
ELSE: 'else';
PRINT: 'print';
BLOCK: 'block';
READ: 'read';
FOR: 'for';
ASSIGN: '=';
CONST: 'const';
TYPE: 'int'|'string'|'boolean'|'float';

//Tipos
STRING: '"'( ~('"'|'\n') )* '"'; //VERIFICAR ISSO, PRA VER SE TÁ PEGANDO A STRING CORRETAMENTE;
BOOLEAN: ['TRUE''FALSE'];
NUMBER: Inteiro|Float;

//Operadores
 NEG: '!';
 LESS: '-';
 PLUS: '+';
 SUB: '-';
 MULT: '*';
 DIV: '/';
 INC: '++';
 DEC: '--';
 RELOP: ['==''!=''>=''<=''>''<'];
 
 
//Identificadores
 ID : Letra (Letra|Inteiro)*; 
 
 WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
 
 

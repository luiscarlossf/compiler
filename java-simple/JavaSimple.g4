grammar JavaSimple;
@header{
	import symboltable.*;
	import java.util.HashMap;
	import java.util.Map;
	
}
@parser::members{
	SymbolTable symtab = new SymbolTable();
	Map <String, MethodSymbol> functables = new HashMap <String, MethodSymbol>();
	int temp = 0;
	int label = 0;
}

r @after{System.out.println(symtab);}: PROGRAM ID '{' stmt? func_stmt block_stmt '}';
//Declaração de variáveis e constantes
stmt : vars ';' stmt? 
	| constant ';' stmt?;
vars : type ':' ID (',' ID)* {
        System.out.println("line "+$ID.getLine()+": def "+$ID.text);
    	VariableSymbol vs = new VariableSymbol($ID.text,$type.tsym);
    	symtab.define(vs);
};
constant : CONST type ID '=' NUMBER {};
type returns [Type tsym]
    :   'float' {$tsym = (Type)symtab.resolve("float");}
    |   'int'   {$tsym = (Type)symtab.resolve("int");}
    |   'string' {$tsym = (Type)symtab.resolve("string");}
    |   'boolean' {$tsym = (Type)symtab.resolve("boolean");}
    ;

//Declaração de funções
func_stmt @init { MethodSymbol f = new MethodSymbol();} 
         @after{System.out.println(functables);}
    : ('func' a=type ID {
    	f = new MethodSymbol($ID.text, $a.tsym, (Scope) symtab);
    	functables.put($ID.text, f); 
      } '(' (type ':' ID (',' type ':' ID)*)? ')' '{' block '}')*{
	VariableSymbol vs = new VariableSymbol($ID.text,$type.tsym);
	f.define(vs);
};
//params: type ':' ID (',' type ':' ID)*;

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
assign returns [String code, String place]:  ID '=' expr {
		$place = $ID.text;
		$code = $expr.code + $place "=" $expr.place;
	};

//Expressões
expr returns [String code, String place]: 
	| op='!' e1=expr{
		$place = "_t"+temp;
		temp++;
		$code = $e1.code + $e2.code + $place "="  op + $e1.place;
	}
	| op='-' e1=expr{
		$place = "_t"+temp;
		temp++;
		$code = $e1.code + $e2.code + $place "="  op + $e1.place;
	}
	| op=('++'|'--') e1=expr{
		$place = "_t"+temp;
		temp++;
		$code = $e1.code + $e2.code + $place "="  op + $e1.place;
	}
	| e1=expr op=('*' | '/') e2=expr{
		$place = "_t"+temp;
		temp++;
		$code = $e1.code + $e2.code + $place "=" $e1.place + op + $e2.place;
	}
	| e1=expr op=('+' | '-') e2=expr {
		$place = "_t"+temp;
		temp++;
		$code = $e1.code + $e2.code + $place "=" $e1.place + op + $e2.place;
	}
	| e1=expr op=('==' | '!=') e2=expr {
		$place = "_t"+temp;
		temp++;
		$code = $e1.code + $e2.code + $place "=" $e1.place + op + $e2.place;
	}
	| e1=expr relop=('>='|'<='|'>'|'<') e2=expr{
		$place = "_t"+temp;
		temp++;
		$code = $e1.code + $e2.code + $place "=" $e1.place + relop + $e2.place;
	}
	| ID '(' (expr_list| '') ')'
	| '('e1=expr')' {
		$place = $e1.place;
		$code = $e1.code;
	}
	| ID {
		$place = $ID.text;
		$code = "";
	}
	| NUMBER {
		$place = $NUMBER.text;
		$code = "";
	}
	| STRING {
		$place = $STRING.text;
		$code = "";
	}
	| BOOLEAN{
		$place = $BOOLEAN.text;
		$code = "";
	};

if_stmt returns [String code, String place]: IF '(' expr ')''{' b1=block '}'( ELSE '{' b2=block '}')?{
	String lelse = ".l"+label;
	label++;
	String lend = ".l"+label;
	label++;
	$code = $expr.code + "\n\t" + 
			"if(" + $expr.place + " == False): goto " + lelse + "\n\t"
			+ $b1.code + "\n\tgoto " + lend + "\n\tlabel " + lelse + "\n\t"
			+ $b2.code + "\n\tlabel " + lend;
};
	
	

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
//TYPE: ('int'|'string'|'boolean'|'float') {System.out.print(" TYPE ");};

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
 
 

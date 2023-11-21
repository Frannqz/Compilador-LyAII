import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column
%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }
%}
/* Variables básicas de comentarios y espacios */
TerminadorDeLinea = \r|\n|\r\n
EntradaDeCaracter = [^\r\n]
EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
ComentarioTradicional = "/*" [^*] ~"*/" | "/*" "*"+ "/"
FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "/**" {ContenidoComentario} "*"+ "/"

/* Comentario */
Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}

/* Identificador */
Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*
Numero = {Digito} ({Digito})*

/* Número */
Numero = 0 | [1-9][0-9]*
%%

/* Comentarios o espacios en blanco */
{Comentario}|{EspacioEnBlanco} { /*Ignorar*/ }


/*Numeros*/
{Numero} "." {Numero} { return token(yytext(), "26", yyline, yycolumn); }/*REAL*/
{Numero} { return token(yytext(), "27", yyline, yycolumn); } /* NUMERO */

/*Operadores*/
"+" { return token(yytext(), "1", yyline, yycolumn); }/* SUMA */
"-" { return token(yytext(), "2", yyline, yycolumn); }/* RESTA */
"/" { return token(yytext(), "3", yyline, yycolumn); }/* DIVISION */
"*" { return token(yytext(), "4", yyline, yycolumn); }/* MULTIPLICACION */

/*Relacionales*/
"==" { return token(yytext(), "5", yyline, yycolumn); }/* IGUAL */
"!=" { return token(yytext(), "6", yyline, yycolumn); }/* DIFERENTE */
">" { return token(yytext(), "7", yyline, yycolumn); }/* MAYOR QUE */
"<" { return token(yytext(), "8", yyline, yycolumn); }/* MENOR QUE */
">=" { return token(yytext(), "9", yyline, yycolumn); }/* MAYOR IGUAL QUE */
"<=" { return token(yytext(), "10", yyline, yycolumn); }/* MENOR IGUAL QUE */

/* Puntuacion */
"." { return token(yytext(), "11", yyline, yycolumn); }/* PUNTO */
"," { return token(yytext(), "12", yyline, yycolumn); }/* COMA */
":" { return token(yytext(), "13", yyline, yycolumn); }/* DOSPUNTOS */
";" { return token(yytext(), "14", yyline, yycolumn); }/* PUNTO COMA */
\' { return token(yytext(), "15", yyline, yycolumn); }/* COMILLA SIMPLE */
\" [a-zA-Z0-9_.-]* \" { return token(yytext(), "16", yyline, yycolumn); }/* CADENA */

"=" { return token(yytext(), "16", yyline, yycolumn); }/* ASIGNACION */


\" { return token(yytext(), "17", yyline, yycolumn); }/*COMILLA DOBLE*/
\( { return token(yytext(), "18", yyline, yycolumn); }/*PARENTESIS ABIERTO*/
\) { return token(yytext(), "19", yyline, yycolumn); }/*PARENTESIS CERRADO*/
\{ { return token(yytext(), "20", yyline, yycolumn); }/*LLAVE ABIERTO*/
\} { return token(yytext(), "21", yyline, yycolumn); }/*LLAVE CERRADO*/
\[ { return token(yytext(), "22", yyline, yycolumn); }/*CORCHETE ABIERTO*/
\] { return token(yytext(), "23", yyline, yycolumn); }/*CORCHETE CERRADO*/

"++" { return token(yytext(), "24", yyline, yycolumn); }/*INCREMENTO*/
"--" { return token(yytext(), "25", yyline, yycolumn); }/*DECREMENTO*/

/*Palabras reservadas*/
"IMPORT" | "import" | "Import" { return token(yytext(), "200", yyline, yycolumn); }/*IMPORT*/
"DEF" | "def" | "Def" { return token(yytext(), "201", yyline, yycolumn); }/*DEF*/
"CLASS" | "class" | "Class" { return token(yytext(), "203", yyline, yycolumn); }/*CLASS*/


"INT" | "int" | "Int" { return token(yytext(), "101", yyline, yycolumn); }/*INT*/
"STRING" | "string" | "String" { return token(yytext(), "102", yyline, yycolumn); }/*STRING*/
"FLOAT" | "float" | "Float" { return token(yytext(), "103", yyline, yycolumn); }/*FLOAT*/
"BOOLEAN" | "boolean" | "Boolean" { return token(yytext(), "104", yyline, yycolumn); }/*BOOLEAN*/

"WHILE" | "while" | "While" { return token(yytext(), "105", yyline, yycolumn); }/*WHILE*/
"IF" | "if" | "If" { return token(yytext(), "106", yyline, yycolumn); }/*IF*/
"ELSE" | "else" | "Else" { return token(yytext(), "107", yyline, yycolumn); }/*ELSE*/
"FOR" | "for" | "For" { return token(yytext(), "108", yyline, yycolumn); }/*IMPORT*/

"INPUT" | "input" | "Input" { return token(yytext(), "109", yyline, yycolumn); }/*INPUT*/
"OUTPUT" | "output" | "Output" { return token(yytext(), "110", yyline, yycolumn); }/*OUTPUT*/
"TRY" | "try" | "Try" { return token(yytext(), "111", yyline, yycolumn); }/*TRY*/
"EXCEPT" | "except" | "Except" { return token(yytext(), "112", yyline, yycolumn); }/*EXCEPT*/
"RETURN" | "return" | "Return" { return token(yytext(), "113", yyline, yycolumn); }/*RETURN*/
"BREAK" | "break" | "Break" { return token(yytext(), "114", yyline, yycolumn); }/*BREAK*/
"NEXT" | "next" | "Next" { return token(yytext(), "115", yyline, yycolumn); }/*NEXT*/
"PRINT" | "print" | "Print" { return token(yytext(), "116", yyline, yycolumn); }/*PRINT*/


"IN" | "in" | "In" { return token(yytext(), "117", yyline, yycolumn); }/*IN*/
"RANGE" | "range" | "Range" { return token(yytext(), "118", yyline, yycolumn); }/*RANGE*/
"SELF" | "self" | "Self" { return token(yytext(), "119", yyline, yycolumn); }/*SELF*/




"TRUE" | "true" | "True" { return token(yytext(), "120", yyline, yycolumn); }/*TRUE*/
"FALSE" | "false" | "False" { return token(yytext(), "121", yyline, yycolumn); }/*FALSE*/

/* Logicos */
"AND" | "and" | "And" { return token(yytext(), "122", yyline, yycolumn); }/*AND*/
"OR" | "or" | "Or" { return token(yytext(), "123", yyline, yycolumn); }/*OR*/
"NOT" | "not" | "Not" { return token(yytext(), "124", yyline, yycolumn); }/*NOT*/


"POWER" | "power" | "Power" { return token(yytext(), "POWER", yyline, yycolumn); }/*POWER*/
"SQRT" | "sqrt" | "Sqrt" { return token(yytext(), "SQRT", yyline, yycolumn); }/*SQRT*/


"BEGIN" | "begin" | "Begin" { return token(yytext(), "BEGIN", yyline, yycolumn); }/*BEGIN*/
"END" | "end" | "End" { return token(yytext(), "END", yyline, yycolumn); }/*"END*/

/* Variables */
{Identificador} { return token(yytext(), "300", yyline, yycolumn); }/*VARIABLE*/


/**/
. { return token(yytext(), "ERROR", yyline, yycolumn); }/*ERROR*/


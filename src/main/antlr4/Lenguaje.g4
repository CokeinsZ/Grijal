grammar Lenguaje;


programa
: instruccion* EOF
;


instruccion
: asignacion '\n'? # InstruccionAsignacion
| expresion '\n'? # InstruccionExpresion
;


// La sintaxis pedida: "asignar miVar<tipo> = valor"
asignacion
: 'asignar' IDENTIFICADOR '<' TIPO '>' '=' expresion
;


expresion
: literal # Lit
| IDENTIFICADOR # Id
| expresion '+' expresion   # Suma
;


literal
: ENTERO
| DECIMAL
| CADENA
| BOOLEANO
;


// Tokens
TIPO
: 'entero' | 'decimal' | 'texto' | 'booleano'
;

IDENTIFICADOR
: [a-zA-Z][a-zA-Z0-9]*
;


ENTERO
: [0-9]+
;


DECIMAL
: [0-9]+ '.' [0-9]+
;


CADENA
: '"' (~["\\])* '"'
;


BOOLEANO
: 'verdadero' | 'falso'
;


WS
: [ \t\r]+ -> skip
;


LINE_COMMENT
: '//' ~[\r\n]* -> skip
;


NEWLINE
: '\r'? '\n' -> skip
;
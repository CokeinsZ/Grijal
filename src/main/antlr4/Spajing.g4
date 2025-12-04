grammar Spajing;

@header {
package generated;
}

// Reglas del parser
programa
    : CLASE ID ':' bloque FIN EOF
    ;

bloque
    : sentencia*
    ;

sentencia
    : declaracion
    | asignacion
    | condicional
    | bucle
    | mostrar
    ;

declaracion
    : tipo ID ASIGNACION expresion ';'
    ;

tipo
    : ENTERO_TIPO
    | REAL_TIPO
    | LOGICO_TIPO
    | TEXTO_TIPO
    ;

asignacion
    : ID ASIGNACION expresion ';'
    ;

condicional
    : PREGUNTA expresion ':' bloque (SINO ':' bloque)? FIN_CONDICIONAL
    ;

bucle
    : MIENTRAS expresion ':' bloque FIN_CONDICIONAL
    ;

mostrar
    : MOSTRAR '(' expresion ')' ';'
    ;

expresion
    : expresion op=('*'|'/'|'%') expresion      # Multiplicacion
    | expresion op=('+'|'-') expresion          # Adicion
    | expresion op=('>'|'<'|'>='|'<='|'=='|'!=') expresion # Comparacion
    | expresion AND expresion                   # AndExpr
    | expresion OR expresion                    # OrExpr
    | NOT expresion                             # NotExpr
    | '(' expresion ')'                         # Parentesis
    | literal                                   # LiteralExpr
    | ID                                        # IdExpr
    ;

literal
    : ENTERO
    | REAL
    | CADENA
    | BOOLEANO
    ;

// Tokens - PALABRAS RESERVADAS
CLASE: 'Clase';
PREGUNTA: 'pregunta';
SINO: 'sino';
MIENTRAS: 'mientras';
MOSTRAR: 'mostrar';
FIN: 'Fin';
FIN_CONDICIONAL: 'fin';

// Tipos
ENTERO_TIPO: 'entero';
REAL_TIPO: 'real';
LOGICO_TIPO: 'logico';
TEXTO_TIPO: 'texto';

// Operadores lógicos
AND: 'y';
OR: 'o';
NOT: 'no';

// Operador de asignación
ASIGNACION: '--:';

// Literales
BOOLEANO: 'verdadero' | 'falso';
ENTERO: [0-9]+;
REAL: [0-9]+ '.' [0-9]+;
CADENA: '"' (~["])* '"';

// Identificadores
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Espacios y comentarios
WS: [ \t\r\n]+ -> skip;
COMENTARIO: '//' ~[\r\n]* -> skip;

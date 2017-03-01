grammar nombrescompletos;
// reglas sintácticas
//inicio de gramatica "inicio" debe de ir tambien en el Main de java el mismo nombre
inicio : ARTICULO? RECIPIENTE DE bebida ;
bebida : TEXTO;

 // reglas lexicas
ARTICULO : 'la' |  'un' ;
DE : 'de' ;
RECIPIENTE : 'taza' | 'copa' | 'vaso' ;
TEXTO : ('a'..'z')+ ;
 
WS
:
	[ \t\r\n]+ -> skip
;
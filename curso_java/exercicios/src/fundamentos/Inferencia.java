package fundamentos;

public class Inferencia {

	public static void main(String[] args) { //porta de entrada para a execu��o de um c�digo
		
		double a = 4.5;
		System.out.println(a);
		
		//Atribui o tipo da vari�vel por infer�ncia (pelo valor setado);
		var b = 7.5; 
		System.out.println(b);
		
//		b = "texto"; esta forma n�o � poss�vel reatribuir uma variavel por infer�ncia
/* Ao declarar uma vari�vel do tipo VAR, � necess�rio j� inicializar ela, pois a partir
		da inicializa��o o java consegue inferir o tipo de dado associado a aquela vari�vel */
		
	}
}

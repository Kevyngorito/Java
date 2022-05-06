package fundamentos;

public class Inferencia {

	public static void main(String[] args) { //porta de entrada para a execução de um código
		
		double a = 4.5;
		System.out.println(a);
		
		//Atribui o tipo da variável por inferência (pelo valor setado);
		var b = 7.5; 
		System.out.println(b);
		
//		b = "texto"; esta forma não é possível reatribuir uma variavel por inferência
/* Ao declarar uma variável do tipo VAR, é necessário já inicializar ela, pois a partir
		da inicialização o java consegue inferir o tipo de dado associado a aquela variável */
		
	}
}

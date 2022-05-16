package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// if (...) sentenca; ou {}
		// while (...) sentenca; ou {}
		// for (...; ...; ...) 1- Inicialização da variável, 2-expressão,
		// 3-modificação da variável (incremento/decremento e etc...) sentenca; ou {}
		
		// do {} sem expressão associada ao do while (...);
		// única estrutura de controle que termina com ;
		 
		Scanner entrada = new Scanner (System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar algo: ");
			System.out.print("Quer sair? ");
			
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigado!");
		
		entrada.close();
		
		
	}
}

package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// if (...) sentenca; ou {}
		// while (...) sentenca; ou {}
		// for (...; ...; ...) 1- Inicializa��o da vari�vel, 2-express�o,
		// 3-modifica��o da vari�vel (incremento/decremento e etc...) sentenca; ou {}
		
		// do {} sem express�o associada ao do while (...);
		// �nica estrutura de controle que termina com ;
		 
		Scanner entrada = new Scanner (System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voc� precisa falar algo: ");
			System.out.print("Quer sair? ");
			
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigado!");
		
		entrada.close();
		
		
	}
}

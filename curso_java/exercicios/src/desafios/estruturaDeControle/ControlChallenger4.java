package desafios.estruturaDeControle;

import java.util.Scanner;

public class ControlChallenger4 {

	public static void main(String[] args) {
		
		int controle = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = entrada.nextInt();
		
		for(int i = 2; i < numero; i++)
			if(numero % i == 0) {
				controle++;
			}
			
			switch(controle) {
			case 0:
				System.out.println("O número " + numero + " é um número primo.");
				break;
			default:
				
				System.out.println("O número " + numero + " não é um número primo.");
				break;
			}
			
		
		entrada.close();
	}
}

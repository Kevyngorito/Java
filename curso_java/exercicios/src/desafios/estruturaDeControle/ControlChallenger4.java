package desafios.estruturaDeControle;

import java.util.Scanner;

public class ControlChallenger4 {

	public static void main(String[] args) {
		
		int controle = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		int numero = entrada.nextInt();
		
		for(int i = 2; i < numero; i++)
			if(numero % i == 0) {
				controle++;
			}
			
			switch(controle) {
			case 0:
				System.out.println("O n�mero " + numero + " � um n�mero primo.");
				break;
			default:
				
				System.out.println("O n�mero " + numero + " n�o � um n�mero primo.");
				break;
			}
			
		
		entrada.close();
	}
}

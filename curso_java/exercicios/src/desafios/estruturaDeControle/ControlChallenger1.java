package desafios.estruturaDeControle;

import java.util.Scanner;

public class ControlChallenger1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um ano para verifica��o: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("Este ano � um ano bissexto!");
		} else {
			System.out.println("Este n�o � um ano bissexto!");
		}
		
		entrada.close();
	}
}

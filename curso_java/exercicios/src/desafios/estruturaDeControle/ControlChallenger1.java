package desafios.estruturaDeControle;

import java.util.Scanner;

public class ControlChallenger1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um ano para verificação: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("Este ano é um ano bissexto!");
		} else {
			System.out.println("Este não é um ano bissexto!");
		}
		
		entrada.close();
	}
}

package desafios;

import java.util.Scanner;

public class ControlChallenger0 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um n�mero entre 0 e 10: ");
		int number = entrada.nextInt();
		
		if(number % 2 == 0 && number >= 0 && number <= 10) {
			System.out.printf("O n�mero informado %d � par.", number);
		} else if (number % 2 == 1 && number >= 0 && number <= 10) {
			System.out.printf("O n�mero informado %d � �mpar.", number);
		} else {
			System.out.println("Favor informe um n�mero v�lido!");
		}
		
		entrada.close();
	}
}

package desafios;

import java.util.Scanner;

public class ControlChallenger0 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número entre 0 e 10: ");
		int number = entrada.nextInt();
		
		if(number % 2 == 0 && number >= 0 && number <= 10) {
			System.out.printf("O número informado %d é par.", number);
		} else if (number % 2 == 1 && number >= 0 && number <= 10) {
			System.out.printf("O número informado %d é ímpar.", number);
		} else {
			System.out.println("Favor informe um número válido!");
		}
		
		entrada.close();
	}
}

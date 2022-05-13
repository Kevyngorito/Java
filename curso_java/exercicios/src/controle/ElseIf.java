package controle;

import java.util.Scanner;


public class ElseIf {

	public static void main(String[] args) {
		/*
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0) {
			System.out.printf("O número %d é um número par", numero);
		} else {
			System.out.printf("O número %d é um número ímpar", numero);			
		}
		*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota inválida!");
		} else if (nota>= 8.5) {
			System.out.println("Conceito A");
		} else if (nota>= 6.1) {
			System.out.println("Conceito B");
		} else {
			System.out.println("Nota válida!");
		}
		
		
		entrada.close();
		
	}
}

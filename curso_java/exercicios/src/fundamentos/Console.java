package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		/*
		//Print sem quebra de linha
		System.out.print("Bom");
		System.out.print(" dia\n\n");
		
		//Print formatado
		// %n também é utilizado como quebra de linha, igual a \n
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		//Utilizando tipo float e setando apenas 1 casa decimal, o valor será arredondado para .6
		System.out.printf("Salário: %.1f %n", 1234.5678);
		System.out.printf("Nome: %s %n", "Matheus");
		
		//Captura entrada do usuário IN
		//System.in = entrada do sistema já o System.out é a saída do sistema por padrão a TELA
		//Scanner = tipo, entrada = nome da variável, = recebe a criação no caso new Scanner(System.in);
		//O scanner precisa dentro dos () receber qual é a entrada que será escaneada.
		 */
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite o seu nome: ");
		
		//Aguarda o usuário digitar uma informação
		//Atribui o valor digitado a uma variável nome que é tipada como String
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();//nextLine é usado por retornar uma String
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();//nextInt é usado por retornar um inteiro

		if (idade >= 18) {
			System.out.println("Entrada permitida \n");
			System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		} else {
			System.out.println("Entrada não permitida, fim do programa.");
		}
		
		//System.out.println("\n\nNome digitado = " + nome.concat(" " + sobrenome));
		
		
		
		//Este comando serve para FECHAR o Scanner, pois ele fica aberto ocupando recursos da máquina
		entrada.close();
		
	}
}

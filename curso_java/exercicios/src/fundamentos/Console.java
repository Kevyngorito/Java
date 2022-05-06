package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		/*
		//Print sem quebra de linha
		System.out.print("Bom");
		System.out.print(" dia\n\n");
		
		//Print formatado
		// %n tamb�m � utilizado como quebra de linha, igual a \n
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		//Utilizando tipo float e setando apenas 1 casa decimal, o valor ser� arredondado para .6
		System.out.printf("Sal�rio: %.1f %n", 1234.5678);
		System.out.printf("Nome: %s %n", "Matheus");
		
		//Captura entrada do usu�rio IN
		//System.in = entrada do sistema j� o System.out � a sa�da do sistema por padr�o a TELA
		//Scanner = tipo, entrada = nome da vari�vel, = recebe a cria��o no caso new Scanner(System.in);
		//O scanner precisa dentro dos () receber qual � a entrada que ser� escaneada.
		 */
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite o seu nome: ");
		
		//Aguarda o usu�rio digitar uma informa��o
		//Atribui o valor digitado a uma vari�vel nome que � tipada como String
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();//nextLine � usado por retornar uma String
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();//nextInt � usado por retornar um inteiro

		if (idade >= 18) {
			System.out.println("Entrada permitida \n");
			System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		} else {
			System.out.println("Entrada n�o permitida, fim do programa.");
		}
		
		//System.out.println("\n\nNome digitado = " + nome.concat(" " + sobrenome));
		
		
		
		//Este comando serve para FECHAR o Scanner, pois ele fica aberto ocupando recursos da m�quina
		entrada.close();
		
	}
}

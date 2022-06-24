package arrays.challengers;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		System.out.println("Informe quantas notas deverão ser computadas: ");
		Scanner entrada = new Scanner(System.in);
		//Colhe a quantidade de notas e armazena
		int qtdNotas = entrada.nextInt();
		//Cria um novo array com o tamanho apontando para a quantidade coletada
		double[] notas = new double [qtdNotas];

		/*O primeiro for pega o array notas na posição [i] que será o valor do contador
		 * a ser percorrido e atribui o valor de cada posição para ser colhida pelo nextInt*/
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota: " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		
		//Cria uma variável do tipo double para armazenar o total
		double total = 0;
		
		/*O foreach nota retornará todos os valores do array notas ao somar total + notas
		 * estaremos somando todas as notas do array, tendo assim um total geral*/
		
		for(double nota: notas) {
			total += nota;
		}
		
		//O cálculo de média é atribuído a uma variável do tipo double
		double media = total / notas.length;
		System.out.println("A média é: " + media + "!");
		
		entrada.close();
	}
}

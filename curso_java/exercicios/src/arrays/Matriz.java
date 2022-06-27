package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos? ");
		int qtdAlunos = entrada.nextInt();
		System.out.println("Quantas notas por aluno? ");
		int qtdNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		
		/*Cria-se 2 laços de repetição o mais externo para que seja
		 * percorrido os alunos e o mais intero para que seja percorrido
		 * o valor das notas do mesmo, logo a cada repetição do primeiro
		 * o mais interno será repetido x vezes.*/
		
		double total = 0;
		
		//Controla os alunos
		for(int i = 0; i < notasDaTurma.length; i++) {
			//Controla as notas
			//Necessita apontar a posição de i
			for(int j = 0; j < notasDaTurma[i].length; j++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", (j +1), (i + 1));
				notasDaTurma[i][j] = entrada.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média da turma é " + media);
		
		/*Neste caso quando estivermos percorrendo o laço mais externos, no caso notasDaTurma, cada um dos elementos será, também, 
		 * um array de double, apontando para notasDoAluno*/ 
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		entrada.close();
	}
}

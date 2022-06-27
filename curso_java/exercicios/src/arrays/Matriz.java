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
		
		/*Cria-se 2 la�os de repeti��o o mais externo para que seja
		 * percorrido os alunos e o mais intero para que seja percorrido
		 * o valor das notas do mesmo, logo a cada repeti��o do primeiro
		 * o mais interno ser� repetido x vezes.*/
		
		double total = 0;
		
		//Controla os alunos
		for(int i = 0; i < notasDaTurma.length; i++) {
			//Controla as notas
			//Necessita apontar a posi��o de i
			for(int j = 0; j < notasDaTurma[i].length; j++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", (j +1), (i + 1));
				notasDaTurma[i][j] = entrada.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("M�dia da turma � " + media);
		
		/*Neste caso quando estivermos percorrendo o la�o mais externos, no caso notasDaTurma, cada um dos elementos ser�, tamb�m, 
		 * um array de double, apontando para notasDoAluno*/ 
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		entrada.close();
	}
}

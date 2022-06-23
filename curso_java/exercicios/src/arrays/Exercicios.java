package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicios {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		//Antes de atribuir valor os valores adotar�o o padr�o de cada tipo, int e double sempre ser�o 0
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.2;
		notasAlunoA[1] = 6.5;
		notasAlunoA[2] = 8.9;
		notasAlunoA[3] = 6.2;
		
		
		//Para imprimir um array � necess�rio importar util.Arrays e utilizar a classe Arrays + to string
		System.out.println(Arrays.toString(notasAlunoA));
		
		/*Utiliza um la�o for para percorrer de 0 at� 2, chegando a 3 sai do la�o e enquanto percorre incrementa 1
		 a cada incremento o total � somado a vari�vel notasAluno no indice i, este que � a posi��o que est� a percorrer
		 o la�o for.
		 */
		double totalAlunoA = 0;
		//for(int i = 0; i < 3; i++) {
		//usa uma propriedade do objeto .length para delimitar o tamanho do array sem a necessidade de setar o valor
		//desta forma se for inserido um novo valor no array o la�o acompanhar� por tamanho total.
		for (int i = 0; i < notasAlunoA.length ; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		//Outra forma de atribuir os valores de um array
		
		//Atribui uma posi��o do array a uma vari�vel, esta que � uma constante.
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		//Utilizando notasAlunoB.length estamos realizando uma m�dia, pois ira dividir o total das notas pelo
		//tamanho do array, logo ser� dividido o total pela quantidade de notas
		System.out.println(totalAlunoB / notasAlunoB.length);
		
	}
}

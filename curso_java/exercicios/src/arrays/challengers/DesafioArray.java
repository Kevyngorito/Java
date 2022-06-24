package arrays.challengers;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		System.out.println("Informe quantas notas deverão ser computadas: ");
		Scanner entrada = new Scanner(System.in);
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double [qtdNotas];

		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota: " + (i + 1) + ": ");
			notas[i] = entrada.nextInt();
		}
		System.out.println(Arrays.toString(notas));
		
		
		entrada.close();
	}
}

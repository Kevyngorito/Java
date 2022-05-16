package desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
			
		double nota = 0;
		int    count = 0;
		double total = 0;	
		while(nota >= 0 && nota <= 10) {
			total += nota;
			System.out.println("Informe uma nota: ");
			nota = entrada.nextDouble();
			count ++;
				if (nota < 0 || nota > 10) {
					count --;
				}
		}
		
			double media = total / count;
			System.out.printf("Foram digitadas %d notas v�lidas, totalizando %.2f com uma m�dia de %.2f ", count, total, media);
					
		entrada.close();

	}
}

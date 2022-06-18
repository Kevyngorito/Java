package desafios.estruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	
		double nota = 0;
		int    count = 0;
		double total = 0;	
		while(nota != -1 ^ nota > 10) {
			
			total += nota;
			System.out.println("Informe uma nota: ");
			nota = entrada.nextDouble();
			count ++;
					if (nota > 10 || nota < 0) {
						count --;
				}
				
		}
			double media = total / count;
			System.out.printf("Foram digitadas %d notas válidas, totalizando %.2f com uma média de %.2f ", count, total, media);
					
		entrada.close();
	}
}

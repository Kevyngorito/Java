package codandoEAprendendo;

import java.util.Scanner;

public class DesafioPotencializacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
			
			System.out.println("Informe o n�mero: ");
			double num1 = entrada.nextDouble();
			double quadrado = Math.pow(num1, 2);
			double cubo = Math.pow(num1, 3);
			
			System.out.printf(" O n�mero %.2f elevado ao quadrado � %.2f e elevado ao cubo � %.2f", num1, quadrado, cubo);
			
		
		
		entrada.close();
	}
}

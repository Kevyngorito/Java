package personalChallengers;

import java.util.Scanner;

public class AreaDoTriangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a base do tri�ngulo: ");
		double base = entrada.nextDouble();
		System.out.print("Informe a altura do tri�ngulo: ");		
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("A �rea do tri�ngulo � %.2f", area);
		
		
		
		entrada.close();
	}
}

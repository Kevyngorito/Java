package personalChallengers;

import java.util.Scanner;

public class FormulaDeBhaskara {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Informe o valor de A: ");
		double valueA = input.nextDouble();
		System.out.print("Informe o valor de B: ");
		double valueB = input.nextDouble();
		System.out.print("Informe o valor de C: ");
		double valueC = input.nextDouble();
		
		double valueB2 = Math.pow(valueB, 2);
		double delta = valueB2 - (4 * valueA * valueC);
		
		double raiz = Math.sqrt(delta);
		
		double x = (-valueB2 +- raiz) / 2 * valueA; 
		
		System.out.printf("O valor de delta é %.2f e de  X é %.2f", delta, x);
		
		
		input.close();
	}
}

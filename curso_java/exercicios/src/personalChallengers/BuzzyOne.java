package personalChallengers;

import java.util.Scanner;

public class BuzzyOne {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número de entre 0 .. 30: ");
		Integer n = entrada.nextInt();

		for(int i = 1; i < n; i++) {
		
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0 && i % 5 != 0) {
				System.out.println("Fizz");				
			} else if(i % 5 == 0 && i % 3 != 0) {
				System.out.println("Buzz");					
			} else {
				System.out.println(i);						
			}
		
		}
	
		entrada.close();
	
	}
}

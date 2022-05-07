package personalChallengers;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		//entry mode
		Scanner entrada = new Scanner(System.in);
		
		//First task
		System.out.println("Say your name: ");
		String name = entrada.nextLine();
		
		//Second task
		System.out.println("Say your weigth: ");
		double weigth = entrada.nextFloat();
		
		//third task
		System.out.println("Say your height: ");
		double heigth = entrada.nextDouble();
		
		double imc = (weigth / (heigth * heigth));
		
		System.out.printf("Olá %s Seu IMC é %f", name, imc);
			
		entrada.close();
	}
}

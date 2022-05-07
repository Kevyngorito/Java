package personalChallengers;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// entry mode
		Scanner entry = new Scanner(System.in);

		// First task
		System.out.println("Say your name: ");
		String name = entry.nextLine();

		// Second task
		System.out.println("Say your weigth: ");
		double weigth = entry.nextDouble();

		// third task
		System.out.println("Say your height: ");
		double heigth = entry.nextDouble();

		double imc;
		imc = (weigth / (heigth * heigth));
		

		if (imc < 18.5) {
			System.out.printf("Olá %s Seu IMC é %f e está abaixo do peso normal", name, imc);
		} else if (imc > 18.4 && imc < 25) {
			System.out.printf("Olá %s Seu IMC é %f peso normal", name, imc);
		} else if (imc > 25 && imc < 30) {
			System.out.printf("Olá %s Seu IMC é %f excesso de peso", name, imc);
		} else if (imc > 30 && imc < 35) {
			System.out.printf("Olá %s Seu IMC é %f obesidade classe I", name, imc);
		} else if (imc > 35 && imc < 40) {
			System.out.printf("Olá %s Seu IMC é %f obesidade classe II", name, imc);
		} else if (imc >= 40) {
			System.out.printf("Olá %s Seu IMC é %f obesidade classe III", name, imc);
		}
		entry.close();
	}
}

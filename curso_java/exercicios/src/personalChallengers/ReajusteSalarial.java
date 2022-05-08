package personalChallengers;

import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		String nome = scan.nextLine();
		System.out.print("Informe o seu sobrenome: ");
		String sobrenome = scan.nextLine();
		System.out.print("Informe o seu salario: ");
		String salario = scan.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(salario);
		double salMedio;
		
		if (salario1 < 1500) {
			salMedio = salario1 * (10 / 100); 
			System.out.printf(" %s %s Seu sal�rio %f foi reajustado em 10%. Seu novo sal�rio � %f", nome, sobrenome ,salario1, salMedio);
		} else if (salario1 > 2000) {
			salMedio = salario1 * (5 / 100); 
			System.out.printf(" %s %s Seu sal�rio %f foi reajustado em 5%. Seu novo sal�rio � %f", nome, sobrenome ,salario1, salMedio);
		}
		
		
		scan.close();
	}
}

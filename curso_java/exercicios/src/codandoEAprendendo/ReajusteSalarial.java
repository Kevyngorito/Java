package codandoEAprendendo;

import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		String nome = scan.next();
		System.out.print("Informe o seu salario: ");
		Double salario = scan.nextDouble();
		
		double ajuste10 = 10/100;
		double ajuste5 = 5/100;
		
		if (salario < 1500) {
			double salMedio = ajuste10 + salario;
			System.out.printf(" %s %s Seu salário %f foi reajustado em 10%. Seu novo salário é %f", nome, salario, salMedio);
		} else if (salario > 2000) {
			double salMedio = ajuste5 + salario; 
			System.out.printf(" %s %s Seu salário %f foi reajustado em 5%. Seu novo salário é %f", nome, salario, salMedio);
		}
		
		
		scan.close();
	}
}

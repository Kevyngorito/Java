package codandoEAprendendo;

import java.util.Scanner;

public class DesafioMediaSalarial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salário: ");
		String salario1 = teclado.nextLine().replace(",", ".");
		System.out.println("Informe o segundo salário: ");
		String salario2 = teclado.nextLine().replace(",", ".");
		System.out.println("Informe o terceiro salário: ");
		String salario3 = teclado.nextLine().replace(",", ".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		double media = ((s1 + s2 + s3) / 3);
		
		System.out.println("A média salarial do último trimestre foi: " + media);
		
		teclado.close();
	}
}

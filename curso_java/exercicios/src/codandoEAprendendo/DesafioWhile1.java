package codandoEAprendendo;

import java.util.Scanner;

public class DesafioWhile1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String input = "";
		
		while (!input.contains("#")) {
			System.out.println("Bom dia, por favor informe seu ID para liberar a entrada: ");

			input =  entrada.next();
		}
		
		
		entrada.close();
	}	
}

package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe uma entrada: ");
		String input = entrada.next();
		
		String valor = "";
		
		//Enquanto não for digitado sair, continue executando o while indefinidamente.
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Sua entrada foi: ");
			//Altera o valor da variável valor para oq o usuário digitar
			valor = entrada.nextLine();
			
		}
		
		entrada.close();
	}
}

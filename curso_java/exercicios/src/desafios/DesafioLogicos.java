package desafios;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Conseguiu o trabalho 1? ");
			String trab1 = entrada.nextLine().replace("sim", "true").replace("nao", "false");
			boolean trabalho1 = Boolean.parseBoolean(trab1);
			
		
			System.out.print("Conseguiu o trabalho 2? ");
			String trab2 = entrada.nextLine().replace("sim", "true").replace("nao", "false");
			boolean trabalho2 = Boolean.parseBoolean(trab2);
			
			var tv50 = trabalho1 && trabalho2;
			var tv30 = trabalho1 ^ trabalho2;
			var tomouSorvete = trabalho1 || trabalho2;
			
			
			if (tv50 == true) {
				System.out.println("Consegui dois empregos, tv de 50\" = " + tv50);
				System.out.println("Vamos tomar sorvete = " + tomouSorvete);
			} else if (tv30 == true) {
				System.out.println("Consegui um emprego, tv de 30\" = " + tv30);
				System.out.println("Vamos tomar sorvete = " + tomouSorvete);
	
			} else if (tv30 == false) {
				System.out.println("Não iremos ao shopping, logo tomar sorvete = " + tomouSorvete);
			}
		
		
		entrada.close();
		
		

	}
}

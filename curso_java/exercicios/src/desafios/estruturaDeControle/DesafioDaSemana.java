package desafios.estruturaDeControle;

import java.util.Scanner;

public class DesafioDaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o dia da semana desejado: ");
		String semana = entrada.next();
		
		//Compara��o de String utilizar o equals
		if(semana.equalsIgnoreCase("domingo")){
			System.out.println(semana + " � o dia 1 da semana.");
		} else if (semana.equalsIgnoreCase("segunda")){
			System.out.printf(semana + " � o dia 2 da semana.");
		} else if (semana.equalsIgnoreCase("ter�a")){
			System.out.println(semana + " � o dia 3 da semana.");
		} else if (semana.equalsIgnoreCase("quarta")){
			System.out.println(semana + " � o dia 4 da semana.");
		} else if (semana.equalsIgnoreCase("quinta")){
			System.out.println(semana + " � o dia 5 da semana.");
		} else if (semana.equalsIgnoreCase("sexta")){
			System.out.println(semana + " � o dia 6 da semana.");
		} else if (semana.equalsIgnoreCase("s�bado")){
			System.out.println(semana + " � o dia 7 da semana.");
		}
		entrada.close();
	}
}

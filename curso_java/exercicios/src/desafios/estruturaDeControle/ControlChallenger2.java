package desafios.estruturaDeControle;

import java.util.Scanner;

public class ControlChallenger2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Por favor informe a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Por favor informe a primeira nota: ");
		double nota2 = entrada.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.printf("Parab�ns voc� tem uma m�dia %.2f e est� aprovado!", media);
		}else if (media < 7 && media > 4) {
			System.out.printf("Estude um pouco mais"
					+ " voc� tem uma m�dia %.2f e est� de recupera��o, boa sorte!", media);			
		} else {
			System.out.printf("Sinto muito, mas sua m�dia foi %.2f e por isso voc� foi reprovado.", media);
		}
		
		
		entrada.close();
		
	}
}

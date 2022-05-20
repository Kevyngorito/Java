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
			System.out.printf("Parabéns você tem uma média %.2f e está aprovado!", media);
		}else if (media < 7 && media > 4) {
			System.out.printf("Estude um pouco mais"
					+ " você tem uma média %.2f e está de recuperação, boa sorte!", media);			
		} else {
			System.out.printf("Sinto muito, mas sua média foi %.2f e por isso você foi reprovado.", media);
		}
		
		
		entrada.close();
		
	}
}

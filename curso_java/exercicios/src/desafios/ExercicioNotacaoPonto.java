package desafios;

public class ExercicioNotacaoPonto {

	public static void main(String[] args) {
		//Validando por atribuição um a um;
		String x = "Bem vindo X";
		x = x.replaceAll("X", "senhor");
		x = x.toUpperCase();
		System.out.println(x);
		
		//Validando direto na saída
		System.out.println("bom dia menino".replace("menino", "rapaz").toUpperCase());
		
		//Quebrando notação ponto
		System.out.println("Olá como vai você"
				.replace("você", "?")
				.concat("Você está bem?")
				.toUpperCase());
	}
}

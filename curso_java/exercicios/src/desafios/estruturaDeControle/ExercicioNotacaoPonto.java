package desafios.estruturaDeControle;

public class ExercicioNotacaoPonto {

	public static void main(String[] args) {
		//Validando por atribui��o um a um;
		String x = "Bem vindo X";
		x = x.replaceAll("X", "senhor");
		x = x.toUpperCase();
		System.out.println(x);
		
		//Validando direto na sa�da
		System.out.println("bom dia menino".replace("menino", "rapaz").toUpperCase());
		
		//Quebrando nota��o ponto
		System.out.println("Ol� como vai voc�"
				.replace("voc�", "?")
				.concat("Voc� est� bem?")
				.toUpperCase());
	}
}

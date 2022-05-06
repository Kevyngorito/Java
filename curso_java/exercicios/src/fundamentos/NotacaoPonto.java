package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		//String deve ser nomeado com S maiúsculo, String não é um tipo primitivo e não é uma palavra reservada
		String s = "Bom dia X";
		//Ao utilizar o (.) em uma palavra não reservada é possível acessar os métodos do mesmo, nesse caso toUpperCase
//		s.toUpperCase(); Nesse caso não armazena o método a variável, apenas altera para essa linha, a exibição continuará a mesma da nomeada.
		//Atribuindo o método a variável
		s = s.toUpperCase();
		System.out.println(s);
		
		// Para acessar os métodos de um determinado dado é utilizado a notação (.)
		//.replace seleciona um caracter ou palavra para ser substituída por outra.
		s = s.replace("X", "Senhora");
		s = s.concat("!!!!"); //método para concatenação
		System.out.println(s);
		
		String x = "teste de uper".toUpperCase();
		System.out.println(x);
		
		System.out.println("Exemplo valor literal".toUpperCase());
		
		
		//Atribuindo a y um frase e usando o método direto na atribuição
		
/* Deve-se observar que só é possível utilizar vários métodos pois o retorno de cada um
 * é uma String, porém se o retorno for diferente de uma String, não será possível utilizar
 * o método, segue exemplo abaixo do length.		
 */
		String y = "Bom dia X".replace("X", "Cara")
				.concat(" Bem vindo")
//				.length();
				.toUpperCase();
		System.out.println(y);
		
		// OBS: tipos primitivos não tem o operador (.)
		
	}
}

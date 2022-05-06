package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		//String deve ser nomeado com S mai�sculo, String n�o � um tipo primitivo e n�o � uma palavra reservada
		String s = "Bom dia X";
		//Ao utilizar o (.) em uma palavra n�o reservada � poss�vel acessar os m�todos do mesmo, nesse caso toUpperCase
//		s.toUpperCase(); Nesse caso n�o armazena o m�todo a vari�vel, apenas altera para essa linha, a exibi��o continuar� a mesma da nomeada.
		//Atribuindo o m�todo a vari�vel
		s = s.toUpperCase();
		System.out.println(s);
		
		// Para acessar os m�todos de um determinado dado � utilizado a nota��o (.)
		//.replace seleciona um caracter ou palavra para ser substitu�da por outra.
		s = s.replace("X", "Senhora");
		s = s.concat("!!!!"); //m�todo para concatena��o
		System.out.println(s);
		
		String x = "teste de uper".toUpperCase();
		System.out.println(x);
		
		System.out.println("Exemplo valor literal".toUpperCase());
		
		
		//Atribuindo a y um frase e usando o m�todo direto na atribui��o
		
/* Deve-se observar que s� � poss�vel utilizar v�rios m�todos pois o retorno de cada um
 * � uma String, por�m se o retorno for diferente de uma String, n�o ser� poss�vel utilizar
 * o m�todo, segue exemplo abaixo do length.		
 */
		String y = "Bom dia X".replace("X", "Cara")
				.concat(" Bem vindo")
//				.length();
				.toUpperCase();
		System.out.println(y);
		
		// OBS: tipos primitivos n�o tem o operador (.)
		
	}
}

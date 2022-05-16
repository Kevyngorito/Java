package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		/* O while determinado dá-se por estarmos usando uma variável de controle
		 * Logo sabemos a quantidade de repetição.*/
		
		int contador = 1; //variável de controle para o while
		
		/* No while a expressão retornará true ou false para controlar o loop */
		while(contador <= 10) {
			System.out.printf("i = %d\n", contador);	
			contador ++;//incremento para controle do loop
		}
	}
}

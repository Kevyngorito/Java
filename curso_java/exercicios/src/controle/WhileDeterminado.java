package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		/* O while determinado d�-se por estarmos usando uma vari�vel de controle
		 * Logo sabemos a quantidade de repeti��o.*/
		
		int contador = 1; //vari�vel de controle para o while
		
		/* No while a express�o retornar� true ou false para controlar o loop */
		while(contador <= 10) {
			System.out.printf("i = %d\n", contador);	
			contador ++;//incremento para controle do loop
		}
	}
}

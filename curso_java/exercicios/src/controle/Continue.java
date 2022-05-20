package controle;

public class Continue {

	public static void main(String[] args) {
		//break sai da estrutura FOR E O CONTINUE interrompe apenas aquela repetição e next
		
		for(int i = 0; i < 10; i++) {
			if( i % 2 == 1) {
				//imprimirá os valores ímpares dentro da repetição de 0 a 10
				System.out.println(i); continue;
				//Só entrará no continue se o if for = true, no caso a posição do FOR
				// for ímpar
			}
		}
	}
	
	
}

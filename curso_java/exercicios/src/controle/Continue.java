package controle;

public class Continue {

	public static void main(String[] args) {
		//break sai da estrutura FOR E O CONTINUE interrompe apenas aquela repeti��o e next
		
		for(int i = 0; i < 10; i++) {
			if( i % 2 == 1) {
				//imprimir� os valores �mpares dentro da repeti��o de 0 a 10
				System.out.println(i); continue;
				//S� entrar� no continue se o if for = true, no caso a posi��o do FOR
				// for �mpar
			}
		}
	}
	
	
}

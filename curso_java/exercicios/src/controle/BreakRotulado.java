package controle;

public class BreakRotulado {

	public static void main(String[] args) {
		//Utilizando um apelido para o la�o
		//externo � o r�tulo para o for
		//Desta forma, muda-se o fluxo da aplica��o [EVITAR USAR]
	externo:	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3 ; j++) {
				
				if(i == 1) {
					break externo;
				}
				
				System.out.printf("[%d %d] ", i, j);
			}
			
 			System.out.println();
		}
	
		System.out.println("Fim!");
	}
}

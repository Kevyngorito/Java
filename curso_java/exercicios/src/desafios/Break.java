package desafios;

public class Break {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break; // break ir� parar a repeti��o quando a condi��o if for atendida
						// e com isso sair� do la�o.
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}
}

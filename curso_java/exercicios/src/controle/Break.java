package controle;

public class Break {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break; // break irá parar a repetição quando a condição if for atendida
						// e com isso sairá do laço.
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}
}

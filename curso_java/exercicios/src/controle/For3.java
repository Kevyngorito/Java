package controle;

public class For3 {

	public static void main(String[] args) {
		
		//Desta forma o i � uma vari�vel de escopo pertencente ao for
		for (int i = 0; i < 10; i ++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		
		
	}
}

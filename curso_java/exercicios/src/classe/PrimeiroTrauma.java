package classe;

public class PrimeiroTrauma {

	int a = 3;
	static int b = 4;
	public static void main(String[] args) {
		/*Foi necess�rio criar uma inst�ncia com o nome da classe, para que fosse poss�vel
		  acessar a vari�vel a, atrav�s do (.)*/
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		//static acessa static
		System.out.println(b);
	}

}

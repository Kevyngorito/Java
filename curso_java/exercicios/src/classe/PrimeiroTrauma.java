package classe;

public class PrimeiroTrauma {

	int a = 3;
	static int b = 4;
	public static void main(String[] args) {
		/*Foi necessário criar uma instância com o nome da classe, para que fosse possível
		  acessar a variável a, através do (.)*/
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		//static acessa static
		System.out.println(b);
	}

}

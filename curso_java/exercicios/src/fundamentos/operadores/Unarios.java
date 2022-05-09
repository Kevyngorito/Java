package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// FORMA PÓS FIXADA
		//incremento
		a++; //a = a + 1;
		//decremento
		a--; //a = a - 1;
		
		
		// FORMA PRÉ FIXADA
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		/* Por precedência a forma pré fixada tem maior precedência do que comparação ou pós fixada
		 ou seja, no exemplo abaixo ele primeiro incrementa o a, depois compara a com b, retornando true
		 e depois decrementa o b.
		 */
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}

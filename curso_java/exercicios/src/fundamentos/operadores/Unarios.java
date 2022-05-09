package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// FORMA P�S FIXADA
		//incremento
		a++; //a = a + 1;
		//decremento
		a--; //a = a - 1;
		
		
		// FORMA PR� FIXADA
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		/* Por preced�ncia a forma pr� fixada tem maior preced�ncia do que compara��o ou p�s fixada
		 ou seja, no exemplo abaixo ele primeiro incrementa o a, depois compara a com b, retornando true
		 e depois decrementa o b
		 */
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}

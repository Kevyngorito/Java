package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		//Atribuição aditiva
		c += b;	//c = c + b;
		//Atribuição subtrativa
		c -= a; //c = c - a;
		//Atribuição multiplicativa
		c *= b; //c = c * b;
		//Atribuição divisiva
		c /= a; //c = c / a;
		//Atribuição de módulo
		c %= 2; //c = c % 2; 0 ou 1 (0 = par, 1 = ímpar)
	}
}

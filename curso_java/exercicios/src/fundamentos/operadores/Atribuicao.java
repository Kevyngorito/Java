package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		//Atribui��o aditiva
		c += b;	//c = c + b;
		//Atribui��o subtrativa
		c -= a; //c = c - a;
		//Atribui��o multiplicativa
		c *= b; //c = c * b;
		//Atribui��o divisiva
		c /= a; //c = c / a;
		//Atribui��o de m�dulo
		c %= 2; //c = c % 2; 0 ou 1 (0 = par, 1 = �mpar)
	}
}

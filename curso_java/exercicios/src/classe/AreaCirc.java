package classe;

public class AreaCirc {

	double raio;
	//final cria uma constante static atribui a vari�vel como sendo da classe e n�o do objeto
	final static double PI = 3.1415;
	
	//Construtor, n�o tem retorno esperado.
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	//M�todo com retorno de um double.
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}

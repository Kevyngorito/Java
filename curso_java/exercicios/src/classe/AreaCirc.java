package classe;

public class AreaCirc {

	double raio;
	//final cria uma constante static atribui a variável como sendo da classe e não do objeto
	final static double PI = 3.1415;
	
	//Construtor, não tem retorno esperado.
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	//Método com retorno de um double.
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}

package desafios;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		/*Utiliza-se o final para declarar que uma vez que o valor for setado, ele n�o poder� ser
		alterado no algoritmo */
		//Por conven��o utilizar nome de CONSTANTE com letra MAI�SCULA
		
		final double PI = 3.14159; //Final atribui a variavel double uma CONSTANTE
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		//Reatribuindo o valor da vari�vel raio
		raio = 10;
		area = PI * raio * raio;
		//Concatenando uma string com o resultado da vari�vel area
		System.out.println("�rea = " + area + "m�"); 
	}
}

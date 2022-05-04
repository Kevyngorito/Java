package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		/*Utiliza-se o final para declarar que uma vez que o valor for setado, ele não poderá ser
		alterado no algoritmo */
		//Por convenção utilizar nome de CONSTANTE com letra MAIÚSCULA
		
		final double PI = 3.14159; //Final atribui a variavel double uma CONSTANTE
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		//Reatribuindo o valor da variável raio
		raio = 10;
		area = PI * raio * raio;
		//Concatenando uma string com o resultado da variável area
		System.out.println("Área = " + area + "m²"); 
	}
}

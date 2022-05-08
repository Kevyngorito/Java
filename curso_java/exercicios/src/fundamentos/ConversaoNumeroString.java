package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		//variável com wrapper
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//variável com tipo primitivo
		int num2 = 100000;
		/*É possível utilizar o método toString se chamar o Integer
		mesmo tendo iniciado a variável com tipo primitivo */
		System.out.println(Integer.toString(num2).length());
		
		/*Concatenando uma string vazia com o valor de num2
		 torna o num2 uma string mesmo que de forma porca
		 */
		System.out.println(("" + num2).length());
	}
}

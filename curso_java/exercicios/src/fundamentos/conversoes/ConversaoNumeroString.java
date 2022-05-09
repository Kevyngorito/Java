package fundamentos.conversoes;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		//vari�vel com wrapper
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//vari�vel com tipo primitivo
		int num2 = 100000;
		/*� poss�vel utilizar o m�todo toString se chamar o Integer
		mesmo tendo iniciado a vari�vel com tipo primitivo */
		System.out.println(Integer.toString(num2).length());
		
		/*Concatenando uma string vazia com o valor de num2
		 torna o num2 uma string mesmo que de forma porca
		 */
		System.out.println(("" + num2).length());
	}
}

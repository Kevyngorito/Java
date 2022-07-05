package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		/*Caso uma fila tenha tamanho pr� definido e ao tentar
		  adicionar mais elementos a fila com tamanho limitado
		  o .add retornara um erro exception j� o offer FALSE*/
		
		//Offer e Add -> adicionam elemtnso na fila
		// A diferen�a � o comportamento quando a lista est� cheia
		fila.add("Ana");//Se a fila estiver cheia .add retornar� NULL
		fila.offer("Bia");//Se a fila estiver cheia .offer lan�ar� um erro de exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		//Pegar elemento da Fila
		//peek e element -> obter o pr�ximo elemento da fila sem remover
		// A diferen�a � o comportamento quando a lista est� vazia

		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//fila.size(); tamanho da fila
		//fila.clear(); limpa a fila
		//fila.isEmpty(); a fila est� ou n�o vazia?
		//fila.contains("maria"); verifica se o objeto est� contido
		
		
		//poll e remove -> obter o pr�ximo elemento da fila e remove
		//Chama o primeiro elemento e o remove da lista
		// A diferen�a � o comportamento quando a lista est� vazia
		
		System.out.println(fila.poll());//retorna NULL
		System.out.println(fila.remove());//lan�a um erro de exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}

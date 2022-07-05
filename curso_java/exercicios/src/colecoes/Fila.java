package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		/*Caso uma fila tenha tamanho pré definido e ao tentar
		  adicionar mais elementos a fila com tamanho limitado
		  o .add retornara um erro exception já o offer FALSE*/
		
		//Offer e Add -> adicionam elemtnso na fila
		// A diferença é o comportamento quando a lista está cheia
		fila.add("Ana");//Se a fila estiver cheia .add retornará NULL
		fila.offer("Bia");//Se a fila estiver cheia .offer lançará um erro de exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		//Pegar elemento da Fila
		//peek e element -> obter o próximo elemento da fila sem remover
		// A diferença é o comportamento quando a lista está vazia

		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//fila.size(); tamanho da fila
		//fila.clear(); limpa a fila
		//fila.isEmpty(); a fila está ou não vazia?
		//fila.contains("maria"); verifica se o objeto está contido
		
		
		//poll e remove -> obter o próximo elemento da fila e remove
		//Chama o primeiro elemento e o remove da lista
		// A diferença é o comportamento quando a lista está vazia
		
		System.out.println(fila.poll());//retorna NULL
		System.out.println(fila.remove());//lança um erro de exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}

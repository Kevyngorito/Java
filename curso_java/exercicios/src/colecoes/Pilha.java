package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		//PILHA -> FIRST IN LEFT OUT (FILO)
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Pr�ncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		//Caso a pilha esteja cheia
		System.out.println(livros.peek());//retorna null
		System.out.println(livros.element());//retorna NoSuchElementException
		
		//O foreach ir� respeitar a ordem de preced�ncia da collection
		//Se for fila iniciar� o la�o do primeiro elemento adicionado
		//Se for pilha iniciar� o la�o do �ltimo elemento adicionado
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		//Caso a pilha esteja vazia
		System.out.println(livros.poll());//retorna null
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove());//retorna NoSuchElementException
		//System.out.println(livros.pop());//retorna NoSuchElementException
		System.out.println(livros.size());
	}

}

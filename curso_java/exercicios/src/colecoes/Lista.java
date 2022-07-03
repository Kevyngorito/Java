package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<>();
		//Cria��o de uma vari�vel u1 para depois inser��o na lista
		Usuario u1 = new Usuario("Maria");
		//Inser��o da vari�vel u1
		lista.add(u1);
		//Cria��o do objeto direto na lista
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Karen"));
		lista.add(new Usuario("Bia"));
		
		System.out.println("Itens da lista: " + lista.size());

		//Obtendo determinado elemento a partir do ID (USANDO O GET)
		//System.out.println(lista.get(3));
		
		//Removendo item a partir do �ndice
		System.out.println("Removendo por objeto: " + lista.remove(1));
		//Removendo item a partir de um objeto
		//Retorna um valor booleano
		System.out.println("Removendo por �ndice: Karen? " + lista.remove(new Usuario("Karen")));
		
		System.out.println("Itens da lista: " + lista.size());
		
		System.out.println("Cont�m o usu�rio Lucas: " + lista.contains(new Usuario("Lucas")));
		
		for(Usuario showUser: lista) {
			System.out.println(showUser.nome);
			//System.out.println(showUser);
		}
	}

}

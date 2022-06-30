package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();
		/*Conversão implícita abaixo de tipo primitivo para Wrapper*/
		conjunto.add(1.2); //double -> Double
		conjunto.add(true); //boolean -> Boolean
		conjunto.add("Teste"); //String (já é objeto)
		conjunto.add(1); //int -> Integer
		conjunto.add('x'); //char -> Character
		System.out.println(conjunto);
		System.out.println("A quantidade de elementos no conjunto é: " + conjunto.size());
		conjunto.add("Teste");//Não será adicionado ao conjunto, pois é um elemtno repetido.
		System.out.println("A quantidade de elementos no conjunto é: " + conjunto.size());
		//remove um elemento do conjunto, retorna true se a remoção for bem sucedida e false se não.
		System.out.println(conjunto.remove(1.2));
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("A quantidade de elementos no conjunto é: " + conjunto.size());
		//Retornará falso, pois a letra x foi removida do conjunto.
		//Serve para verificar se um elemento está ou não contido no conjunto.
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains("Teste"));
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		//União de 2 conjuntos
		conjunto.addAll(nums);
		System.out.println("União de 2 conjuntos: \n" + conjunto + "\n");
		//Interseção 
		conjunto.retainAll(nums);
		System.out.println("Intersecção de 2 conjuntos: \n" + conjunto + "\n");
		//Limpa todo o conjunto
		conjunto.clear();
		System.out.println(conjunto);
	}

}

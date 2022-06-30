package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();
		/*Convers�o impl�cita abaixo de tipo primitivo para Wrapper*/
		conjunto.add(1.2); //double -> Double
		conjunto.add(true); //boolean -> Boolean
		conjunto.add("Teste"); //String (j� � objeto)
		conjunto.add(1); //int -> Integer
		conjunto.add('x'); //char -> Character
		System.out.println(conjunto);
		System.out.println("A quantidade de elementos no conjunto �: " + conjunto.size());
		conjunto.add("Teste");//N�o ser� adicionado ao conjunto, pois � um elemtno repetido.
		System.out.println("A quantidade de elementos no conjunto �: " + conjunto.size());
		//remove um elemento do conjunto, retorna true se a remo��o for bem sucedida e false se n�o.
		System.out.println(conjunto.remove(1.2));
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("A quantidade de elementos no conjunto �: " + conjunto.size());
		//Retornar� falso, pois a letra x foi removida do conjunto.
		//Serve para verificar se um elemento est� ou n�o contido no conjunto.
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains("Teste"));
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		//Uni�o de 2 conjuntos
		conjunto.addAll(nums);
		System.out.println("Uni�o de 2 conjuntos: \n" + conjunto + "\n");
		//Interse��o 
		conjunto.retainAll(nums);
		System.out.println("Intersec��o de 2 conjuntos: \n" + conjunto + "\n");
		//Limpa todo o conjunto
		conjunto.clear();
		System.out.println(conjunto);
	}

}

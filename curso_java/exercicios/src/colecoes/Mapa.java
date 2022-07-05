package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		//Não utiliza a notação .add mas sim a .put
		/*O put adiciona caso não exista e substitui caso já exista*/
		usuarios.put(1, "Roberto");
		System.out.println(usuarios);
		usuarios.put(1, "Ricardo");//Substitui o valor String
		System.out.println(usuarios);
		usuarios.put(20, "Lucas");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		System.out.println(usuarios);
		
		//Não pode haver duplicação da chave, size é para quantidade de chaves
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		//Retorna as chaves sem manter ordem 
		System.out.println(usuarios.keySet());
		//Retorna os valores relacionados as chaves
		System.out.println(usuarios.values());
		//Retorna chave e valor ao mesmo tempo
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rafaela"));
		
		//Obtendo valor a partir da chave, diferente da lista que
		//O valor era obtido através do índice, no Map não há ordenação
		//Logo o valor não tem índice, mas sim chave
		System.out.println(usuarios.get(20));
		System.out.println(usuarios.remove(4));//Retorna a String removida
		System.out.println(usuarios.remove(3, "Kevyn"));//Não remove pois o value está errado
		//Percorrendo os elementos do map
		//Percorrendo apenas a chave
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		//Percorrendo apenas o valor
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		//Percorrendo chave e valor
		//Necessário importar java.util.Map
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " -->");
			System.out.println(registro.getValue());
		}
		
	}

}

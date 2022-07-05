package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		//N�o utiliza a nota��o .add mas sim a .put
		/*O put adiciona caso n�o exista e substitui caso j� exista*/
		usuarios.put(1, "Roberto");
		System.out.println(usuarios);
		usuarios.put(1, "Ricardo");//Substitui o valor String
		System.out.println(usuarios);
		usuarios.put(20, "Lucas");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		System.out.println(usuarios);
		
		//N�o pode haver duplica��o da chave, size � para quantidade de chaves
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
		//O valor era obtido atrav�s do �ndice, no Map n�o h� ordena��o
		//Logo o valor n�o tem �ndice, mas sim chave
		System.out.println(usuarios.get(20));
		System.out.println(usuarios.remove(4));//Retorna a String removida
		System.out.println(usuarios.remove(3, "Kevyn"));//N�o remove pois o value est� errado
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
		//Necess�rio importar java.util.Map
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " -->");
			System.out.println(registro.getValue());
		}
		
	}

}

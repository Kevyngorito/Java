package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrganizado {

	public static void main(String[] args) {
		Set <String> users = new HashSet<>();
			users.add("João");
			users.add("Alice");
			users.add("Pedro");
			users.add("Maria");
			users.add("João");
		System.out.println("Primeiro estado do conjunto: ");
		System.out.println(users);
		System.out.println("Alice encontra-se no conjunto?");	
		System.out.println(users.contains("Alice"));
		System.out.println("Pedro foi desligado, favor remover acessos: ");
		users.remove("Pedro");
		System.out.println("Segundo estado do conjunto: " + users);
		Set<String> admins = new TreeSet<>();
		admins.add("Gestor");
		admins.add("Supervisor");
		admins.add("Coordenador");
		admins.add("Analista1");
		admins.add("Analista2");
		admins.add("Analista3");
		System.out.println(admins);
		admins.addAll(users);
		System.out.println("Unindo os conjuntos: ");
		System.out.println(admins);
	}

}

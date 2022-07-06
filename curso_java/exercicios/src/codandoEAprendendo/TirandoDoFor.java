package codandoEAprendendo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TirandoDoFor {

	public static void main(String[] args) {

		Set <String> names = new TreeSet<>();
		
		names.add("Lucas");
		names.add("Pedro");
		names.add("João");
		names.add("Paulo");
		names.add("Ana");
		
		System.out.println(names);
		
		names.remove("Ana");
		System.out.println(names);
		
		Set <String> lastnames = new HashSet<>();
		
		lastnames.add("Silva");
		lastnames.add("Oliveira");
		lastnames.add("Costa");
		lastnames.add("Melo");
		
		System.out.println(lastnames);
		
		names.addAll(lastnames);
		
		System.out.println(names);
		
		names.removeAll(lastnames);
		System.out.println(names);
	}

}

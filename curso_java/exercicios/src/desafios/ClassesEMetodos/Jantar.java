package desafios.ClassesEMetodos;

public class Jantar {

	public static void main(String[] args) {

		
		Comida c1 = new Comida("Arroz", 0.225);
		Comida c2 = new Comida("Feij�o", 0.345);
		Comida c3 = new Comida("Frango", 1.25);
		
		Pessoa p1 = new Pessoa("Julio", 85.0); 
		Pessoa p2 = new Pessoa("Amanda", 76.0);
		
		System.out.println("Peso antes da refei��o: " + p1.showResults());
		p1.eating(c3);
		p1.eating(c2);
		p1.eating(c1);
		System.out.println("Fiz a refei��o completa (arroz, feij�o e frango), ap�s o jantar o meu peso � " + p1.weight);
		
		System.out.println("Peso antes da refei��o: " + p2.showResults());
		p2.eating(c3);
		p2.eating(c1);
		System.out.println("N�o fiz a refei��o completa comi apenas (arroz e frango). Ap�s a refei��o o meu peso � " + p2.weight);

	}

}

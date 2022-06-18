package desafios.ClassesEMetodos;

public class Jantar {

	public static void main(String[] args) {

		
		Comida c1 = new Comida("Arroz", 0.225);
		Comida c2 = new Comida("Feijão", 0.345);
		Comida c3 = new Comida("Frango", 1.25);
		
		Pessoa p1 = new Pessoa("Julio", 85.0); 
		Pessoa p2 = new Pessoa("Amanda", 76.0);
		
		System.out.println("Peso antes da refeição: " + p1.showResults());
		p1.eating(c3);
		p1.eating(c2);
		p1.eating(c1);
		System.out.println("Fiz a refeição completa (arroz, feijão e frango), após o jantar o meu peso é " + p1.weight);
		
		System.out.println("Peso antes da refeição: " + p2.showResults());
		p2.eating(c3);
		p2.eating(c1);
		System.out.println("Não fiz a refeição completa comi apenas (arroz e frango). Após a refeição o meu peso é " + p2.weight);

	}

}

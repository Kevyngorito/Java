package desafios.ClassesEMetodos;
public class Pessoa {

	String name;
	double weight;
	
	Pessoa(String name, double weight){
		this.name = name;
		this.weight = weight;
	}
	
	void eating (Comida comida) {
		if(comida != null) {
			this.weight += comida.weightFood;
		}
	}
	
	String showResults(){
		return "Olá eu sou " + name + " e meu peso é " + weight + "Kgs.";
	}
	
}

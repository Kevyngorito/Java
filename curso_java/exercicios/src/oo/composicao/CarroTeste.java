package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		System.out.println("O carro está ligado? " + c1.estaLigado());
		if(c1.estaLigado() == false) {
			System.out.println("Ligando o carro...");
			c1.ligar();
		}
		System.out.println("O carro está ligado? " + c1.estaLigado());
		
		System.out.println("Quantos giros o motor deu? " + c1.motor.giros() + "RPM");
		System.out.println("Acelerando...");
			c1.acelerar();
			c1.acelerar();
			c1.acelerar();
			c1.acelerar();
		System.out.println("Quantos giros o motor deu? " + c1.motor.giros() + "RPM");
		System.out.println("Freando ...");
			c1.frear();
			c1.frear();
			c1.frear();
			c1.frear();
			System.out.println("Quantos giros o motor deu? " + c1.motor.giros() + "RPM");
			c1.desligar();
		System.out.println("O carro está ligado?  ");
		System.out.println(c1.estaLigado());
	}

}

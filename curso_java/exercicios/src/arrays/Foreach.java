package arrays;

public class Foreach {
public static void main(String[] args) {
	//Foreach que significa para cada elemento, ou seja, para cada um faz uma repetição.
	
	double[] notas = { 9.5, 8.2, 7.4, 6.4 };
	
	//For tradicional que percorrerá todo o laço incrementando o contador para que seja printado a posição atual de acordo com o contador.
	for(int i = 0; i < notas.length; i++) {
		System.out.print("[" + notas[i] + "]");
	}
	System.out.println();
	/*Foreach em java é apenas um for com uma variação na implementação
	  Cria-se uma varivável nota do tipo double, para receber a repetição de cada elemento de notas*/
	for(double nota:notas) {
		System.out.print("[" + nota + "]");
	}
	}
}

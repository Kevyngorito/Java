package arrays;

public class Foreach {
public static void main(String[] args) {
	//Foreach que significa para cada elemento, ou seja, para cada um faz uma repeti��o.
	
	double[] notas = { 9.5, 8.2, 7.4, 6.4 };
	
	//For tradicional que percorrer� todo o la�o incrementando o contador para que seja printado a posi��o atual de acordo com o contador.
	for(int i = 0; i < notas.length; i++) {
		System.out.print("[" + notas[i] + "]");
	}
	System.out.println();
	/*Foreach em java � apenas um for com uma varia��o na implementa��o
	  Cria-se uma variv�vel nota do tipo double, para receber a repeti��o de cada elemento de notas*/
	for(double nota:notas) {
		System.out.print("[" + nota + "]");
	}
	}
}

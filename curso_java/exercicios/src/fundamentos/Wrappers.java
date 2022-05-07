package fundamentos;

import java.util.Scanner;

/* 
 Os tipos primitivos INICIAM com letra min�scula
 Ex: int, double, boolean, char, byte, long e etc...
 J� os Wrappers/classes iniciam com a Letra mai�scula, s�o eles
 
					 Byte = byte
					 Integer = int
					 Long = long
					 Short = short
					 Boolean = boolean
					 Character = char
					 Float (precisa especificar com um F ap�s
					 o valor literal) = float;
					 Double = double
 */
public class Wrappers {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Byte
		Byte b = 100;// literal 100 convertido para Byte
		Short s = 1000;
		// Utilizando o parseInt converte uma String para um valor inteiro
		// Integer i = Integer.parseInt("10000"); //Int

		// Pega a entrada do usu�rio do tipo string e converte para um integer na
		// vari�vel i
		Integer i = Integer.parseInt(entrada.next());
		Long l = 1000000L;// Long s� converte de long para long
		System.out.println(l / 3);
		
		
		Float f = 123.15F;
		System.out.println(f);
		
		Double d = 123.456;
		System.out.println(d);
		

		System.out.println(b.byteValue());
		// Imprime o S e converte o valor literal para uma String
		System.out.println(s.toString());
		System.out.println(i);
		
		Boolean bo = Boolean.parseBoolean("false");
		System.out.println(bo);
		/*Converte o resultado da vari�vel bo que � um booleano
		em string para aplicar o uppercase (aplic�vel apenas em string) */
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //apenas um caracter CHAR
		System.out.println(c + " ... ");
		

		entrada.close();
	}
}

package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		// Sempre que for comparar strings, utilizar o equals
		
		System.out.println("2" == "2"); //True
		
		String s = new String ("2");
		System.out.println("2" == s); //false
		System.out.println("2".equals(s)); //true .equals compara o valor interno
		
		Scanner entrada = new Scanner (System.in);
		
		String s2 = entrada.next();//next tira os espa�os em branco tbm, j� o nextLine n�o tira
		
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}

package fundamentos;

import java.util.Date; //importa o date da biblioteca java util

//import javax.swing.JButton; importa um bot�o 

//O c�digo estar� sempre dentro da classe, com exce��o do pacote e import ^
public class Import {

	public static void main(String[] args) {
		//java.lang � o pacote + b�sico do java e est� dispon�vel em todas as suas classes.
		java.lang.String b = "Boa tarde!";
			System.out.println(b);
		
		
		String s = "Bom dia!";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		
//		JButton botao = new JButton();

	}
}

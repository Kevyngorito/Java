package desafios;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		String n1 = JOptionPane.showInputDialog("Informe o primeiro número: ");
		double num1 = Double.parseDouble(n1);
		
		String n2 = JOptionPane.showInputDialog("Informe o segundo número: ");
		double num2 = Double.parseDouble(n2);
		
		String op = JOptionPane.showInputDialog("Informe a operação desejada [+] [-] [*] [/] ou [%]");
	}
}

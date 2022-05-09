package fundamentos.conversoes;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		//Utiliza o JOptionPane que é uma caixa de texto visual com o método showinputdialog para colher dado do usuário
		String valor1 = JOptionPane
				.showInputDialog("Digite o primeiro número");
		String valor2 = JOptionPane
				.showInputDialog("Digite o segundo número");
		
		System.out.println(valor1 + valor2);
		// cria duas varivéis do tipo primitivo double e atribui ao wrapper Double e usa o parseDouble para converter em double
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + soma / 2);
	}
}

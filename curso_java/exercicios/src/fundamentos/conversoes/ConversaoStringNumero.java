package fundamentos.conversoes;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		//Utiliza o JOptionPane que � uma caixa de texto visual com o m�todo showinputdialog para colher dado do usu�rio
		String valor1 = JOptionPane
				.showInputDialog("Digite o primeiro n�mero");
		String valor2 = JOptionPane
				.showInputDialog("Digite o segundo n�mero");
		
		System.out.println(valor1 + valor2);
		// cria duas variv�is do tipo primitivo double e atribui ao wrapper Double e usa o parseDouble para converter em double
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma �: " + soma);
		System.out.println("A m�dia �: " + soma / 2);
	}
}

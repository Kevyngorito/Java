package personalChallengers;

import java.util.Scanner;

public class ContaBancariaComSwitch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe seu nome: ");
		String name = input.nextLine();
		System.out.println("         Informe a conta desejada\n"
				+ "[1] Corrente [2] Poupan�a [3] Sal�rio [4] Universit�ria\n ");
		
		
		int account = input.nextInt();
		int outAccount = 0;
		int transferAccount = 0;
		int extractAccount = 0;
		
	
		
		switch(account) {
		case 1: 
			System.out.printf("\nOl� %S voc� escolheu a op��o %d conta corrente\n", name, account);
			outAccount = 4;
			transferAccount = 4;
			extractAccount = 4;
			System.out.printf("Voc� ter� acesso a %d  saques, %d transfer�ncias e %d extratos por m�s.\n", outAccount,  transferAccount, extractAccount);
			System.out.println("Bem vindo ao nosso banco, � muito por ter voc� conosco!");

			break;
		case 2:
			System.out.printf("\nOl� %s voc� escolheu a op��o %d conta corrente\n", name, account);
			outAccount = 2;
			transferAccount = 2;
			extractAccount = 3;
			System.out.printf("Voc� ter� acesso a %d saques, %d transfer�ncias e %d extratos por m�s.\n", outAccount,  transferAccount, extractAccount);
			System.out.println("Bem vindo ao nosso banco, � muito por ter voc� conosco!");

			break;
		case 3:
			System.out.printf("\nOl� %s voc� escolheu a op��o %d conta corrente\n", name, account);
			outAccount = 2;
			transferAccount = 0;
			extractAccount = 1;
			System.out.printf("Voc� ter� acesso a %d saques, %d transfer�ncias e %d extratos por m�s.\n", outAccount,  transferAccount, extractAccount);
			System.out.println("Bem vindo ao nosso banco, � muito por ter voc� conosco!");

			break;
		case 4:
			System.out.printf("\nOl� %s voc� escolheu a op��o %d conta corrente\n", name, account);
			outAccount = 2;
			transferAccount = 1;
			extractAccount = 1;
			System.out.printf("Voc� ter� acesso a %d saques, %d transfer�ncias e %d extratos por m�s.\n",  outAccount,  transferAccount, extractAccount);
			System.out.println("Bem vindo ao nosso banco, � muito por ter voc� conosco!");

			break;	
		default:
			System.out.println("Op��o inv�lida, fim da aplica��o!");
		}
		
	
		
		
		input.close();
	}
}

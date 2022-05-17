package personalChallengers;

import java.util.Scanner;

public class ContaBancariaComSwitch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe seu nome: ");
		String name = input.nextLine();
		System.out.println("         Informe a conta desejada\n"
				+ "[1] Corrente [2] Poupança [3] Salário [4] Universitária\n ");
		
		
		int account = input.nextInt();
		int outAccount = 0;
		int transferAccount = 0;
		int extractAccount = 0;
		
	
		
		switch(account) {
		case 1: 
			System.out.printf("\nOlá %S você escolheu a opção %d conta corrente\n", name, account);
			outAccount = 4;
			transferAccount = 4;
			extractAccount = 4;
			System.out.printf("Você terá acesso a %d  saques, %d transferências e %d extratos por mês.\n", outAccount,  transferAccount, extractAccount);
			System.out.println("Bem vindo ao nosso banco, é muito por ter você conosco!");

			break;
		case 2:
			System.out.printf("\nOlá %s você escolheu a opção %d conta corrente\n", name, account);
			outAccount = 2;
			transferAccount = 2;
			extractAccount = 3;
			System.out.printf("Você terá acesso a %d saques, %d transferências e %d extratos por mês.\n", outAccount,  transferAccount, extractAccount);
			System.out.println("Bem vindo ao nosso banco, é muito por ter você conosco!");

			break;
		case 3:
			System.out.printf("\nOlá %s você escolheu a opção %d conta corrente\n", name, account);
			outAccount = 2;
			transferAccount = 0;
			extractAccount = 1;
			System.out.printf("Você terá acesso a %d saques, %d transferências e %d extratos por mês.\n", outAccount,  transferAccount, extractAccount);
			System.out.println("Bem vindo ao nosso banco, é muito por ter você conosco!");

			break;
		case 4:
			System.out.printf("\nOlá %s você escolheu a opção %d conta corrente\n", name, account);
			outAccount = 2;
			transferAccount = 1;
			extractAccount = 1;
			System.out.printf("Você terá acesso a %d saques, %d transferências e %d extratos por mês.\n",  outAccount,  transferAccount, extractAccount);
			System.out.println("Bem vindo ao nosso banco, é muito por ter você conosco!");

			break;	
		default:
			System.out.println("Opção inválida, fim da aplicação!");
		}
		
	
		
		
		input.close();
	}
}

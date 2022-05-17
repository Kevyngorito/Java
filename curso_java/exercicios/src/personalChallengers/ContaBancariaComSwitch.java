package personalChallengers;

import java.util.Scanner;

public class ContaBancariaComSwitch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe seu nome: ");
		String name = input.next();
		System.out.println("         Informe a conta desejada\n"
				+ "[1] Corrente [2] Poupança [3] Salário [4] Universitária\n ");
		
		
		int account = input.nextInt();
		int outAccount = 0;
		int transferAccount = 0;
		int extractAccount = 0;
		int acceptTerms = 0;
		
		
		switch(account) {
		case 1: 
			System.out.printf("\nOlá %S você escolheu a opção %d conta corrente\n", name, account);
			outAccount = 4;
			transferAccount = 4;
			extractAccount = 4;
			System.out.println("Você terá acesso a 4 saques, 4 transferências e 4 extratos por mês.\n");
			break;
		case 2:
			System.out.printf("\nOlá %s você escolheu a opção %d conta corrente\n", name, account);
			outAccount = 2;
			transferAccount = 2;
			extractAccount = 3;
			System.out.println("Você terá acesso a 2 saques, 2 transferências e 3 extratos por mês.\n");

			break;
		case 3:
			System.out.printf("\nOlá %s você escolheu a opção %d conta corrente\n", name, account);
			outAccount = 2;
			transferAccount = 0;
			extractAccount = 1;
			System.out.println("Você terá acesso a 2 saques, 0 transferências e 1 extratos por mês.\n");
			break;
		case 4:
			System.out.printf("\nOlá %s você escolheu a opção %d conta corrente\n", name, account);
			outAccount = 2;
			transferAccount = 1;
			extractAccount = 1;
			System.out.println("Você terá acesso a 2 saques, 1 transferências e 1 extratos por mês.\n");
			break;		
		}
		
		System.out.println("Você aceita as condições informadas? [1]SIM [2]NÃO");
		acceptTerms = input.nextInt();
		
		if(acceptTerms == 1) {
			System.out.println("Parabéns, você abriu uma conta em nosso banco. Seja bem vindo!");
		} else if(acceptTerms == 2) {
			System.out.println("Deseja rever as opções de contas?");
			String review = input.next();
		}
	
		
		
		input.close();
	}
}

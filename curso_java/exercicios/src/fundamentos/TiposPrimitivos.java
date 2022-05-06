package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Dados do funcionário
		
		// Tipos numéricos inteiros
		
		byte anosDeEmpresa = 23; //range do byte até 127
		short numeroDeVoos = 542; //range do short até 32767
		int id = 56789; //range +2bilhões 
		 //ao utilizar o L converte o literal abaixo em um valor de INT para LONG.Os _ são utilizados para separar as casas decimais.
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos numéricos reais
		//float salario = 11_445.44; Desta forma retorna erro pois o valor informado é um double, que é maior do que a capacidade do float
		//Fazendo de forma correta, devemos converter o valor informado que é um DOUBLE em um FLOAT.
		float salario = 11_455.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo Booleano
		boolean estaDeFerias = false; //true or false
		char status = 'A'; // ativo (ACEITA APENAS UM CARACTER)
		
		// Dias de empresa
		System.out.println("O funcionário tem " + anosDeEmpresa * 365 + " dias de empresa.");
		
		// Número de viagens
		System.out.println("O funcionário tem " + numeroDeVoos / 2 + " número de voos.");
		
		// Pontos acumulados
		System.out.println("Para cada real vendido ele ganhou " + pontosAcumulados / vendasAcumuladas + " reais.");
		
		System.out.println("O funcionário " + id + ": ganha -> " + salario);
		
		// Férias?
		System.out.println("Férias? " + estaDeFerias);
		
		// Ativo?
		System.out.println("O colaborador está: " + status);
		
	}
}

package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Dados do funcion�rio
		
		// Tipos num�ricos inteiros
		
		byte anosDeEmpresa = 23; //range do byte at� 127
		short numeroDeVoos = 542; //range do short at� 32767
		int id = 56789; //range +2bilh�es 
		 //ao utilizar o L converte o literal abaixo em um valor de INT para LONG.Os _ s�o utilizados para separar as casas decimais.
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos num�ricos reais
		//float salario = 11_445.44; Desta forma retorna erro pois o valor informado � um double, que � maior do que a capacidade do float
		//Fazendo de forma correta, devemos converter o valor informado que � um DOUBLE em um FLOAT.
		float salario = 11_455.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo Booleano
		boolean estaDeFerias = false; //true or false
		char status = 'A'; // ativo (ACEITA APENAS UM CARACTER)
		
		// Dias de empresa
		System.out.println("O funcion�rio tem " + anosDeEmpresa * 365 + " dias de empresa.");
		
		// N�mero de viagens
		System.out.println("O funcion�rio tem " + numeroDeVoos / 2 + " n�mero de voos.");
		
		// Pontos acumulados
		System.out.println("Para cada real vendido ele ganhou " + pontosAcumulados / vendasAcumuladas + " reais.");
		
		System.out.println("O funcion�rio " + id + ": ganha -> " + salario);
		
		// F�rias?
		System.out.println("F�rias? " + estaDeFerias);
		
		// Ativo?
		System.out.println("O colaborador est�: " + status);
		
	}
}

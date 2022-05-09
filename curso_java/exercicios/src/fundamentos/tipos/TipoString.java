package fundamentos.tipos;

public class TipoString {

	public static void main(String[] args) {
		//charAt define filtra a posi��o desejada dentro da string
		System.out.println("Ol� pessoal".charAt(4)); 
		
		//String � um OBJETO IMUT�VEL
		String s = "Boa tarde";
		System.out.println(s.concat("!!"));
		System.out.println(s + "!!");
		//stratsWith verifica se a string inicia com a palavra filtrada (CASE SENSITIVE)
		System.out.println(s.startsWith("boa"));
		//stratsWith verifica se a string termina com a palavra filtrada (CASE SENSITIVE)
		System.out.println(s.endsWith("tarde"));
		//.length retorna o tamanho da String
		System.out.println(s.length());
		//equals faz a compara��o de igualdade com CASE SENSITIVE
		System.out.println(s.equals("boa tarde"));
		//equalsIgnoreCase faz a compara��o de igualdade sem  CASE SENSITIVE
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		//Atribui o tipo da vari�vel por infer�ncia
		var nome = "Pedro";
//		Neste exemplo � poss�vel usar os m�todos da string na vari�vel do tipo String ex .nome ou .sobrenome
		var sobrenome = "Santos";
		var idade = 33; //infer�ncia tipo inteiro
		var salario = 12345.987; //infer�ncia tipo double
		
		String maisUmaFrase = "Nome: " + nome + " \nSobrenome: " + sobrenome + 
				" \nIdade: " + idade + " \nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
//		System.out.println("Nome: " + nome + " \nSobrenome: " + sobrenome + " \nIdade: " + idade + " \nSalario: " + salario + "\n\n");
		
		//Utilizando o m�todo de interpola��o String (%s), Inteiro (%d), Double (%f)
		//No exemplo abaixo substitui o valor da vari�vel pela interpola��o setada
		//%.2f define quantas casas decimais ir� querer ter na string gerada
		System.out.printf("O senhor Nome: %s %s tem %d de idade e ganha R$ %.2f reais", nome, sobrenome, idade, salario);
		
		
		String frase = String.format("\nO senhor Nome: %s %s tem %d de idade e ganha R$ %.2f reais", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}
}

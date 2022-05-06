package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		//charAt define filtra a posição desejada dentro da string
		System.out.println("Olá pessoal".charAt(4)); 
		
		//String é um OBJETO IMUTÁVEL
		String s = "Boa tarde";
		System.out.println(s.concat("!!"));
		System.out.println(s + "!!");
		//stratsWith verifica se a string inicia com a palavra filtrada (CASE SENSITIVE)
		System.out.println(s.startsWith("boa"));
		//stratsWith verifica se a string termina com a palavra filtrada (CASE SENSITIVE)
		System.out.println(s.endsWith("tarde"));
		//.length retorna o tamanho da String
		System.out.println(s.length());
		//equals faz a comparação de igualdade com CASE SENSITIVE
		System.out.println(s.equals("boa tarde"));
		//equalsIgnoreCase faz a comparação de igualdade sem  CASE SENSITIVE
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		//Atribui o tipo da variável por inferência
		var nome = "Pedro";
//		Neste exemplo é possível usar os métodos da string na variável do tipo String ex .nome ou .sobrenome
		var sobrenome = "Santos";
		var idade = 33; //inferência tipo inteiro
		var salario = 12345.987; //inferência tipo double
		
		String maisUmaFrase = "Nome: " + nome + " \nSobrenome: " + sobrenome + 
				" \nIdade: " + idade + " \nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
//		System.out.println("Nome: " + nome + " \nSobrenome: " + sobrenome + " \nIdade: " + idade + " \nSalario: " + salario + "\n\n");
		
		//Utilizando o método de interpolação String (%s), Inteiro (%d), Double (%f)
		//No exemplo abaixo substitui o valor da variável pela interpolação setada
		//%.2f define quantas casas decimais irá querer ter na string gerada
		System.out.printf("O senhor Nome: %s %s tem %d de idade e ganha R$ %.2f reais", nome, sobrenome, idade, salario);
		
		
		String frase = String.format("\nO senhor Nome: %s %s tem %d de idade e ganha R$ %.2f reais", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}
}

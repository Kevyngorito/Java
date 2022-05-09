package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		//Operadores tern�rios s�o atribui��es condicionais
		
		double media = 7.6;
		/* Atribui a string resultado o valor da expressao
		  media >=7 caso verdade (?) "retorna mensagem para verdadeiro caso falso (:)
		  "retorna mensagem para falso*/
		
		String recuperacao = media >= 5.0 ? "em recupera��o" : "reprovado.";
		String resultado = media >= 7.0 ? "Aprovado" : recuperacao;
		System.out.println("O aluno est� " + resultado);
	}
}

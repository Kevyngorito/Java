package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		//Operadores ternários são atribuições condicionais
		
		double media = 7.6;
		/* Atribui a string resultado o valor da expressao
		  media >=7 caso verdade (?) "retorna mensagem para verdadeiro caso falso (:)
		  "retorna mensagem para falso*/
		
		String recuperacao = media >= 5.0 ? "em recuperação" : "reprovado.";
		String resultado = media >= 7.0 ? "Aprovado" : recuperacao;
		System.out.println("O aluno está " + resultado);
	}
}

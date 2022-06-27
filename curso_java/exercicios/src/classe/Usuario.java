package classe;

public class Usuario {

	String nome;
	String email;
	
	/*� feita uma convers�o do object que � a classe m�e
	 * do java, todas as classes descendem dela, � a mais gen�rica
	 * do java.*/
	
	public boolean equals(Object objeto) {
		/*Nesta linha � feita uma convers�o do objeto para Usuario*/
		/*Se o objeto recebido for instanciado como Usuario ent�o,
		 * atender� a condi��o abaixo, se n�o retorna false.*/
		if(objeto instanceof Usuario) {
			
		Usuario outro = (Usuario) objeto;
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		return nomeIgual && emailIgual;
		} return false;
	}
}

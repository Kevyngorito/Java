package classe;

public class Usuario {

	String nome;
	String email;
	
	/*É feita uma conversão do object que é a classe mãe
	 * do java, todas as classes descendem dela, é a mais genérica
	 * do java.*/
	
	public boolean equals(Object objeto) {
		/*Nesta linha é feita uma conversão do objeto para Usuario*/
		/*Se o objeto recebido for instanciado como Usuario então,
		 * atenderá a condição abaixo, se não retorna false.*/
		if(objeto instanceof Usuario) {
			
		Usuario outro = (Usuario) objeto;
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		return nomeIgual && emailIgual;
		} return false;
	}
}

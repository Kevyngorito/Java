package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	//N�o foi atribu�do nenhum par�metro para o m�todo abaixo, pois os m�todos necess�rios
	//para calcular o desconto, que s�o pre�o e desconto, est�o sendo herdados pelo objeto produto
	//1 representa 100% de desconto
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	//Cria��o de um segundo m�todo com o mesmo nome, � permitido pois os par�metros s�o diferentes em quantidade
	double precoComDesconto (double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}

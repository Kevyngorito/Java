package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	//Não foi atribuído nenhum parâmetro para o método abaixo, pois os métodos necessários
	//para calcular o desconto, que são preço e desconto, estão sendo herdados pelo objeto produto
	//1 representa 100% de desconto
	
	Produto() {
		
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
		
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	//Criação de um segundo método com o mesmo nome, é permitido pois os parâmetros são diferentes em quantidade
	double precoComDesconto (double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}

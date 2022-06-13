package classe;

public class Produto {

	String nome;
	double preco;
	//Definindo desconto como sendo atributo da classe STATIC
	static double desconto = 0.25;
	
	//Não foi atribuído nenhum parâmetro para o método abaixo, pois os métodos necessários
	//para calcular o desconto, que são preço e desconto, estão sendo herdados pelo objeto produto
	//1 representa 100% de desconto
	
	Produto() {
		
	}
	
	/*O desconto foi removido do construtor propositalmente por questão de clareza 
	  Para que o mesmo fosse setado de forma explícita e caso não fosse setado, o desconto
	  iria adotar o valor estático setado na classe, que seria de 0.25*/
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
		
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	//Criação de um segundo método com o mesmo nome, é permitido pois os parâmetros são diferentes em quantidade
	double precoComDesconto (double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}

package classe;

public class Produto {

	String nome;
	double preco;
	//Definindo desconto como sendo atributo da classe STATIC
	static double desconto = 0.25;
	
	//N�o foi atribu�do nenhum par�metro para o m�todo abaixo, pois os m�todos necess�rios
	//para calcular o desconto, que s�o pre�o e desconto, est�o sendo herdados pelo objeto produto
	//1 representa 100% de desconto
	
	Produto() {
		
	}
	
	/*O desconto foi removido do construtor propositalmente por quest�o de clareza 
	  Para que o mesmo fosse setado de forma expl�cita e caso n�o fosse setado, o desconto
	  iria adotar o valor est�tico setado na classe, que seria de 0.25*/
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
		
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	//Cria��o de um segundo m�todo com o mesmo nome, � permitido pois os par�metros s�o diferentes em quantidade
	double precoComDesconto (double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}

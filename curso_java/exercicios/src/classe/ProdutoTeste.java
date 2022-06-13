package classe;



public class ProdutoTeste {

	public static void main(String[] args) {
		
		/*new é a palavra responsável por chamar o método construtor e o nome do construtor
		 é exatamente o nome da classe */
		  
		
		/*
		Produto p1 = new Produto(); //chamando o construtor referindo a classe produto.
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		*/
		//Refatorado dentro do construtor via parâmetro.
		Produto p1 = new Produto ("Notebook",4356.89);
		
		//a variável p2 receberá o tipo produto por inferência
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		//Desconto por padrão setado na classe é 0.25% abaixo estamos setando o novo percentual para aplicação de desconto de 0.29%
		/* O desconto não está mais sendo acessado a partir de uma instância, mas sim diretamente
		 * através da classe.*/
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		//Refatorando o calculo do preço final, utilizando o método criado para atribuição do cálculo
		/*Quando a chamada contiver () esta chamará um método, se não tiver () então chamará um atributo
		 No caso abaixo está chamando um método */
		double precoFinal1 = p1.precoComDesconto(); //p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.precoComDesconto(0.25); //p2.preco * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("A média do carrinho = R$%.2f.", mediaCarrinho);
	}
}

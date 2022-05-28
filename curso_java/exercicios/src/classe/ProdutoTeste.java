package classe;



public class ProdutoTeste {

	public static void main(String[] args) {
		
		/*new � a palavra respons�vel por chamar o m�todo construtor e o nome do construtor
		 � exatamente o nome da classe */
		  
		
		/*
		Produto p1 = new Produto(); //chamando o construtor referindo a classe produto.
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		*/
		//Refatorado dentro do construtor via par�metro.
		Produto p1 = new Produto ("Notebook",4356.89, 0.25);
		
		//a vari�vel p2 receber� o tipo produto por infer�ncia
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		//Refatorando o calculo do pre�o final, utilizando o m�todo criado para atribui��o do c�lculo
		/*Quando a chamada contiver () esta chamar� um m�todo, se n�o tiver () ent�o chamar� um atributo
		 No caso abaixo est� chamando um m�todo */
		double precoFinal1 = p1.precoComDesconto(); //p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.precoComDesconto(0.25); //p2.preco * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("A m�dia do carrinho = R$%.2f.", mediaCarrinho);
	}
}

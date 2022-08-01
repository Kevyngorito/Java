package oo.composicao.desafio;

public class Item {

	//Um item aponta para um �nico produto, logo n�o ser� utilizado uma lista
	final Produto produto;
	final int quantidade;
	
	//Em um item espera-se receber um produto de tipo produto e uma quantidade do tipo inteiro
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
}

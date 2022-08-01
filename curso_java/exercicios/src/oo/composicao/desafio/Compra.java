package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	//Atribui��o entre classes, uma compra possui itens...
	final List<Item> itens = new ArrayList<>();
	
	//Cria��o de m�todo para simplificar a adi��o dos itens na lista
	void adicionarItem(Produto p, int quantidade) {
		//Adiciona um item � lista de compra e j� faz a cria��o do item
		this.itens.add(new Item(p, quantidade));
	}
	
	
	//Realiza a cria��o do produto e j� faz a inclus�o do produto aos itens
	void adicionarItem(String nome, double preco, int quantidade) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	
	//M�todo para obter valor total (PRE�O)
	double obterValorTotal() {
		double total = 0;
		//Percorre todos os itens de item, do tipo Item.
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
			
		}
		
		return total;
		
	}
}

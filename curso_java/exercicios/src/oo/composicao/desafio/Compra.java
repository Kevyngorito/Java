package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	//Atribuição entre classes, uma compra possui itens...
	final List<Item> itens = new ArrayList<>();
	
	//Criação de método para simplificar a adição dos itens na lista
	void adicionarItem(Produto p, int quantidade) {
		//Adiciona um item à lista de compra e já faz a criação do item
		this.itens.add(new Item(p, quantidade));
	}
	
	
	//Realiza a criação do produto e já faz a inclusão do produto aos itens
	void adicionarItem(String nome, double preco, int quantidade) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	
	//Método para obter valor total (PREÇO)
	double obterValorTotal() {
		double total = 0;
		//Percorre todos os itens de item, do tipo Item.
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
			
		}
		
		return total;
		
	}
}

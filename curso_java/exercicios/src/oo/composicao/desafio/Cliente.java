package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	
	double obterValorTotal() {
		double total = 0 ;
		
		for(Compra compra: compras) {
			//acessa o método obtervalortotal da classe compra
			total += compra.obterValorTotal();
		}
		
		return total;
	}
	
	final String nome;
	

}

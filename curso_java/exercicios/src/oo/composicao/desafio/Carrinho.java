package oo.composicao.desafio;

public class Carrinho {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		//Método criado já com o produto instanciado
		compra1.adicionarItem("Mouse sem fio", 29.99 , 2);
		compra1.adicionarItem(new Produto("Teclado sem fio", 99.99), 2);
		
		//Método criado sem o produto instanciado
		Compra compra2 = new Compra();
		compra1.adicionarItem("Monitor", 799.99, 2);
		compra1.adicionarItem(new Produto("Gabinete", 1999.99), 2);
		
		Cliente cliente = new Cliente("Estremafogilda");
		cliente.adicionarCompra(compra2);
		cliente.compras.add(compra2);
		
		System.out.println("O total do carrinho é R$" + cliente.obterValorTotal());
	}
	
}

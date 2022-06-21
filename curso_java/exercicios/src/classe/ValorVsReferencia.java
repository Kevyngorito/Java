package classe;

import desafios.ClassesEMetodos.Data;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		//Trabalhando com tipo primitivo
		double a = 2;
		double b = a; //Atribuição por valor -> uma cópia do valor é definido na memória.
		
		//valores INDEPENDENTES
		a++;//A valia 2 ++ virou 3
		b--;//A cópia de A valia 2 com o -- virou 1
		
		System.out.println(a + "\n" + b);
		
		//Criando um objeto data
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //Atribuição por referência (pois trabalha com (OBJETO)
		
		/*Alterando qualquer atributo seja de d1 ou d2, alterará em ambos os resultados 
		  pois as duas variáveis apontam para um mesmo objeto em memória*/
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;		
		
		/*Quando um objeto é passado como parâmetro para um método, é passado NÃO UM CLONE
		 do objeto, mas um referência e se DENTRO DESTE MÉTODO, for mexido em algum dado
		 do objeto, quando o método terminar, quem passou o objeto irá perceber que houve
		 uma mudança.*/
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		//A chamada deste método causou uma alteração no objeto
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	
	//Um método Static só consegue acessar um outro método Static
	
	//Objeto Data sendo passado como parâmetro para o método 
	static void voltarDataParaValorPadrao(Data d) {
		//Mediante a essas alterações, ele irá alterar no objeto que foi passado.
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	//Nesta forma, é passada uma cópia do valor
	/*Quando passamos um valor primitivo como parâmtro para o método, é passado uma cópia
	E não uma referência, ou seja, primitivo sempre será passado por valor(cópia do valor)
	será criada na memória e no caso de objeto tanto uma atribuição quanto passar um objeto
	como parâmetro pra um método, será passado via (REFERÊNCIA) de tal forma que o que
	o que você mexer dentro do método via referência irá causar impacto já no método via
	tipo primitivo(cópia) não irá gerar impacto para "fora"*/
	static void alterarPrimitivo(int c) {
		c++;
	}
}

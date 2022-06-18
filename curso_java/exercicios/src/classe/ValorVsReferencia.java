package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		//Trabalhando com tipo primitivo
		double a = 2;
		double b = a; //Atribui��o por valor -> uma c�pia do valor � definido na mem�ria.
		
		//valores INDEPENDENTES
		a++;//A valia 2 ++ virou 3
		b--;//A c�pia de A valia 2 com o -- virou 1
		
		System.out.println(a + "\n" + b);
		
		//Criando um objeto data
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //Atribui��o por refer�ncia (pois trabalha com (OBJETO)
		
		/*Alterando qualquer atributo seja de d1 ou d2, alterar� em ambos os resultados 
		  pois as duas vari�veis apontam para um mesmo objeto em mem�ria*/
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;		
		
		/*Quando um objeto � passado como par�metro para um m�todo, � passado N�O UM CLONE
		 do objeto, mas um refer�ncia e se DENTRO DESTE M�TODO, for mexido em algum dado
		 do objeto, quando o m�todo terminar, quem passou o objeto ir� perceber que houve
		 uma mudan�a.*/
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		//A chamada deste m�todo causou uma altera��o no objeto
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	
	//Um m�todo Static s� consegue acessar um outro m�todo Static
	
	//Objeto Data sendo passado como par�metro para o m�todo 
	static void voltarDataParaValorPadrao(Data d) {
		//Mediante a essas altera��es, ele ir� alterar no objeto que foi passado.
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	//Nesta forma, � passada uma c�pia do valor
	/*Quando passamos um valor primitivo como par�mtro para o m�todo, � passado uma c�pia
	E n�o uma refer�ncia, ou seja, primitivo sempre ser� passado por valor(c�pia do valor)
	ser� criada na mem�ria e no caso de objeto tanto uma atribui��o quanto passar um objeto
	como par�metro pra um m�todo, ser� passado via (REFER�NCIA) de tal forma que o que
	o que voc� mexer dentro do m�todo via refer�ncia ir� causar impacto j� no m�todo via
	tipo primitivo(c�pia) n�o ir� gerar impacto para "fora"*/
	static void alterarPrimitivo(int c) {
		c++;
	}
}

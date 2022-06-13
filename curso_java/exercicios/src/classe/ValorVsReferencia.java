package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		//Trabalhando com tipo primitivo
		double a = 2;
		double b = a; //Atribui��o por valor -> uma c�pia do valor � definido na mem�ria.
		
		//valores INDEPENDENTES
		a++;//A valia 2 ++ virou 3
		b--;//A c�pia de A valia 2 com o -- virou 1
		
		System.out.println(a + "\n " + b);
		
		//Criando um objeto data
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //Atribui��o por refer�ncia (pois trabalha com (OBJETO)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		
		
	}
}

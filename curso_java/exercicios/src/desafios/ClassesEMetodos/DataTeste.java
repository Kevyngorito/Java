package desafios.ClassesEMetodos;



public class DataTeste {
	
	

	public static void main(String[] args) {
		
		Data year = new Data();
		year.ano = 2017;
		year.dia = 28;
		year.mes = 04;
		
		Data year2 = new Data();
		year2.ano = 2022;
		year2.dia = 28;
		year2.mes = 04;
		
		
		
		System.out.println("A data informada é " +  year.obterDataFormatada());
		System.out.printf("A data informada é: %s", year2.obterDataFormatada());
		
		
	}
}



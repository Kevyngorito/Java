package desafios.ClassesEMetodos;



public class DataTeste {
	
	

	public static void main(String[] args) {
		
		Data year = new Data();
		year.ano = 2017;
		year.dia = 28;
		year.mes = 04;
		
		int ano = year.ano;
		int mes = year.mes;
		int dia = year.dia;
		
		
		System.out.printf("A data informada é: %d/%d/%d", dia, mes, ano);
		
		
	}
}



package classe;



public class DataTeste {
	
	

	public static void main(String[] args) {
		
		Data year = new Data();
		
		
		Data year2 = new Data(01,02,2022);
		
		
		
		
		System.out.println("A data informada é " +  year.obterDataFormatada());
		System.out.printf("A data informada é: %s", year2.obterDataFormatada());
		
		
	}
}



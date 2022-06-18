package desafios.ClassesEMetodos;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int dia, int mes, int ano) {
		//this nesse contexto estará utilizando as variáveis de instância dia, mes e ano.
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
		
	}

}

package oo.composicao;

public class Motor {

	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros() {
		//Arredonda para o valor + próximo com round e faz cast do resultado.
		if(!ligado) {
			return 0;
		}
		return (int) Math.round(fatorInjecao* 3000);
	}
}

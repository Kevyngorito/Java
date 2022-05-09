package fundamentos.conversoes;

public class ConversaoTiposPrimitivosNumerico {

	public static void main(String[] args) {
		/*Convers�o implicita convertendo o literal 1 que � um int
		para um double */
		double a = 1; //impl�cita
		System.out.println(a);
		
		/*Nesse caso n�o h� como converter o literal em um float 
		 pois o literal � do tipo Double que � maior que o float
		 uma solu��o seria inserir a letra F ao final do literal
		 convertendo o literal double em um valor float
		 		float b = 1.0F;
		  */
		/* Para fazer de forma expl�cita CAST dever� ser inserido o
		 (float) na frente do literal fazendo a convers�o do mesmo
		 */
		/*Caso o valor seja maior que o valor que o float suporta
		 * o valor informado ser� truncado
		 * ex: 	float b = (float) 1.1234567888888;
		 */
		float b = (float) 1.12345; //expl�cita (cast)
		System.out.println(b);
		
		//int � 4x maior do que o byte
		//byte -128 at� 127
		int c = 340;
		byte d = (byte) c; //cast
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}
}

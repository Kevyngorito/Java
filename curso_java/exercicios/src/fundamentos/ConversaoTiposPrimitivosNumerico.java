package fundamentos;

public class ConversaoTiposPrimitivosNumerico {

	public static void main(String[] args) {
		/*Conversão implicita convertendo o literal 1 que é um int
		para um double */
		double a = 1; //implícita
		System.out.println(a);
		
		/*Nesse caso não há como converter o literal em um float 
		 pois o literal é do tipo Double que é maior que o float
		 uma solução seria inserir a letra F ao final do literal
		 convertendo o literal double em um valor float
		 		float b = 1.0F;
		  */
		/* Para fazer de forma explícita CAST deverá ser inserido o
		 (float) na frente do literal fazendo a conversão do mesmo
		 */
		/*Caso o valor seja maior que o valor que o float suporta
		 * o valor informado será truncado
		 * ex: 	float b = (float) 1.1234567888888;
		 */
		float b = (float) 1.12345; //explícita (cast)
		System.out.println(b);
		
		//int é 4x maior do que o byte
		//byte -128 até 127
		int c = 340;
		byte d = (byte) c; //cast
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}
}

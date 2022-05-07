package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		/*String � uma classe no momento em que � criado um valor
		associado a uma classe (neste caso a String) n�s dizemos
		que este valor � um objeto e utilizando a nota��o (.) neste
		objeto, ele poder� ter atributos e comportamentos. */
		
		String s = "texto";
		//ou String s = new String ("texto");
		s.toUpperCase();
		System.out.println(s);
		
		//O tipo primitivo n�o carrega nenum comportamento ou atributo
		//para isso � necess�rio utilizar Wrappers (vers�o objeto do tipo primitivo)
		int a = 123;
		System.out.println(a);
		
	}
}

package fundamentos.tipos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		/*String é uma classe no momento em que é criado um valor
		associado a uma classe (neste caso a String) nós dizemos
		que este valor é um objeto e utilizando a notação (.) neste
		objeto, ele poderá ter atributos e comportamentos. */
		
		String s = "texto";
		//ou String s = new String ("texto");
		s.toUpperCase();
		System.out.println(s);
		
		//O tipo primitivo não carrega nenum comportamento ou atributo
		//para isso é necessário utilizar Wrappers (versão objeto do tipo primitivo)
		int a = 123;
		System.out.println(a);
		
	}
}

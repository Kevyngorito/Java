package classe;

import java.util.Date;

public class Equals {
public static void main(String[] args) {
	
	Usuario u1 = new Usuario();
	u1.nome = "Pedro Silva";
	u1.email = "pedro.silva@xyz.com.br";
	
	
	Usuario u2 = new Usuario();
	u2.nome = "Pedro Silva";
	u2.email = "pedro.silva@xyz.com.br";
	
	//Comparando endere�o de mem�ria com ==
	System.out.println(u1 == u2);
	//Por padr�o o equals compara o endere�o de mem�ria, ou seja, false
	System.out.println(u1.equals(u2));
	System.out.println(u2.equals(u1));
	
	//Retornar� false, pois identifica que o objeto n�o � do tipo Usuario
	System.out.println(u2.equals(new Date()));

	
}
	
}

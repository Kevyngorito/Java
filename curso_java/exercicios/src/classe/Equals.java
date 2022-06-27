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
	
	//Comparando endereço de memória com ==
	System.out.println(u1 == u2);
	//Por padrão o equals compara o endereço de memória, ou seja, false
	System.out.println(u1.equals(u2));
	System.out.println(u2.equals(u1));
	
	//Retornará false, pois identifica que o objeto não é do tipo Usuario
	System.out.println(u2.equals(new Date()));

	
}
	
}

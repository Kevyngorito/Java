package desafios.estruturaDeControle;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		/*
		double a = (6 * (3 + 2));
		double b = Math.pow(a, 2);
		double c = b / (3*2);
		
		double a1 = (1-5) * (2-7) / 2;
		double b2 = Math.pow(a1, 2);
		
		double calc1 = (c - b2);
		double calc2 = Math.pow(10, 3);
		double calc3 = Math.pow(calc1, 3);
		double result = calc3 / calc2;
		System.out.println((int) result);
		*/
		
		//Refatorando
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é: " + (int) resultado);
	
		
		
		
	}
}

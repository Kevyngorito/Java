package desafios;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		
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
		
		
		
	}
}

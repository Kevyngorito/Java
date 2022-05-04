package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		//Fórmula farenhairt (°F - 32) * 5/9 = °C
		
		double temp1 = 35;
		final double FORMULATEMP1 = 32;
		final double FORMULACONVERT = 5.0 / 9.0;
		double resultC = (temp1 - FORMULATEMP1) * FORMULACONVERT;
		System.out.println(resultC);
	}
}

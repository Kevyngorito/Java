package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		//Fórmula farenhairt (°F - 32) * 5/9 = °C
		//CTRL + ALT + SETA (V) duplica uma linha para mover ALT + ^
		
		double temp1 = 86;
		final double FORMULATEMP1 = 32;
		final double FORMULACONVERT = 5.0 / 9.0;
		double resultC = (temp1 - FORMULATEMP1) * FORMULACONVERT;
		
		System.out.println("Exemplo 1: O resultado é " + resultC + "°C. \n");		
		temp1 = 150;
		resultC = (temp1 - FORMULATEMP1) * FORMULACONVERT;
		System.out.println("Exemplo 2: O resultado é " + resultC + "°C.");

	}
}

package arrays.challengers;

import java.util.Scanner;

public class StudentNotes {

	public static void main(String[] args) {

		double[] arr = new double[4];
		
		Scanner input = new Scanner (System.in);
		System.out.println("Report the first note: ");
		arr[0] = input.nextDouble();		
		System.out.println("Report the second note: ");
		arr[1] = input.nextDouble();		
		System.out.println("Report the third note: ");
		arr[2] = input.nextDouble();		
		System.out.println("Report the fourth note: ");
		arr[3] = input.nextDouble();		
				
		for(double notes: arr) {
		System.out.print("[" + notes + "]");
		}
		input.close();
	}

}

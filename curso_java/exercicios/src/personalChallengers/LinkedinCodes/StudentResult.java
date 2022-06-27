package personalChallengers.LinkedinCodes;

import java.util.Locale;
import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner in = new Scanner(System.in);
		
		Student s1 = new Student();
		System.out.println("Report your name: ");	
		s1.name = in.nextLine();
		System.out.println("Report the first note: ");	
		s1.note1 = in.nextDouble();
		System.out.println("Report the second note: ");	
		s1.note2 = in.nextDouble();
		System.out.println("Report the third note: ");	
		s1.note3 = in.nextDouble();
		System.out.println(s1.checkAprove());
		
		
		in.close();
	}
}

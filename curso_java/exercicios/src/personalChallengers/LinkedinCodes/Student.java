package personalChallengers.LinkedinCodes;

public class Student {

	public String name;
	public double note1, note2, note3;
	public final double AVERAGE = 6;
	
	
	public double studentAverage() {
		return (note1+ note2 + note3) / 3;
	}
	
	public String checkAprove() {
		if(studentAverage() >= AVERAGE) {
			return name.concat(" congratulation, you are approved, with " + studentAverage());
		} else if (studentAverage() < AVERAGE && studentAverage() >= 5) {
			return (name + " your average is: " + studentAverage() + " you are in recovery");
		}
		return name.concat(" you are flunked!");
	}
	
}
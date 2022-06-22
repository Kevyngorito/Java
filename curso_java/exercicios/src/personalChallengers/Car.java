package personalChallengers;

public class Car {

	String name;
	String model;
	int year;
	boolean on = false;
	int speed;
	
	Car(String name, String model, int year, int speed){
		this.name = name;
		this.model = model;
		this.year = year;
		this.speed = speed;
	}
	
	public String showCar() {
		return  "The " + this.name + " car " + "year " + this.year + " is the " + this.speed + " Km\\h.";
	}
	
	String checkOnCar() {
		if(!on) {
		return	"The car is off";
		} 
		this.on = true;
		return "The car is on vrum vrum...";
	}
	
	void onCar() {
		if(!on) {
		this.on = true;
		System.out.println("Vrum vrum the car is on!");
		}
	}
	
	public int speedUp() {
		return this.speed += 30;
	}
	
}

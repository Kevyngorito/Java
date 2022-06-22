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
		return speedUp();
	}
	
	void onCar() {
		if(!on) {
		this.on = true;
		System.out.println("Vrum vrum the car is on!");
		}
	}
	
	public String speedUp() {
		this.speed += 45 ;
		System.out.println("Vrum vrum speeding up...");
		return "Your current speed is: " + this.speed + " Km\\h";
		
	}
	
	String offCar() {
		if(this.speed <= 0) {
			this.on = false;
		}
		return "The car is off!";

	}
	
	public String brake() {
		if(this.speed <= 0) {
			return "The car is already off! Impossible to brake.";
		}
		this.speed -= 15;
		System.out.println("Stepping on the brake...");
		return "The is slowing down, current speed is: " + this.speed + " Km\\h";
	}
	
	
	
}

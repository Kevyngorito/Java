package personalChallengers;

public class Car {

	String name;
	String model;
	int year;
	boolean on;
	
	Car(String name, String model, int year, boolean on){
		this.name = name;
		this.model = model;
		this.year = year;
		this.on = on;
	}
	
	String onCar () {
		if(on) {
		return	"The car is on";
		} 
		return "The car is off";
	}
}

package personalChallengers;


public class ManagerCar {

	public static void main(String[] args) {
		
		
		Car c1 = new Car("Compass", "Jeep", 2020,0);
		System.out.println("Is the car on? ");
		System.out.println(c1.checkOnCar());
		System.out.println("Do you want to start the car?");
		c1.onCar();
		System.out.println(c1.on);
		c1.onCar();
		System.out.println("do you want to accelerate?");
		System.out.println(c1.speedUp());
		System.out.println(c1.speedUp());
		
		System.out.println("Radar ahead, want to brake?");
		System.out.println(c1.brake());
		System.out.println(c1.brake());
		System.out.println(c1.brake());
		System.out.println(c1.brake());
		System.out.println(c1.brake());
		System.out.println(c1.brake());
		System.out.println(c1.brake());
		
	}
}

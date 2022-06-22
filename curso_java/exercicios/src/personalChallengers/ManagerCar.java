package personalChallengers;

import java.util.Scanner;

public class ManagerCar {

	public static void main(String[] args) {
		
		String start, accelerate, brake;
		Car c1 = new Car("Compass", "Jeep", 2020);
		System.out.println("The car is: " + c1.name + " | model: " + c1.model + " | year: " + c1.year);
		c1.delay();
		Scanner input = new Scanner(System.in);
		System.out.println("Is the car on? " + c1.checkOnCar());
		c1.delay();
		System.out.println("Do you want to start the car?");
		start = input.next();
		if(start.equalsIgnoreCase("yes")) {
			c1.delay();
			c1.onCar();
			c1.delay();
			System.out.println("do you want to accelerate?");
			c1.delay();
			accelerate = input.next();
			if(accelerate.equalsIgnoreCase("yes")) {
				System.out.println(c1.speedUp());
				c1.delay();
				System.out.println(c1.speedUp());
				System.out.println("Radar ahead, want to brake?");
				c1.delay();
				brake = input.next();
				if(brake.equalsIgnoreCase("yes")) {
					System.out.println(c1.brake());
					c1.delay();
					System.out.println(c1.brake());
					c1.delay();
					System.out.println(c1.brake());
					c1.delay();
					System.out.println(c1.brake());
					c1.delay();
					System.out.println(c1.brake());
					c1.delay();
					System.out.println(c1.brake());
					c1.delay();
					System.out.println(c1.brake());
				} else {
					System.out.println("Mandatory stop not performed, vehicle will be turned off in 3 seconds...");
					c1.delay();
					c1.delay();
					System.out.println(c1.brake());
					c1.delay();
					System.out.println(c1.brake());
					c1.delay();
					System.out.println(c1.brake());
					c1.delay();
					System.out.println(c1.brake());
					c1.delay();
					System.out.println(c1.brake());
					c1.delay();
					System.out.println(c1.brake());
					c1.delay();
					System.out.println(c1.forcedBrake());
					System.out.println("Vehicle blocked by the insurance company! Please contact us.");
				}
				
			} else {
				System.out.println("Ok, the car will remain stationary.");
				c1.delay();
				System.out.println("The program will terminate.");
			}
			
		} else {
			System.out.println("Alright, the will remain off. ");
			c1.delay();
			System.out.println("The program will terminate.");
		}
		
		input.close();
	}
}

package Activities;

public class Car {
	
	
	String color;
	String transmission;
	int make ;
	int tyres;
	int doors;
	
	Car() {
	int tyres = 4;
	int doors = 4;
	}
	
	public void displayCharacteristics() {
		
		System.out.println("Color of the Car: " + color);
		System.out.println("Make of the Car: " + make);
		System.out.println("Transmission of the Car: " + transmission);
	    System.out.println("Number of tyres on the car: " +tyres);
	    System.out.println("Number of doors on the car: " +doors );
		
	}
	
	public void accelerate() {
		System.out.println("Car is moving forward");
	}

	public void brake() {
		System.out.println("Car is stopped");
	}

	
}

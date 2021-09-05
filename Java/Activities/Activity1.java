package Activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Car maruti = new Car();
  
  maruti.make = 2014;
  maruti.color = "Black";
  maruti.transmission = "Manual";

  //Using Car class method
  maruti.displayCharacteristics();
  maruti.accelerate();
  maruti.brake();
  
	}

}

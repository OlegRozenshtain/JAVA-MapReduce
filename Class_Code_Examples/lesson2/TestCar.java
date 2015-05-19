package lesson2;

public class TestCar {

	public static void main(String[] args) {

		System.out.println("Testing application for the Car class");

		int distance = 100;
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.setMake("Subaru");
		c1.drive(distance);
		
		c2.setMake("Suzuki");
		c2.drive(2*distance);
		
		c2.drive();
		c2.drive(2*distance+50);
		
		int e = c1.getEngine();
		e*=2; // e = e*2;	

		
		System.out.println("c1 engine is: " + c1.getEngine());		//1200 -> "1200"
		System.out.println(e);
		
		Car c3 = new Car(8, "Mazda");	
		
		
		System.out.println("c3 make: " + c3.getMake());
		c3.setMake("BMW");
		System.out.println("c3 make: " + c3.getMake());
		System.out.println("c3 wheels: " + c3.getWheels());
		
		Car c4 = new Car(6);

		
		
	}

}

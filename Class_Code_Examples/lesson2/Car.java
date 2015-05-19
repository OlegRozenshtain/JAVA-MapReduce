package lesson2;

public class Car {
	
	int wheels = 4;
	int engine = 1200;
	String make = null;
	final int LICENSE=0;
	
	public Car() {
	
	}
	
	public Car(int wheels) {		

		this.wheels = wheels;
		make = "No Brand";
	}
	
	public Car(int wheels, String make) {
	
		this.wheels = wheels;
		this.make = make;
	}
	
	public int getWheels() {
		
		return wheels;
	}
	public void setWheels(int numberOfWheels) {
		
		this.wheels = numberOfWheels;
	}
	
	public int getEngine() {
		
		return engine;
	}
	
	public void setEngine(int engine) {
		
		this.engine = engine;
	}
	
	public String getMake() {
		
		return make;
	}
	
	public void setMake(String make) {
		
		this.make = make;
	}
	
	// method overloading
	public void drive() {
		
		System.out.println("Car " + make +" is driving unknown km...");		
	}	
	
	public void drive(int km) {
		
		System.out.println("Car " + make +" is driving " + km + " km...");		
	}	
	
}

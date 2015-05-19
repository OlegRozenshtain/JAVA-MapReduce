package lesson3.day3_code_examples;

public class Car extends Vehicle {
	
	public Car () {
		
		this("NoName", 999, 100);
	}
	
	public Car ( String model ) {
		
		this(model, 999, 200);
	}

	public Car ( String model, int engine ) {
		
		this(model, engine, 300);
	}
	
	public Car ( String model, int engine, int speed ) {
		
		super(model, engine, speed);
		
		System.out.println("inc Car's constructor");
	}
	
	@Override
	public void doSomething() {
		System.out.println(getClass().getSimpleName()+ " " + getModel() + " is doing something...");
		System.out.println("Which means:");
		super.doSomething();
	}

	@Override
	public String toString() {
		return "Car [getModel()=" + getModel() + ", getEngine()=" + getEngine()
				+ ", getSpeed()=" + getSpeed() + "]";
	}
}

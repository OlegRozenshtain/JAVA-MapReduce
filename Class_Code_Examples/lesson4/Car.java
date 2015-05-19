package lesson4;

public abstract class Car extends Vehicle {
	
	private Engine engine;
	
	public Car() {
		this("not Specified");
	}
		
	public Car(String color) {
		this(color, new Engine(1000, 130));		
	}
	
	public Car(String color, Engine e) {
		super(color);
		engine = new Engine(e);
	}
	
	abstract void stopDriving();	
	abstract void drive(int x);

	@Override
	void move(int a, int b) {

		drive(b-a);		
		System.out.println("from point " + a + " to point " +b + ".");		
	}

	@Override
	public String toString() {
		return super.toString() + "Car [engine=" + engine + "] <== ";
	}
}

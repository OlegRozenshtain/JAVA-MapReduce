package lesson3.day3_code_examples;

public class Vehicle {
	
	private String model;
	private int engine;
	private int speed;
		
	public Vehicle(String model, int engine, int speed) {
		
		setModel(model);
		setEngine(engine);
		setSpeed(speed);
		
		System.out.println("in Vehicle's constructor");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		
		if(model.length()>20)
			this.model = model.substring(0, 20);
		else
			this.model = model;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = ( engine<999 ) ? 999 : engine;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = ( speed<0 )? 0 : speed;
	}
	
	public void doSomething() {
		System.out.println("Vehicle " + getModel() + " is doing something...");
	}
}

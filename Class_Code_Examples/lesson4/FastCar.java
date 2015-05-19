package lesson4;

public class FastCar extends Car {
	
	private String turbo = "Turbo is ON";
	
	public FastCar() {
		this("not Specified");
	}
	
	public FastCar(String color) {
		this(color, new Engine(1000, 333));		
	}
	
	public FastCar(String color, Engine e) {
		super(color, e);		
	}
	
	@Override
	public void drive(int distance) {

		System.out.println("Fast Car is driving " + distance + "km (fast)");			
	}

	@Override
	public void stopDriving() {
		
		System.out.println("Stopping Fast!");		
	}

	@Override
	public String toString() {
		return super.toString() + "FastCar [turbo=" + turbo + "]";
	}
}

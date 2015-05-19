package lesson4;

public class SlowCar extends Car {
	
	private final int TOP_SPEED = 50; 
	
	public void drive(int distance) {

		System.out.println("Slow Car is driving " + distance + "km (slowly)");		
	}

	@Override
	void stopDriving() {

		System.out.println("Slowly stopping...");				
	}
	
	@Override
	public String toString() {
		return super.toString() + "SlowCar [TOP_SPEED=" + TOP_SPEED + "]";
	}	
}

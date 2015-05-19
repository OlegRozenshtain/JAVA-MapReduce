package lesson4;

public abstract class Vehicle {
	
	private String color;
	
	public Vehicle() {
		
		this("Not Specified");		
	}
	
	public Vehicle(String color) {		
	
		setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		/////////
		////////
		///////
		////// 
		///// Very complex logic!!!
		////
		///
		//
		this.color = color;
	}		
	
	@Override
	public String toString() {
		return "Vehicle [color=" + color + "] <== ";
	}

	abstract void move(int a, int b);	
}

package lesson4.day4_code_examples;

public abstract class Shape implements Printable {

	String shapeName;
	
	public abstract void printDetails();
	
	final String getShapeName() {
		return shapeName;
	}
	
	
}

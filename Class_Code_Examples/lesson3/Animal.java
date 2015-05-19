package lesson3;

public class Animal {

	static int animalCount;
	
	final String type;
	String color;
	int numberOfLegs;
	boolean wild;
	
	public Animal() {
		
		this("Generic Animal", "Transparent", 5, true);
		//super(); // both super and this should be written at the first line of the constructor
	}	
	
	public Animal(String type) {

		this(type, "Transparent", 5, true);		
	}
	
	public Animal(String type, String color) {

		this(type, color, 5, true);
	}
	
	public Animal(String type, String color, int numberOfLegs) {

		this(type, color, numberOfLegs, true);
	}
	
	public Animal(String type, String color, int numberOfLegs, boolean wild) {

		super();
		animalCount++; //count the number of instances of class Animal		
		this.type = type;
		this.color = color;
		this.numberOfLegs = numberOfLegs;
		this.wild = wild;		
	}
	
	static int getAnimalCount() { 
		
		return animalCount;		
	}
	
	public int getNumberOfLegs() {

		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {

		this.numberOfLegs = numberOfLegs;
	}

	public boolean isWild() {

		return wild;
	}

	public void setWild(boolean wild) {

		this.wild = wild;
	}
	
	public String getType() {

		return type;
	}
	
	/*public void setType(String type) {
		this.type = type;
	}*/ //no setter since type is defined final and will be initialized upon creation
	
	public String getColor() {
	
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void alterInteger( int number ) {
		
		System.out.println(++number);		
	}
		
	public void alterArray( int [] arr) {
				
		for ( int i = 0; i < arr.length; i++) {
			
			arr[i]++;
		}
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", color=" + color + ", numberOfLegs="
				+ numberOfLegs + ", wild=" + wild + "]";
	}
}

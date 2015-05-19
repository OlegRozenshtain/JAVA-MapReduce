package lesson4.day4_code_examples;

// implicitly implementing Printable (and Serializable)
public class Circle extends Shape {
	
	@Override // from Shape
	public void printDetails() {
		System.out.println("Circle Details");
	}

	@Override // from Printable
	public void print() {

		printDetails();		
	}
}

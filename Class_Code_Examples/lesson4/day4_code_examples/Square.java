package lesson4.day4_code_examples;

// explicitly implementing Printable
public class Square extends Shape implements Printable {

	@Override // from Shape
	public void printDetails() {
		System.out.println("Square Details");
	}

	@Override // from Printable
	public void print() {

		printDetails();		
	}	
}

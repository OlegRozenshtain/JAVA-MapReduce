package lesson3.day3_code_examples;

public class CarTest {

	public static void main(String[] args) {

		// constructor with no arguments
		Car testCar = new Car();
		System.out.println();
		
		// constructor with String argument
		Car citroen = new Car("Citroen");
		System.out.println();
		
		// constructor with String and int arguments
		Car subaru = new Car ("Subaru", 2000);
		System.out.println();
		
		// constructor with String and 2 int arguments
		Car bmw = new Car ("bmw", 3100, 400);
		System.out.println();
		
		// implicitly invoking toString methods...
		System.out.println(testCar);
		System.out.println(citroen);
		System.out.println(subaru);
		System.out.println(bmw);
		System.out.println();
		
		bmw.doSomething();
	}
}

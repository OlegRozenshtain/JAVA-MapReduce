package lesson1;

public class ArithmeticOps {
	public static void main(String[] args) {
		// adding numbers
		System.out.println("Adding...");
		System.out.println("\t15 + 17 = " + (15 + 17));
		System.out.println("\t2.5 + 3.52 = " + (2.5 + 3.52));
		// subtracting numbers
		System.out.println("Subtracting...");
		System.out.println("\t15 - 17 = " + (15 - 17));
		System.out.println("\t2.5 - 3.52 = " + (2.5 - 3.52));
		// multiplying numbers
		System.out.println("Multiplying...");
		System.out.println("\t15 * 17 = " + (15 * 17));
		System.out.println("\t2.5 * 3.52 = " + (2.5 * 3.52));
		// dividing numbers
		System.out.println("Dividing...");
		System.out.println("\t15 / 17 = " + (15 / 17));
		System.out.println("\t2.5 / 3.52 = " + (2.5 / 3.52));
		// dividing numbers and computing the remainder
		System.out.println("Computing the remainder...");
		System.out.println("\t15 % 17 = " + (15 % 17));
		System.out.println("\t2.5 % 3.52 = " + (2.5 % 3.52));
		// operations on mixed types
		System.out.println("Mixed types - automatic upcasting...");
		System.out.println("\t17 + 3.52 = " + (17 + 3.52));
		System.out.println("\t15 * 2.5 = " + (15 * 2.5));
	}
}
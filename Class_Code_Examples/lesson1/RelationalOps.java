package lesson1;
public class RelationalOps {
	public static void main(String[] args) {
		// greater than
		System.out.println("Greater than...");
		System.out.println("    15 > 33 = " + (15 > 33));// false
		System.out.println("    33 > 15 = " + (33 > 15));// true
		System.out.println("    33 > 33 = " + (33 > 33));// false
		// greater than or equal to
		System.out.println("Greater than or equal to...");
		System.out.println("    15 >= 33 = " + (15 >= 33));// false
		System.out.println("    33 >= 15 = " + (33 >= 15));// true
		System.out.println("    33 >= 33 = " + (33 >= 33));// true
		// less than
		System.out.println("Less than...");
		System.out.println("    15 < 33 = " + (15 < 33));// true
		System.out.println("    33 < 15 = " + (33 < 15));// false
		System.out.println("    33 < 33 = " + (33 < 33));// false
		// less than or equal to
		System.out.println("Less than or equal to...");
		System.out.println("    15 <= 33 = " + (15 <= 33));// true
		System.out.println("    33 <= 15 = " + (33 <= 15));// false
		System.out.println("    33 <= 33 = " + (33 <= 33));// true
		// equal to
		System.out.println("Equal to...");
		System.out.println("    15 == 33 = " + (15 == 33));// false
		System.out.println("    33 == 33 = " + (33 == 33));// true
		// not equal to
		System.out.println("Not equal to...");
		System.out.println("    15 != 33 = " + (15 != 33));// true
		System.out.println("    33 != 33 = " + (33 != 33));// false
	}
}
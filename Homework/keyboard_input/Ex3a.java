package keyboard_input;

import java.util.Scanner;

/**
 * Input two numbers and swap their content. use a temporary variable.
 */
public class Ex3a
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter number1:");
		float number1 = input.nextFloat();
		System.out.println("please enter number2:");
		float number2 = input.nextFloat();

		float tempNumber = number1;
		number1 = number2;
		number2 = tempNumber;
		
		System.out.println("\nafter swaping...");
		System.out.println("number1 is: " + number1); 
		System.out.println("number2 is: " + number2);
		
		input.close();
	}
}
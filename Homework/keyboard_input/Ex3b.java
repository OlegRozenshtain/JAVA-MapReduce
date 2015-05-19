package keyboard_input;

import java.util.Scanner;

/**
 * Input two numbers and swap their content. don't use a temporary variable.
 */
public class Ex3b
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter number1:");
		float number1 = input.nextFloat();
		System.out.println("please enter number2:");
		float number2 = input.nextFloat();

		number1 += number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		
		System.out.println("\nafter swaping...");
		System.out.println("number1 is: " + number1); 
		System.out.println("number2 is: " + number2);
		
		input.close();
	}
}
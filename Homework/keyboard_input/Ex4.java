package keyboard_input;

import java.util.Scanner;

/**
 * Input a number and print its right-most digit.
 */
public class Ex4
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter a number:");
		int number = input.nextInt();
		
		System.out.println("\nright-most digit is: " + number%10);
		
		input.close();
	}
}

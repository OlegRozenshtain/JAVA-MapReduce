package keyboard_input;

import java.util.Scanner;

/**
 * Input a number and print his absolute value.
 */
public class Ex12
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter a number:");
		float number = input.nextFloat();
		
		// print without moving to a new line (a generic start to the sentence 
		// which would be completed later)
		System.out.print("\nthe numbers absolute value is: ");
		
		if(number < 0)
		{
			System.out.println(number * -1);
		}
		else
		{
			System.out.println(number);
		}
		
		input.close();
	}
}
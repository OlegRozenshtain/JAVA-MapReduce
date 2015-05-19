package keyboard_input;

import java.util.Scanner;

/**
 * Input two numbers and print which is bigger.
 */
public class Ex8
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter two numbers:");
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();

		if(number1 > number2)
		{
			System.out.println("\nthe number " + number1 + " is bigger then " 
							   + number2);
		}
		else if(number1 < number2)
		{
			System.out.println("\nthe number " + number2 + " is bigger then " 
					  		   + number1);
		}
		else
		{
			System.out.println("\nthe numbers are equal");
		}
		
		input.close();
	}
}
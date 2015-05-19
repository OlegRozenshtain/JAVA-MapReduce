package keyboard_input;

import java.util.Scanner;

/**
 * Input three numbers and print the biggest.
 */
public class Ex9
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter three numbers:");
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		float number3 = input.nextFloat();
		
		float max = number1;

		if(number2 > max)
		{
			max = number2;
		}
		if(number3 > max)
		{
			max = number3;
		}
		
		System.out.println("\nthe number " + max + " is the biggest");	
		
		input.close();
	}
}
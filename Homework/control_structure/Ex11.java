package control_structure;

import java.util.Scanner;

/**
 * input a number and print its factorial.
 */
public class Ex11
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input a positive number:");
		int number = input.nextInt();
		
		if (number >= 0)
		{
			int factorial = 1;
			
			for (int i = 1; i <= number; ++i) 
			{
				factorial *= i;
			}
			
			System.out.println("\nthe factorial is: " + factorial);
		}
		else
		{
			System.out.println("\nentered a negative number - factorial not "
							   + "defined");
		}
		
		input.close();
	}
}
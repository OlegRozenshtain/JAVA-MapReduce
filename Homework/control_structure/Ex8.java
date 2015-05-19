package control_structure;

import java.util.Scanner;

/**
 * Input 2 numbers and calculate their multiplication (without the * operator)
 */
public class Ex8
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter two numbers:");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int result = 0;
		
		for (int i = 0; i < number1; ++i) 
		{
			result += number2;
		}
		
		System.out.println("\nthe numbers multiplication is: " + result);
		
		input.close();
	}
}
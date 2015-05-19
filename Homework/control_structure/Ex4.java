package control_structure;

import java.util.Scanner;

/**
 * Input 30 numbers and print how many were negative.
 */
public class Ex4
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int inputNumber = 0;
		int countNegative = 0;
		
		System.out.println("please enter thirty numbers:");
		for (int i = 0; i < 30; ++i) 
		{
			inputNumber = input.nextInt();
			if(inputNumber < 0)
			{
				++countNegative;
			}
		}
		
		System.out.println("\nthere are: " + countNegative + " negative numbers");
		
		input.close();
	}
}
package control_structure;

import java.util.Scanner;

/**
 * Input 10 grades and print the maximum grade.
 */
public class Ex7
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int inputNumber;
		int max = 0;
		
		System.out.println("please enter 10 grades:");
		for (int i = 0; i < 10; ++i) 
		{
			inputNumber = input.nextInt();
			if(inputNumber > max)
			{
				max = inputNumber;
			}
		}
		
		System.out.println("\nthe maximum grade is: " + max);
		
		input.close();
	}
}
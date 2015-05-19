package control_structure;

import java.util.Scanner;

/**
 * Input 10 grades and print the average of the class.
 */
public class Ex6
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		final int numberGrades = 10;
		float sum = 0;
		
		System.out.println("please enter 10 grades:");
		for (int i = 0; i < numberGrades; ++i) 
		{
			sum += input.nextInt();
		}
		
		System.out.println("\nthe avearge is: " + sum/numberGrades);
		
		input.close();
	}
}
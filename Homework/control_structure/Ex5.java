package control_structure;

import java.util.Scanner;

/**
 * Input 10 numbers and print their total sum.
 */
public class Ex5
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("please enter ten numbers:");
		for (int i = 0; i < 10; ++i) 
		{
			sum += input.nextInt();
		}
		
		System.out.println("\nthe sum is: " + sum);
		
		input.close();
	}
}
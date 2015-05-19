package control_structure;

import java.util.Scanner;

/**
 * input a series of numbers until you reach a sum of 100.
 */
public class Ex14
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input a series of numbers:");
		int number = input.nextInt();
		int sum = number;
		
		while(sum < 100)
		{
			number = input.nextInt();
			sum += number;
		}
		
		System.out.println("the sum reached 100");
		
		input.close();
	}
}
package control_structure;

import java.util.Scanner;

/**
 * input a series of numbers ending with (-1) and print its sum.
 */
public class Ex13
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input a series of numbers to sum.");
		System.out.println("enter -1 to end input and get result.");
		int number = input.nextInt();
		int sum = 0;
		
		while(number != -1)
		{
			sum += number;
			number = input.nextInt();
		}
		
		System.out.println("the sum of the series is: " + sum);
		
		input.close();
	}
}
package control_structure;

import java.util.Scanner;

/**
 * input a number and print yes/no if it is a prime number.
 */
public class Ex12
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input a number:");
		int number = input.nextInt();
		boolean prime = true;
		
		// naive check if number is prime: check if number can be divided by any
		// other number from 2 to square root of number without remainder
		for(int i = 2; i <= Math.sqrt(number); i++) 
		{
			if(number % i == 0)
			{
				prime = false;
			}
		}
		
		if(prime)
		{
			System.out.println("\nyes");
		}
		else
		{
			System.out.println("\nno");
		}
		
		input.close();
	}
}
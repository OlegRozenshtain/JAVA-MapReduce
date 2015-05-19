package control_structure;

import java.util.Scanner;

/**
 * input a number and print its reverse number.
 */
public class Ex18
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input a number:");
		int number = input.nextInt();
		int reverseNumber = 0;
		
		while(number != 0)
		{
			reverseNumber = 10 * reverseNumber + (number % 10); 
			number /= 10;
		}
		
		System.out.println("the inputed numbers reverse number is: " + 
						   reverseNumber);
		
		input.close();
	}
}
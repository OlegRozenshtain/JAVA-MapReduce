package control_structure;

import java.util.Scanner;

/**
 * input a number and print its sum of digits.
 */
public class Ex17
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input a number:");
		int number = input.nextInt();
		int sum = 0;
		
		while(number != 0)
		{
			sum += (number % 10); 
			number /= 10;
		}
		
		System.out.println("the inputed numbers sum of digits is: " + sum);
		
		input.close();
	}
}
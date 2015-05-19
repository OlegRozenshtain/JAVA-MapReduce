package control_structure;

import java.util.Scanner;

/**
 * input a number and print its number of digits.
 */
public class Ex16
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input a number:");
		int number = input.nextInt();
		int numberDigits = 0;
		
		do
		{
			number /= 10;
			numberDigits++;
		} while(number != 0);
		
		System.out.println("the inputed number has " + numberDigits + " digits");
		
		input.close();
	}
}
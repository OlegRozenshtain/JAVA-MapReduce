package keyboard_input;

import java.util.Scanner;

/**
 * Input a 3-digit number and print if it contains the digit 6 or not.
 */
public class Ex13
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter a 3-digit number:");
		int number = input.nextInt();
		
		if((number/100 == 6) || ((number%100)/10 == 6) || (number%10 == 6))
		{
			System.out.println("\nthe number contains the digit 6");
		}
		else
		{
			System.out.println("\nthe number doesn't contain the digit 6");
		}
		
		input.close();
	}
}
package keyboard_input;

import java.util.Scanner;

/**
 * Input a 3-digit number and print its left-most digit.
 */
public class Ex5
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter a 3-digit number:");
		int number = input.nextInt();
		
		System.out.println("\nleft-most digit is: " + number/100);
		
		input.close();
	}
}
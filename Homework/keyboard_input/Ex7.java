package keyboard_input;

import java.util.Scanner;

/**
 * Input a number and print if it is even or odd.
 */
public class Ex7
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter a number:");
		int number = input.nextInt();
		
		// print without moving to a new line (a generic start to the sentence 
		// which would be completed later)
		System.out.print("\nthe number is ");
		
		if(number % 2 == 0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
		input.close();
	}
}
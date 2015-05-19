package keyboard_input;

import java.util.Scanner;

/**
 * Input two numbers and print yes/no if one is the divider of the other.
 */
public class Ex14
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter two numbers:");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		if((number1 % number2 == 0) || (number2 % number1 == 0))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		input.close();
	}
}
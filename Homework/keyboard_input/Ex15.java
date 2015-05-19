package keyboard_input;

import java.util.Scanner;

/**
 * Input a 3-digit number and print yes/no if all its digits are even.
 */
public class Ex15
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter a 3-digit number:");
		int number = input.nextInt();
		
		if(((number/100) % 2 == 0) && (((number%100)/10) % 2 == 0) && 
		   ((number%10) % 2 == 0))
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
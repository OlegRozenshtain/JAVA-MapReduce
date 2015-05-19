package keyboard_input;

import java.util.Scanner;

/**
 * Input three numbers and print yes/no if they form a mathematical series
 */
public class Ex10
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter three numbers:");
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		float number3 = input.nextFloat();
		
		if((number3 > number2) && (number2 > number1))
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
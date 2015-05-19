package keyboard_input;

import java.util.Scanner;

/**
 * Input three numbers and print their average
 */
public class Ex2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter three numbers:");
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		float number3 = input.nextFloat();
		
		System.out.println("\nthe average is: " + (number1+number2+number3)/3);
		
		input.close();
	}
}

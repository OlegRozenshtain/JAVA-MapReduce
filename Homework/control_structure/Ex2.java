package control_structure;

import java.util.Scanner;

/**
 * Input 20 numbers and print back only the even numbers.
 */
public class Ex2
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int numbers[] = new int[20];
		
		System.out.println("please enter twenty numbers:");
		for (int i = 0; i < numbers.length; ++i) 
		{
			numbers[i] = input.nextInt();
		}
		
		System.out.println("\nthe even numbers are:");
		for (int i = 0; i < numbers.length; ++i) 
		{
			if(numbers[i] % 2 == 0)
			{
				System.out.println(numbers[i]);
			}
		}
		
		input.close();
	}
}
package control_structure;

import java.util.Scanner;

/**
 * Input 10 numbers and print their right-most digit.
 */
public class Ex1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int numbers[] = new int[10];
		
		System.out.println("please enter ten numbers:");
		for (int i = 0; i < numbers.length; ++i) 
		{
			numbers[i] = input.nextInt();
		}
		
		System.out.println("\nthe right-most digit of the numbers:");
		for (int i = 0; i < numbers.length; ++i) 
		{
			System.out.println(numbers[i]%10);
		}
		
		input.close();
	}
}
package control_structure;

import java.util.Scanner;

/**
 * input 10 numbers and for each print out the number and sum of its digits.
 */
public class Ex22
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
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; ++i) 
		{
			System.out.print("\nthe sum of digits of the number " + numbers[i] +
							   " is: ");
			while(numbers[i] != 0)
			{
				sum += (numbers[i] % 10); 
				numbers[i] /= 10;
			}
			
			System.out.print(sum);
			sum = 0;
		}
		
		input.close();
	}
}
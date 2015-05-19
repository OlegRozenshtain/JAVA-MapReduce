package control_structure;

import java.util.Scanner;

/**
 * Input 15 3-digit numbers. for each legal number print the sum of its digits.
 */
public class Ex3
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int numbers[] = new int[15];
		
		System.out.println("please enter fifteen 3-digit numbers:");
		for (int i = 0; i < numbers.length; ++i) 
		{
			numbers[i] = input.nextInt();
		}
		
		for (int i = 0; i < numbers.length; ++i) 
		{
			int processedNumber = numbers[i];
			if(processedNumber < 0)
				processedNumber *= -1;	// use absolute value to sum digits 
			int digitCount = 0;
			int digitSum = 0;
			while(processedNumber != 0)
			{
				++digitCount;
				digitSum += (processedNumber % 10);
				processedNumber /= 10;
			}
			
			if(digitCount == 3)
			{
				System.out.print("\ndigit sum of " + numbers[i] + " is: " + 
								 digitSum);
			}
			else
			{
				System.out.print("\n" + numbers[i] + " isn't a 3-digit number");
			}
		}
		
		input.close();
	}
}
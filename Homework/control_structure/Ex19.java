package control_structure;

import java.util.Scanner;

/**
 * input a number and print yes/no if it contains the digit 5.
 */
public class Ex19
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input a number:");
		int number = input.nextInt();
		boolean contains = false;
		
		while(number != 0)
		{
			if(number % 10 == 5)
			{
				contains = true;
				break;
			}
			number /= 10;
		}
		
		if(contains)
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
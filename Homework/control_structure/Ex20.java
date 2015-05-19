package control_structure;

import java.util.Scanner;

/**
 * input 2 numbers and print a rectangle of stars with these dimensions.
 */
public class Ex20
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input two numbers:");
		int length = input.nextInt();
		int width = input.nextInt();
		
		for(int i = 0; i < width; i++) 
		{
			System.out.println();
			for(int j = 0; j < length; j++) 
			{
				System.out.print("*");
			}
		}
		
		input.close();
	}
}
package control_structure;

import java.util.Scanner;

/**
 * input a number and print a triangle of stars with this size as its basis 
 * length.
 */
public class Ex21
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input a number:");
		int basis = input.nextInt();
		int lineNumber = 0;
		
		while(basis > 0)
		{
			// print leading spaces
			System.out.println();
			for(int i = 0; i < lineNumber; i++) 
			{
				System.out.print(" ");
			}
			for(int i = 0; i < basis; i++) 
			{
				System.out.print("*");
			}
			
			lineNumber++;
			basis -= 2;
		}
		
		input.close();
	}
}
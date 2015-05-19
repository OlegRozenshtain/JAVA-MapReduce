package built_in_classes;

import java.util.Scanner;

/**
 * input ten strings and concatenate them into a single string
 */
public class Ex4
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter 10 strings");
		StringBuffer concatenatedString = new StringBuffer();
		for(int i = 0; i < 10; ++i) 
		{
			concatenatedString.append(input.nextLine());
		}
		
		System.out.println("\nthe concatenated string:");
		System.out.println(concatenatedString);
		
		input.close();
	}
}
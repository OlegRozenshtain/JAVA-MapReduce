package built_in_classes;

import java.util.Scanner;

/**
 * input a string of text and make a new string of the words without spaces
 */
public class Ex2
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input a line");
		String text = input.nextLine();
		System.out.println("\nthe text without spaces:");
		System.out.println(text.replace(" ", ""));
		
		input.close();
	}
}
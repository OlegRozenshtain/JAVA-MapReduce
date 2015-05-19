package keyboard_input;

import java.util.Scanner;

/**
 * Input a month (1-12) and print how many days it contains (use if/else)
 */
public class Ex11a
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter a month number (1-12):");
		int month = input.nextInt();
		int numberDays = 0;
		
		
		if(month == 1)
		{
			numberDays = 31;
		}
		else if(month == 2)
		{
			numberDays = 28;
		}
		else if(month == 3)
		{
			numberDays = 31;
		}
		else if(month == 4)
		{
			numberDays = 30;
		}
		else if(month == 5)
		{
			numberDays = 31;
		}
		else if(month == 6)
		{
			numberDays = 30;
		}
		else if(month == 7)
		{
			numberDays = 31;
		}
		else if(month == 8)
		{
			numberDays = 31;
		}
		else if(month == 9)
		{
			numberDays = 30;
		}
		else if(month == 10)
		{
			numberDays = 31;
		}
		else if(month == 11)
		{
			numberDays = 30;
		}
		else if(month == 12)
		{
			numberDays = 31;
		}
		else
		{
			System.out.println("wrong input!");
			input.close();
			return ;
		}
		
		
		System.out.println("\nmonth " + month + " has " + numberDays + " days");

		input.close();
	}
}
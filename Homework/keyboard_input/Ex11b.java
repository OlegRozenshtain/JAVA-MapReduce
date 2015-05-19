package keyboard_input;

import java.util.Scanner;

/**how
 * Input a month (1-12) and print  many days it contains (use switch)
 */
public class Ex11b
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter a month number (1-12):");
		int numberMonth = input.nextInt();
		
		if ((numberMonth >= 1) && (numberMonth <= 12))
		{
			int numberDays = 0;
			// enum index values start at 0
			Month month = Month.values()[numberMonth - 1];
			
			switch(month)
			{
				case JANUARY:
				case MARCH:
				case MAY:
				case JULY:
				case AUGUST:
				case OCTOBER:
				case DECEMBER:
					numberDays = 31;
					break;
					
				case FEBRUARY:
					numberDays = 28;
					break;
				
				case APRIL:
				case JUNE:
				case SEPTEMBER:
				case NOVEMBER:
					numberDays = 30;
					break;
			}
			
			System.out.println("\n" + month.toString() + " has " + numberDays + 
							   " days");
		}
		else
		{
			System.out.println("wrong input!");
		}
					
		input.close();
	}
}
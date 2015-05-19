package built_in_classes;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * input a date from the user and print it in a format that contains the day of
 * week, day in month, month name and year (e.g Tuesday, 15 November, 2005)
 */
public class Ex6
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter a date as dd/mm/yyyy");
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = dateFormat.parse(input.nextLine());
			System.out.println("\ndate in new format:");
			SimpleDateFormat newDateFormat = new SimpleDateFormat("EEEE, dd MMMM, yyyy");
			System.out.println(newDateFormat.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		};
		
		input.close();
	}
}
package built_in_classes;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * input ten dates from the user into an array and sort them in ascending order
 */
public class Ex5
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date datesArray[] = new Date[10];
		
		System.out.println("please enter 10 dates as dd/mm/yyyy");
		try
		{
			for(int i = 0; i < datesArray.length; ++i) 
			{
				datesArray[i] = df.parse(input.nextLine());
			}
		} catch (ParseException exc)
		{
			System.out.println(exc);
		}
		
		Date swapTemp = new Date();
		// bubble sort dates in ascending order
	    for(int i = 0; i < datesArray.length - 1; ++i)
	    {
	    	for(int j = 0; j < datesArray.length - i - 1; ++j) 
	        {
	    		if(datesArray[j].after(datesArray[j+1]))
	    		{
	    			swapTemp = datesArray[j];
	    			datesArray[j] = datesArray[j+1];
	    			datesArray[j+1] = swapTemp;
	    		}
	        }
	    }
		
		System.out.println("\nthe sorted dates:");
		for (int i = 0; i < datesArray.length; ++i) 
		{
			System.out.println(df.format(datesArray[i]));
		}
		
		input.close();
	}
}
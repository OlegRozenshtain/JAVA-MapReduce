// Filename: TimeTable_05_06.java
// Program : a more enhanced version of the TimeTable app
// Version : 5.6

package lesson2.arrays_code_examples;

public class TimeTable_05_06
{
	private String eventName;
	private int times[];

	public TimeTable_05_06(String name, int timesArray[])
	{
		eventName = name;
		times = timesArray;
	}

	public void setEventName(String name)
	{
		eventName = name;
	}

	public String getEventName()
	{
		return eventName;
	}
	
	public void showMessage()
	{
		System.out.println( "Welcome to the 'Time Table' application!" );
	}

	public void showEventDetails()
	{
		System.out.printf( "The event name is: %s\n", getEventName() );
	}

	public void manageTimeTable()
	{
		showTimes();

		System.out.printf("\nEvent average is %.2f seconds\n", getAverage());

		System.out.printf("Best time is %d seconds.\nSlowest run is %d seconds.\n\n",	getFastest(), getSlowest());

		showBar();
	}

	public void showTimes()
	{
		System.out.println("The times are:\n");

		for (int pilot = 0; pilot < times.length; pilot++)
			System.out.printf("Pilot %2d: %3d sec.\n", pilot + 1,
					times[pilot]);
	}

	public double getAverage()
	{
		int total = 0;

		for (int time : times)
			total += time;

		return (double) total / times.length; // cast total to double then perform the division
	}
	
	public int getFastest()
	{
		int shortTime = times[0];

		for (int time : times) {
			if (time < shortTime)
				shortTime = time;
		}

		return shortTime;
	}

	public int getSlowest()
	{
		int longTime = times[0];

		for (int time : times) {
			if (time > longTime)
				longTime = time;
		}

		return longTime;
	}

	public void showBar()
	{
		System.out.println("Time distribution:");

		int frequency[] = new int[11]; // auto initializing all elements to default value of 0

		for (int time : times)
			++frequency[time / 10];

		for (int count = 0; count < frequency.length; count++) {
			if (count == 10)
				System.out.printf("%5d sec.: ", 100);
			else
				System.out.printf("%02d-%02d sec.: ", count * 10, count * 10 + 9);

			for (int stars = 0; stars < frequency[count]; stars++)
				System.out.print("*");

			System.out.println();
		}
	}
}

/****************************************************************
 * (C) Copyright by Moran Alkobi, http://moranalkobi.com        *
 ****************************************************************
 * Disclaimer: The author of the sourcecodes and presentations  *
 * has done his best to provide you with good explanations      *
 * and examples to allow you an educational and beneficial      *
 * walk through over the materials of the class.                *
 * With that said, the author makes no warranty of any kind,    *
 * expressed or implied, with regard to these programs or to    *
 * the documentation contained in his lectures and sourcecodes. *
 * The author shall not be held responsible in any way in event *
 * of any incidental or consequential damages arising out of    *
 * the use of these materials.                                  *
 ****************************************************************/

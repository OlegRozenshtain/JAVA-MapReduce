// Filename: TimeTable_05_08.java
// Program : presenting the final version of the TimeTable app
// Version : 5.8

package lesson2.arrays_code_examples;

public class TimeTable_05_08
{
	private String eventName;
	private int times[][];

	public TimeTable_05_08(String name, int timesArray[][])
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

		// System.out.printf("\nEvent average is %.2f seconds\n", getAverage());

		System.out.printf("Best time is %d seconds.\nSlowest run is %d seconds.\n\n",	getFastest(), getSlowest());

		showBar();
	}

	public void showTimes()
	{
		System.out.println( "The times are:\n" );
		System.out.print( "       " );

		for ( int run = 0; run < times[ 0 ].length; run++ ) 
			System.out.printf( "       Run %d  ", run + 1 );

		System.out.println( "  Average" );

		for ( int pilot = 0 ; pilot < times.length ; pilot++ ) 
		{
			System.out.printf( "Pilot %2d", pilot + 1 );

			for ( int time : times[ pilot ] )
				System.out.printf( "%8d sec.", time );

			double average = getAverage( times[ pilot ] );
			System.out.printf( "%9.2f sec.\n", average );
		}
		
		System.out.println();
	}

	public double getAverage( int timesArray[] )
	{
		int total = 0;

		for (int time : timesArray)
			total += time;

		return (double) total / timesArray.length; // cast total to double then perform the division
	}
	
	public int getFastest()
	{
		int shortTime = times[0][0];

		for (int runTimes[] : times)
		{
			for (int time : runTimes)
			{
				if (time < shortTime)
					shortTime = time;
			}
		}

		return shortTime;
	}

	public int getSlowest()
	{
		int longTime = times[0][0];

		for (int runTimes[] : times)
		{
			for (int time : runTimes)
			{
				if (time > longTime)
					longTime = time;
			}
		}

		return longTime;
	}

	public void showBar()
	{
		System.out.println("Time distribution:");

		int frequency[] = new int[11]; // auto initializing all elements to default value of 0

		for ( int runTimes[] : times )
		{
			for ( int time : runTimes )
			++frequency[ time / 10 ];
		}

		for ( int count = 0; count < frequency.length; count++ )
		{
			if ( count == 10 )
			System.out.printf( "%5d: ", 100 ); 
			else
			System.out.printf( "%02d-%02d: ", 
			count * 10, count * 10 + 9  ); 

			for ( int stars = 0; stars < frequency[ count ]; stars++ )
			System.out.print( "*" );

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

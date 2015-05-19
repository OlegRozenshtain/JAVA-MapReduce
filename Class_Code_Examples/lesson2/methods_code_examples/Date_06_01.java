// Filename: Date06_01.java
// Program : a simple Date representation
// Version : 6.1

package lesson2.methods_code_examples;

import java.util.Calendar;

public class Date_06_01
{
	private int day=Calendar.getInstance().get(Calendar.DAY_OF_MONTH); // 1 - 31
	private int month=Calendar.getInstance().get(Calendar.MONTH) + 1; // 1 - 12
	private int year=Calendar.getInstance().get(Calendar.YEAR); // 1 - 9999
	private String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };  

	public void setDate(int inDay, int inMonth, int inYear)
	{
		day = ((inDay >= 1 && inDay <= 31) ? inDay : Calendar.getInstance().get(Calendar.DAY_OF_MONTH) ); // validate day
		month = ((inMonth >= 1 && inMonth <= 12) ? inMonth : Calendar.getInstance().get(Calendar.MONTH) + 1 ); // validate month
		year = ((inYear >= 1 && inYear < 9999) ? inYear : Calendar.getInstance().get(Calendar.YEAR) ); // validate year
	}

	// *
	public String toEnString()
	{
		String stringMonth=null; // keep the literal value of the month

		for ( int i=0 ; i < months.length ; i++ )
			if ( month == i+1) // use the loop index in order to determine which month is "month" (array index starts at 0)
				stringMonth = months[i]; // assign the literal value found to the string variable

		return String.format("%s %02d, %04d", stringMonth, day, year);
	}

	public String toString()
	{
		return String.format("%02d/%02d/%04d", day, month, year);		
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
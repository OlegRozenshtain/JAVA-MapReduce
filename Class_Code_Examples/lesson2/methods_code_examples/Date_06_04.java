// Filename: Date_06_04.java
// Program : demonstrating overloaded constructors
// Version : 6.4

package lesson2.methods_code_examples;

import java.util.Calendar;

public class Date_06_04
{
	private int day=Calendar.getInstance().get(Calendar.DAY_OF_MONTH); // 1 - 31
	private int month=Calendar.getInstance().get(Calendar.MONTH) + 1; // 1 - 12
	private int year=Calendar.getInstance().get(Calendar.YEAR); // 1 - 9999
	private String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };  

	public Date_06_04()
	{
		this(Calendar.getInstance().get(Calendar.DAY_OF_MONTH),
			 Calendar.getInstance().get(Calendar.MONTH) + 1,
			 Calendar.getInstance().get(Calendar.YEAR));
	}

	public Date_06_04(int inDay)
	{
		this(inDay,
			 Calendar.getInstance().get(Calendar.MONTH) + 1,
			 Calendar.getInstance().get(Calendar.YEAR));
	}

	public Date_06_04(int inDay, int inMonth)
	{
		this(inDay, inMonth, Calendar.getInstance().get(Calendar.YEAR));
	}

	public Date_06_04(int inDay, int inMonth, int inYear)
	{
		setDate(inDay, inMonth, inYear);
	}

	public Date_06_04(Date_06_04 date)
	{
		this(date.getDay(), date.getMonth(), date.getYear());
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setDay( int inDay )
	{
		day = ((inDay >= 1 && inDay <= 31) ? inDay : Calendar.getInstance().get(Calendar.DAY_OF_MONTH) ); // validate day
	}
	
	public void setMonth( int inMonth )
	{
		month = ((inMonth >= 1 && inMonth <= 12) ? inMonth : Calendar.getInstance().get(Calendar.MONTH) + 1 ); // validate month
	}
	
	public void setYear( int inYear)
	{
		year = ((inYear >= 1 && inYear < 9999) ? inYear : Calendar.getInstance().get(Calendar.YEAR) ); // validate year
	}
	
	public void setDate(int inDay, int inMonth, int inYear)
	{
		setDay(inDay);
		setMonth(inMonth);
		setYear(inYear);
	}

	// BEWARE of unnecessary coding! 
	// new version : same output, less work, one line
	public String toEnString()
	{
		return String.format("%s %02d, %04d", months[getMonth()-1], getDay(), getYear());
	}
	
	// old version : same output, more work, more code
	/*
	public String toEnString()
	{
		String stringMonth=null;

		for ( int i=0 ; i < months.length ; i++ )
			if ( getMonth() == i+1)
				stringMonth = months[i];

		return String.format("%s %02d, %04d", stringMonth, getDay(), getYear());
	}
	*/

	public String toString()
	{
		return String.format("%02d/%02d/%04d", getDay(), getMonth(), getYear());		
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
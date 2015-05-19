// Filename: ThisTest.java
// Program : introducing the this keyword
// Version : 6.3

package lesson2.methods_code_examples;

public class ThisTest
{
	public static void main(String args[])
	{
		BasicDate date = new BasicDate(21, 1, 63);
		System.out.println(date.callToString());
	}
}

class BasicDate
{
	private int day;
	private int month;
	private int year;

	// "this" is required
	public BasicDate(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// "this" is not required
	public String callToString()
	{
		return String.format("this.toString(): %s\n     toString(): %s\n",
				this.toString(), // explicit use of "this"
				toString()); // implicit use of "this"
	}

	// "this" is not required
	public String toString()
	{
		return String.format("%02d/%02d/%02d", this.day, this.month, this.year);
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
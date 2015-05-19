// Filename: Date_06_04Test.java
// Program : test the Date class

package lesson2.methods_code_examples;

public class Date_06_04Test
{
	public static void main(String args[])
	{
		Date_06_04 date1 = new Date_06_04(); // no input - current date
		Date_06_04 date2 = new Date_06_04(5); // 05/ current month / current year
		Date_06_04 date3 = new Date_06_04(11, 3); // 11/03/ current year 
		Date_06_04 date4 = new Date_06_04(6, 3, 1987); // 06/03/1987
		Date_06_04 date5 = new Date_06_04(0, 0, 0); // invalid input - current date
		Date_06_04 date6 = new Date_06_04(date4); // 06/03/1987

		System.out.println("Constructed with:");
		System.out.println("date1: no input - current date was set");
		System.out.printf("   %s\n", date1.toEnString());
		System.out.printf("   %s\n", date1.toString());

		System.out.println("date2: day specified; month and year set as current");
		System.out.printf("   %s\n", date2.toEnString());
		System.out.printf("   %s\n", date2.toString());

		System.out.println("date3: day and month specified; year set as current");
		System.out.printf("   %s\n", date3.toEnString());
		System.out.printf("   %s\n", date3.toString());

		System.out.println("date4: day, month and year specified");
		System.out.printf("   %s\n", date4.toEnString());
		System.out.printf("   %s\n", date4.toString());

		System.out.println("date5: invalid input - current date was set");
		System.out.printf("   %s\n", date5.toEnString());
		System.out.printf("   %s\n", date5.toString());

		System.out.println("date6: Date object date4 specified");
		System.out.printf("   %s\n", date6.toEnString());
		System.out.printf("   %s\n", date6.toString());
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

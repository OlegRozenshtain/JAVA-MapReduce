// Filename: Date_06_01Test.java
// Program : test the Date class

package lesson2.methods_code_examples;

public class Date_06_01Test
{
	public static void main(String args[])
	{
		Date_06_01 date = new Date_06_01();

		System.out.print("The initial \"us-en\" date is: ");
		System.out.println(date.toEnString());
		System.out.print("The initial universal date is: ");
		System.out.println(date.toString());
		System.out.println();

		date.setDate(21, 1, 1963); // the date of the invention of the computer mouse
		System.out.print("\"us-en\" date after setDate is: ");
		System.out.println(date.toEnString());
		System.out.print("Standard date after setDate is: ");
		System.out.println(date.toString());
		System.out.println();

		date.setDate(32, 13, 0); // set date with invalid values
		System.out.println("After submitting invalid input:");
		System.out.print("\"us-en\" date: ");
		System.out.println(date.toEnString());
		System.out.print("Standard date: ");
		System.out.println(date.toString());
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

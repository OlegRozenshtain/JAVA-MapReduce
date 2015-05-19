// Filename: ForEachTest.java
// Program : introducing the enhanced for-loop in Java
// Version : 5.4

package lesson2.arrays_code_examples;

public class ForEachTest // java's version for the "for-each" loop
{
	public static void main( String args[] ) 
	{
		int total = 0;
		int array[] = { 1, 2, 3, 4, 5 };

		for ( int number : array ) // "number" type is set according to the type of the elements in the array
			total += number;

		System.out.printf( "The total of the numbers in the array is: %d\n", total );
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

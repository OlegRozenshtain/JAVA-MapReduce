// Filename: ArrayInitialization.java
// Program : demonstrating array initialization by an initialization list, then print array content by loop
// Version : 5.2

package lesson2.arrays_code_examples;

public class ArrayInitialization
{
	public static void main( String args[] )
	{
		int array[] = { 23, 4, 5, 11, 99 };

		System.out.printf( "Array's length is: %d\n", array.length );
		
		System.out.printf( "\n%s%10s\n", "Index", "Value" );

		for ( int counter = 0 ; counter < array.length ; counter++ )
			System.out.printf( "%5d%10d\n", counter, array[ counter ] );

		/*
		// array index out of bounds exception - top end
		for ( int counter = 0 ; counter <= array.length ; counter++ )
			System.out.printf( "%5d%10d\n", counter, array[ counter ] );

		// array index out of bounds exception - bottom end
		for ( int counter = -1 ; counter < array.length ; counter++ )
			System.out.printf( "%5d%10d\n", counter, array[ counter ] );
		*/
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

// Filename: ArraysIntro.java
// Program : introducing one dimensional arrays in Java
// Version : 5.1

package lesson2.arrays_code_examples;

public class ArraysIntro
{
	public static void main( String args[] )
	{
		int array[] = new int[ 5 ];

		/*
		// separate declaration & initialization
		int array[]; // declaration
		array = new int[ 5 ]; // initialization
		
		// all variables in line meant to hold references to arrays
		int[] array2, array3;
		
		// array of int, int, array of int - accordingly
		int array4[], number, array5[];
		*/  

		System.out.printf( "Array's length is: %d\n", array.length );
		
		System.out.printf( "\n%s%10s\n", "Index", "Value" );

		for ( int counter = 0 ; counter < array.length ; counter++ )
			System.out.printf( "%5d%10d\n", counter, array[ counter ] );
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

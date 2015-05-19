// Filename: ArraysIteration.java
// Program : demonstrating how to iterate through an array in a generic fashion
// Version : 5.7

package lesson2.arrays_code_examples;

public class ArraysIteration
{
	public static void main(String args[])
	{
		char charArray1[][] = { { 'r', 'a', 'y' }, { 'b', 'a', 'n' } };
		char charArray2[][] = { { 'r', 'a' }, { 'y' }, { 'b', 'a', 'n' } };

		System.out.println("\n=============================");
		System.out.println("Characters in 1st char array:");
		System.out.println("=============================");
		printArray( charArray1 );

		System.out.println("\n=============================");
		System.out.println("Characters in 2nd char array:");
		System.out.println("=============================");
		printArray( charArray2 );
	}

	public static void printArray( char charArray[][] )
	{
		for ( int row = 0 ; row < charArray.length ; row++ )
		{
			for ( int column = 0 ; column < charArray[row].length ; column++ )
				System.out.printf( "%c  ", charArray[row][column] );

			System.out.println();
		}
	}
}

/*
// declare and initialize with an initialization list
	int array [][] = { { 1 , 2 } , { 3 , 4 } };
	int array [][] = { { 5 , 6 } , { 7 , 8 , 9 } };

// declare and dynamically allocate memory 
	
	// declaration
	int array [][];
	
	// allocation : option 1 : squared array
	array = new int [2][2];
	
	// allocation : option 2 : rectangled array
	array = new int [2][3];
	
	// allocation : option 3 : jagged array
	array = new int [2][];
	array [0] = new int [2];
	array [1] = new int [3];
*/

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
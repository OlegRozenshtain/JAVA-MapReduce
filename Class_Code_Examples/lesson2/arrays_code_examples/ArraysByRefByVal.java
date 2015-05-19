// Filename: ArraysByRefByVal.java
// Program : demonstrating how in Java an array's reference is passed by val resulting as an array passed by ref
// Version : 5.5

package lesson2.arrays_code_examples;

public class ArraysByRefByVal
{
	public static void main( String args[] )
	{
		String array[] = { "Dad", "Mom", "Boy" };
			  
		System.out.println( "Original array:" );
		System.out.println( "=======================================" );
		for ( String value : array )
			System.out.printf( "	%s", value );
		System.out.println();
		System.out.println( "=======================================" );
		System.out.println();

		System.out.println( "Calling byReference method..." );
		byReference( array );
		System.out.println( "Array after calling byReference method:" );
		System.out.println( "=======================================" );
		for ( String value : array )
			System.out.printf( "	%s", value );
		System.out.println();
		System.out.println( "=======================================" );
		System.out.println();
		
		System.out.println( "Calling byValue method..." );
		byValue( array[ 2 ] );
		System.out.println( "Array after calling byValue method:" );
		System.out.println( "=======================================" );
		for ( String value : array )
			System.out.printf( "	%s", value );
		System.out.println();
		System.out.println( "=======================================" );
	}

	public static void byReference( String array2[] )
	{
		array2[ 2 ] = "Girl";
	}
	   
	public static void byValue( String element )
	{
		System.out.println( "Value of element received: " + element );
		element = "Boy";
		System.out.println( "Value of element after change: " + element );
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
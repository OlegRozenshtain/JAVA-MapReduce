// Filename: VariableArgumentsParameter.java"
// Program : demonstrating "variable arguments parameter" capability in Java
// Version : 5.9

package lesson2.arrays_code_examples;

public class VariableArgumentsParameter
{
	public static int total( int... numbers )
	{
		int total = 0;

		for ( int number : numbers )
			total += number;

		System.out.printf ( "Method received %d numbers\n", numbers.length );

		return total;
	}

	public static void main( String args[] ) 
	{
		int number1 = 1;
		int number2 = 2;
		int number3 = 3;
		int number4 = 4;

		System.out.printf( "Number1 = %d\nNumber2 = %d\nNumber3 = %d\nNumber4 = %d\n\n", number1, number2, number3, number4 );

		System.out.printf( "Total of %d and %d is %d\n\n", number1, number2, total( number1, number2 ) ); 
		System.out.printf( "Total of %d, %d and %d is %d\n\n", number1, number2, number3, total( number1, number2, number3 ) );
		System.out.printf( "Total of %d, %d, %d and %d is %d\n\n", number1, number2, number3, number4, total( number1, number2, number3, number4 ) );
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

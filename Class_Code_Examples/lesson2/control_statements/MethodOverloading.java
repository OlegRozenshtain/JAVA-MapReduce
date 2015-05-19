// Filename: MethodOverloading.java
// Program : demonstrating the concept of method overloading
// Version : 4.3

package lesson2.control_statements;

public class MethodOverloading 
{
	public void callOverloadedMethods()
	{
		System.out.printf( "Reverse of the string \"was\" is %s\n", reverse( "was" ) );
		System.out.printf( "Reverse of the integer \"123\" is %d\n", reverse( 123 ) );
	}
	   
	public String reverse( String word )
	{
		System.out.printf( "\nCalled \"reverse\" with the string argument %s.\n", word ); // palindromes -> semordnilap
		
		return new StringBuffer ( word ).reverse().toString();
	}

	public int reverse( int number )
	{
		int reversed = 0;
		
		System.out.printf( "\nCalled reverse with the integer argument %d.\n", number );
		
		while (number != 0)
		{
			reversed = reversed * 10 + number % 10;
			number /= 10;
		}
		
		return reversed;
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

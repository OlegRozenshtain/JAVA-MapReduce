// Filename: CommandLineArguments.java
// Program : using command line arguments
// Version : 5.10

package lesson2.arrays_code_examples;

public class CommandLineArguments
{
   public static void main( String[] args )
   {
		if ( args.length != 3 )
			System.out.println( "Error:\nPlease enter your first name as the 1st parameter,\n" +
								"your last name as the 2nd parameter and your age as the 3rd parameter" );
		else
		{
			String firstName = args[0];
			String lastName = args[1];
			int age = Integer.parseInt( args[2] );
			
			System.out.printf( "Hello %s %s, you'll be %d in 24 years!", firstName, lastName, age+24 );
		} 
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
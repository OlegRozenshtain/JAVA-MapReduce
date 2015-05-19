// Filename: UsingExceptions_10_03.java
// Program : demonstrate exceptions flow
// Version : 10.3

package lesson5.code_examples.ex10_03;

public class UsingExceptions_10_03
{
	public static void main(String args[])
	{
		try 
		{
			throwException();
		}
		
		catch (Exception exception)
		{
			System.err.println("Exception handled in \"main\"");
		}

		doesNotThrowException();
	}

	public static void throwException() throws Exception
	{
		try
		{
			System.out.println("In method \"throwException\"");
			throw new Exception();
		}
	
		catch (Exception exception)
		{
			System.err.println("Exception handled in method \"throwException\"");
			throw exception; // rethrow
			
			// Code here will not execute
		}
		
		finally
		{
			System.err.println("Finally executed in \"throwException\"");
		}
		
		// Code here will not execute
	}

	public static void doesNotThrowException() 
	{
		try
		{
			System.out.println("In method \"doesNotThrowException\"");
		}
	
		catch (Exception exception)
		{
			System.err.println(exception);
		}
		
		finally
		{
			System.err.println("Finally executed in \"doesNotThrowException\"");
		}

		System.out.println("End of method \"doesNotThrowException\"");
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

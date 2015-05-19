// Filename: UsingExceptions_10_04.java
// Program : demonstrate exceptions flow
// Version : 10.4

package lesson5.code_examples.ex10_04;

public class UsingExceptions_10_04
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
	}

	public static void throwException() throws Exception 
	{
		try
		{
			System.out.println("In method \"throwException\"");
			throw new Exception();
		}

		catch (RuntimeException runtimeException)
		{
			System.err.println("Exception handled in method \"throwException\"");
		}

		finally
		{
			System.err.println("Finally is always executed");
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

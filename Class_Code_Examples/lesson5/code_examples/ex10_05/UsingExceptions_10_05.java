// Filename: UsingExceptions_10_05.java
// demonstrate exceptions flow
// Version : 10.5

package lesson5.code_examples.ex10_05;

public class UsingExceptions_10_05
{
	public static void main(String args[])
	{
		// demonstrate stack unwinding
		try
		{
			System.out.println("In method \"main\" (Level 1)");
			throwErrorLevel2();
		}
		
		catch (OutOfMemoryError error)
		{
			System.err.println("Error handled in \"main\" (Level 1)");
		}
		
		finally
		{
			System.out.println("Finally is always executed (Level 1)");
		}
	}

	public static void throwErrorLevel2()
	{
		try
		{
			System.out.println("In method \"throwErrorLevel2\"");
			throwErrorLevel3();
		}

		catch (StackOverflowError error)
		{
			System.err.println("Error handled in method \"throwErrorLevel2\"");
		}
		
		finally
		{
			System.out.println("Finally is always executed (Level 2)");
		}
	}
	
	public static void throwErrorLevel3()
	{
		try
		{
			System.out.println("In method \"throwErrorLevel3\"");
			throw new OutOfMemoryError();
		}

		catch (StackOverflowError error)
		{
			System.err.println("Error handled in method \"throwErrorLevel3\"");
		}

		finally
		{
			System.out.println("Finally is always executed (Level 3)");
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

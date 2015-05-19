// Filename: UsingChainedExceptions.java
// Program : demonstrate exceptions chaining and stackTrace
// Version : 10.7

package lesson5.code_examples.ex10_08;

public class UsingChainedExceptions
{
	// main: call level1
	public static void main(String args[])
	{
		try
		{
			level1();
		}
		
		catch (Exception exception) // catch the exceptions thrown at level1 and print a stack trace
		{
			exception.printStackTrace();
		}
	}

	// level1: call level2 and throw exceptions up to main
	public static void level1() throws Exception 
	{
		try 
		{
			level2();
		}
		
		catch (Exception exception) // catch the exceptions thrown at level2
		{
			throw new Exception("Exception thrown in level1", exception);
		}
	}

	// level2: call level3 and throw exceptions up to level1
	public static void level2() throws Exception 
	{
		try 
		{
			level3();
		}
		
		catch (Exception exception) // catch the exception thrown at level3
		{
			throw new Exception("Exception thrown in level2", exception);
		}
	}

	// level3: throw exception up to level2 - no catch block
	public static void level3() throws Exception 
	{
		throw new Exception("Exception thrown in level3");
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

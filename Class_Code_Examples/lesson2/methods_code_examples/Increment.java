// Filename: Increment.java
// Program : demonstrating incrementation
// Version : 6.9

package lesson2.methods_code_examples;

public class Increment
{
	private int total = 0;
	private final int INCREMENT;

	public Increment(int value)
	{
		INCREMENT = value;
	}

	public void incrementTotal()
	{
		total += INCREMENT;
	}
	
	public int getIncrement()
	{
		return INCREMENT;
	}

	public String toString()
	{
		return String.format("Total = %-2d", total);
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
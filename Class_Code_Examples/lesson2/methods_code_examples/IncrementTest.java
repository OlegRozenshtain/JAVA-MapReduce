// Filename: IncrementTest.java
// Program : test the Increment class

package lesson2.methods_code_examples;

public class IncrementTest
{
	public static void main(String args[])
	{
		Increment plusOne = new Increment(1);
		Increment plusTwo = new Increment(2);
		Increment plusThree = new Increment(3);
		

		System.out.printf("Before incrementing: %s, INCREMENT = %d\n", plusOne, plusOne.getIncrement());
		System.out.printf("Before incrementing: %s, INCREMENT = %d\n", plusTwo, plusTwo.getIncrement());
		System.out.printf("Before incrementing: %s, INCREMENT = %d\n\n", plusThree, plusThree.getIncrement());

		for ( int i = 1 ; i <= 5 ; i++ )
		{
			plusOne.incrementTotal();
			plusTwo.incrementTotal();
			plusThree.incrementTotal();
		}
		
		System.out.printf("After incrementing: %s, INCREMENT = %d\n", plusOne, plusOne.getIncrement());
		System.out.printf("After incrementing: %s, INCREMENT = %d\n", plusTwo, plusTwo.getIncrement());
		System.out.printf("After incrementing: %s, INCREMENT = %d\n", plusThree, plusThree.getIncrement());
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
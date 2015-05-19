// Filename: UnHandledArithmeticException.java
// Program : show how unhandled exceptions behave in a Java application
// Version : 10.1

package lesson5.code_examples.ex10_01;

import java.util.Scanner;

public class UnHandledArithmeticException
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter an integer dividend: ");
		int dividend = scanner.nextInt();

		System.out.print("Please enter an integer divisor: ");
		int divisor = scanner.nextInt();

		int result = ratio(dividend, divisor);
		System.out.printf("\nThe division result is: %d / %d = %d\n", dividend,
				divisor, result);
	}

	public static int ratio(int dividend, int divisor)
	{
		System.out.println("\nThe ratio is " + dividend + ":" + divisor);

		return dividend / divisor; // possible ArithmeticException (division by zero)
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
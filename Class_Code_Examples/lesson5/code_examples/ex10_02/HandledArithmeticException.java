// Filename: HandledArithmeticException.java
// Program : show how handling exceptions can keep a program running
// Version : 10.2

package lesson5.code_examples.ex10_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandledArithmeticException
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;

		do
		{
			try
			{
				System.out.print("Please enter an integer dividend: ");
				int dividend = scanner.nextInt();

				System.out.print("Please enter an integer divisor: ");
				int divisor = scanner.nextInt();

				int result = ratio(dividend, divisor);
				System.out.printf("\nThe division result is: %d / %d = %d\n",
						dividend, divisor, result);
				continueLoop = false;
			}

			catch (InputMismatchException inputMismatchException)
			{
				System.err.printf("\nException: %s\n", inputMismatchException);
				scanner.nextLine(); // discard the entered input
				System.out.println("Only integers allowed. Try again.\n");
			}

			catch (ArithmeticException arithmeticException)
			{
				System.err.printf("\nException: %s\n", arithmeticException);
				System.out.println("Invalid devisor - zero not alowed. Try again.\n");
			}
		}

		while (continueLoop);
	}

	public static int ratio(int dividend, int divisor) throws ArithmeticException
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


// Filename: StaticImport.java
// Program : demonstrating static import capabilities
// Version : 6.8

package lesson2.methods_code_examples;

import static java.lang.Math.*; // on-demand import

public class StaticImport
{
	public static void main(String args[])
	{
		// thanks to "import java.lang.Math.*;"
		System.out.printf("cos( 0.0 ) = %.1f\n", Math.cos(0.0));
		 // thanks to "import static java.lang.Math.*;"
		System.out.printf("abs( -500 ) = %d\n", abs(-500));
		System.out.printf("max( 14 , max ( 7 , 15 ) ) = %d\n", max(14,max(7,15)));
		// no import needed
		System.out.printf("pow( 2.0 , 3.0 ) = %.0f\n", java.lang.Math.pow(2.0,3.0));
		
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
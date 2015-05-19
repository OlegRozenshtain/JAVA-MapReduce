// Filename: AcronymTest.java
// Program : using the Acronym enum type
// Version : 6.6

package lesson2.methods_code_examples;

import java.util.EnumSet;

public class AcronymTest
{
	public static void main(String args[])
	{
		System.out.println("All acronyms:\n");

		for (Acronym acronym : Acronym.values())
			System.out.printf("%-8s%-32s%s\n", acronym, acronym.getMeaning(), acronym.getAppearanceYear());

		System.out.println("\nAcronyms in the specified range:\n");

		for (Acronym acronym : EnumSet.range(Acronym.ROFL, Acronym.BRB))
			System.out.printf("%-8s%-32s%s\n", acronym, acronym.getMeaning(), acronym.getAppearanceYear());
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

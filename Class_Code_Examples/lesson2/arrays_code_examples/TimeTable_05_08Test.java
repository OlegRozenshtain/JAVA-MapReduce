// Filename: TimeTable_05_08Test.java
// Program : test the TimeTable class

package lesson2.arrays_code_examples;

public class TimeTable_05_08Test
{
	public static void main( String args[] )
	{
		int times[][] = { { 52, 53, 49 },
						  { 67, 53, 55 },
						  { 55, 65, 70 },
						  { 90, 81, 77 },
						  { 46, 42, 43 },
						  { 77, 70, 69 },
						  { 53, 59, 62 }, 
						  { 45, 47, 46 },
						  { 64, 60, 61 },
						  { 70, 64, 67 } };
		
		TimeTable_05_08 myTimeTable = new TimeTable_05_08( "WWL - World Wingsuit League - GrandPrix", times );

		myTimeTable.showMessage();
		System.out.println();

		myTimeTable.showEventDetails();
		System.out.println();

		myTimeTable.manageTimeTable();
		System.out.println();
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

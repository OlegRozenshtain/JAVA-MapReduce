// Filename: TimeTable_05_06Test.java
// Program : test the TimeTable class

package lesson2.arrays_code_examples;

public class TimeTable_05_06Test
{
	public static void main( String args[] )
	{
		int times[] = { 52, 67, 55, 90, 46, 77, 53, 45, 64, 70 };

		TimeTable_05_06 myTimeTable = new TimeTable_05_06( "WWL - World Wingsuit League - GrandPrix", times );

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

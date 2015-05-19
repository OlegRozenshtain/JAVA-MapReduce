// Filename: StudentTest.java
// Program : test the Student class

package lesson2.methods_code_examples;

public class StudentTest
{
	public static void main(String args[])
	{
		Date_06_05 birthDate = new Date_06_05(1, 1, 1988);
		Date_06_05 applicationDate = new Date_06_05(30, 8, 2013);
		Student student = new Student("Sharon", "Levy", birthDate, applicationDate);

		System.out.println(student);
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
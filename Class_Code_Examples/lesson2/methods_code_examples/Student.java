// Filename: Student.java
// Program : a simple representation of a student demonstrating composition
// Version : 6.5

package lesson2.methods_code_examples;

public class Student
{
	private String firstName;
	private String lastName;
	private Date_06_05 birthDate;
	private Date_06_05 applicationDate;

	public Student(String first, String last, Date_06_05 dateOfBirth, Date_06_05 dateOfApplication)
	{
		firstName = first;
		lastName = last;
		birthDate = dateOfBirth;
		applicationDate = dateOfApplication;
	}

	public String toString()
	{
		return String.format("%s, %s  Applied: %s  Birthday: %s", lastName, firstName, applicationDate, birthDate);
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
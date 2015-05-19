// Filename: Scope.java
// Program : showing how the current scope changes the visibility of variables by shadowing
// Version : 4.2

package lesson2.control_statements;

public class Scope
{
	private String name = "Moran";

	public void go()
	{
		String name = "Moshe"; // shadowing
		System.out.printf("\nVariable \"name\" value in method go() after hiding is \"%s\"\n", name);

		testLocalVariable();
		System.out.printf("\nVariable \"name\" value in method go() is \"%s\"\n", name);

		testInstanceVariable();
		System.out.printf("\nVariable \"name\" value in method go() is \"%s\"\n", name);
	}

	public void testLocalVariable()
	{
		String name = "Shay"; // shadowing

		System.out.printf("\nLocal variable \"name\" value on entering method testLocalVariable() is \"%s\"\n", name);

		name="Danit";

		System.out.printf("Local variable \"name\" value before exiting method testLocalVariable() is \"%s\"\n", name);
	}

	public void testInstanceVariable()
	{
		System.out.printf("\nInstance variable \"name\" value on entering method testInstanceVariable() is \"%s\"\n", name);
		
		name = "Shira";
		
		System.out.printf("Instance variable \"name\" value before exiting method testInstanceVariable() is \"%s\"\n", name);
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
package lesson1;
// Filename: LogicalOps.java
// Program : demonstrating the operators &&, &, ||, |, ^, !
// Version : 3.8

public class LogicalOps
{
	public static void main( String args[] )
	{
//************************************************************************
//							Conditional AND (&&)						//
//************************************************************************
	System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
		"Conditional AND (&&)",
		"false && false", ( false && false ),
		"false && true", ( false && true ), 
		"true && false", ( true && false ),
		"true && true", ( true && true ) );
		
//************************************************************************
//						Boolean Logical AND (&)							//
//************************************************************************
	System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
		"Boolean Logical AND (&)",
		"false & false", ( false & false ),
		"false & true", ( false & true ),
		"true & false", ( true & false ),
		"true & true", ( true & true ) );

//************************************************************************
//							Conditional OR (||)							//
//************************************************************************
	System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
		"Conditional OR (||)",
		"false || false", ( false || false ),
		"false || true", ( false || true ),
		"true || false", ( true || false ),
		"true || true", ( true || true ) );

//************************************************************************
//					Boolean Logical Inclusive OR (|)					//
//************************************************************************
	System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
		"Boolean Logical Inclusive OR (|)",
		"false | false", ( false | false ),
		"false | true", ( false | true ),
		"true | false", ( true | false ),
		"true | true", ( true | true ) );

//************************************************************************
//					Boolean Logical Exclusive OR (^)					//
//************************************************************************
	System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
		"Boolean Logical Exclusive OR (^)", 
		"false ^ false", ( false ^ false ),
		"false ^ true", ( false ^ true ),
		"true ^ false", ( true ^ false ),
		"true ^ true", ( true ^ true ) );

//************************************************************************
//							Logical Negation (!)						//
//************************************************************************
	System.out.printf( "%s\n%s: %b\n%s: %b\n",
		"Logical NOT (!)",
		"!false", ( !false ),
		"!true", ( !true ) );
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

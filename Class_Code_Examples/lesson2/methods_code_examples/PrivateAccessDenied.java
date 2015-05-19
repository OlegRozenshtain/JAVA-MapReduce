// Filename: PrivateAccessDenied.java
// Program : demonstrating how a private member of a class cannot get accessed directly from outside the class
// Version : 6.2

package lesson2.methods_code_examples;

public class PrivateAccessDenied
{
   public static void main( String args[] )
   {
      Date_06_01 date = new Date_06_01();

//      date.day = 21;
//      date.month = 1;
//      date.year = 63;
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
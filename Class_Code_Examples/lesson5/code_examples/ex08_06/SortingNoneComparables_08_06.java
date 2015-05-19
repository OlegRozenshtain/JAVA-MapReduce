// Filename: "SortingNoneComparables_08_06.java"
// Program : Introduction to Algorithms: sorting none Comparables using a comparator object

package lesson5.code_examples.ex08_06;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SortingNoneComparables_08_06 
{
   private static final String students[] = 
      { "Larry", "Moe", "Curly", "Shira", "Don", "Rinat", "Bar", "Bonnie", "Eric" };

   // create a list backed by the array and print out the list before and after sorting it
   public void processList()
   {
      List< String > arrayAsList = Arrays.asList( students ); // create List
      
      // print the list before sorting it
      // NOTICE: here we take advantage of the overridden toString() method of the String class
      // which gives a string representation of a List in the form of [ , , ... ]
      System.out.println( "List before Sort:" );
      System.out.println( arrayAsList );
      System.out.println();

      // NOTICE: in this version of the sort algorithm, the method receives a List argument
      // and a Comparator object.
      // sort out the list in a descending order using a pre-defined comparator object to sort
      // the list in a reverse order
      Collections.sort( arrayAsList, Collections.reverseOrder() ); 

      // print the list after sorting it
      System.out.println( "List after Sort:" );
      System.out.println( arrayAsList );
      System.out.println();
   }

   public static void main( String args[] )
   {
      SortingNoneComparables_08_06 sort = new SortingNoneComparables_08_06();
      sort.processList();
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
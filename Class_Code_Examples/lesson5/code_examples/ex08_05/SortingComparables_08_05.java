// Filename: "SortingComparables_08_05.java"
// Program : Introduction to Algorithms: sorting Comparables

package lesson5.code_examples.ex08_05;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SortingComparables_08_05 
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

      // sort out the list
      // NOTICE: in this version of the sort algorithm, the method receives a List argument
      // the list argument must be of a type that implements the Comparable interface
      // so it has to either be a type we created of a class that implements Comparable
      // or a type that already implements that interface like: String, Integer, Double, Byte, Short, Long,...
      Collections.sort( arrayAsList );

      // print the list after sorting it
      System.out.println( "List after Sort:" );
      System.out.println( arrayAsList );
      System.out.println();
   }

   public static void main( String args[] )
   {
      SortingComparables_08_05 sort = new SortingComparables_08_05();
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

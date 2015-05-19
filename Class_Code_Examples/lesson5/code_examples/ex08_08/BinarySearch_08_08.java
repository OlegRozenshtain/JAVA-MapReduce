// Filename: "BinarySearch_08_08.java"
// Program : Introduction to Algorithms: Binary Search

package lesson5.code_examples.ex08_08;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class BinarySearch_08_08 
{
    // not sorted
   private static final String[] studentsArray = { "Larry", "Moe", "Curly", "Shira", "Don" };
   
   private List< String > studentsList;

   public BinarySearch_08_08()
   {
      studentsList = new ArrayList< String >( Arrays.asList( studentsArray ) ); 
      System.out.println( "Unsorted students list:" );
      System.out.println( studentsList );
      System.out.println();
      
      // in order to use the binarySearch method the array or list has to be sorted.
      Collections.sort( studentsList ); // Reminder: Strings are comparable objects so can be sorted using sort( List l)
      System.out.println( "Sorted students list:" );
      System.out.println( studentsList );
      System.out.println();
      
      System.out.println("********************************");
      System.out.println();
   } 

   private void search( String student )
   {
      int result = 0;

      System.out.println( "Searching for: " + student );
      
      // the binarySearch static method takes two parameters: a sorted List 
      // and an element to search for in that list
      // the return value will either be a positive number indicating the index 
      // in which the element was found or a negative number if the item was not found
      result = Collections.binarySearch( studentsList, student );
      
      if ( result>=0 )
      {
         System.out.println( "Result: Found at index " + result );
         System.out.println();
      }
      else
      {
         System.out.println( "Result: Not Found" );
         System.out.println();
      }
   }

   public static void main( String args[] )
   {
      BinarySearch_08_08 binary = new BinarySearch_08_08();
      
      binary.search( studentsArray[ 3 ] );
      binary.search( studentsArray[ 0 ] );
      binary.search( "sharon" );
      binary.search( "bill" );
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

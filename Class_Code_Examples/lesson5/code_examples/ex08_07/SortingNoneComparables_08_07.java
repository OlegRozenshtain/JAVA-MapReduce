// Filename: "SortingNoneComparables_08_07.java"
// Program : Introduction to Algorithms: sorting none Comparables using a CUSTOMIZED comparator object

package lesson5.code_examples.ex08_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SortingNoneComparables_08_07
{
   // create a list backed by the array and print out the list before and after sorting it
   public void processList()
   {
      List< Student_08_07 > students = new ArrayList < Student_08_07>(); // create List
      
      students.add( new Student_08_07( "Larry", 17, 77));
      students.add( new Student_08_07( "Moe", 30, 99));
      students.add( new Student_08_07( "Curly", 20, 67));
      students.add( new Student_08_07( "Shira", 22, 86));
      students.add( new Student_08_07( "Don", 27, 43));
      students.add( new Student_08_07( "Rinat", 54, 33));
      students.add( new Student_08_07( "Bar", 34, 89));
      students.add( new Student_08_07( "Bonnie", 23, 65));
      students.add( new Student_08_07( "Eric", 44, 77));
      
      // print the list before sorting it
      // NOTICE: here we take advantage of the overridden toString() method of the String class
      // which gives a string representation of a List in the form of [ , , ... ]
      System.out.println( "List before Sort:" );
      System.out.println( students );
      System.out.println();

      // NOTICE: in this version of the sort algorithm, the method receives a List argument
      // and a Comparator object.
      // the comparator object holds the logic according to which the Student objects
      // will get sorted by.
      Collections.sort( students, new StudentComparator_08_07() ); 

      // print the list after sorting it
      System.out.println( "List after Sort:" );
      System.out.println( students );
      System.out.println();
   }

   public static void main( String args[] )
   {
      SortingNoneComparables_08_07 sort = new SortingNoneComparables_08_07();
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
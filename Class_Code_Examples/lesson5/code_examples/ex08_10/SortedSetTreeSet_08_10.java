// Filename: "SortedSetTreeSet_08_10.java"
// Program : Advanced Structures: TreeSet and SortedSet

package lesson5.code_examples.ex08_10;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTreeSet_08_10 
{
   private static final String[] studentsArray = 
		{ "Larry", "Moe", "Curly", "Shira", "Don", "Curly",
                  "Shira", "Don", "Curly", "Shira", "Don" };
   
   // create a sorted set with TreeSet, then manipulate it
   public SortedSetTreeSet_08_10()
   {
      // NOTICE: in this example we will use TreeSet, which is an implementation of SortedSet,
      // there are more implementation of SortedSet. 
      // create a TreeSet based on the students array - the next line of code 
      // will take a String array, remove it's duplicates and sort the remaining items
      SortedSet< String > studentsTree = 
         new TreeSet< String >( Arrays.asList( studentsArray ) );

      // print the sorted students tree
      System.out.println( "Students TreeSet (sorted): " + studentsTree );
      System.out.println();

      // get the head of the set
      // (all students from the beginning of the set to the student specified, not included)
      System.out.println( "Students before Larry: " + studentsTree.headSet( "Larry" ) );
      System.out.println();
      
      // get the tail of the set
      // (all students from the student specified to the end of the set)
      System.out.println( "Students from Larry: " + studentsTree.tailSet( "Larry" ) );
      System.out.println();

      // get the first and the last elements of a TreeSet
      System.out.println( "first student: " + studentsTree.first() );
      System.out.println( "last student: " + studentsTree.last() );
   }

   public static void main( String args[] )
   {
      new SortedSetTreeSet_08_10();
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

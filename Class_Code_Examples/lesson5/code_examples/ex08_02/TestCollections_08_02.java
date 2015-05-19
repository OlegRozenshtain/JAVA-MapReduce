// Filename: "TestCollections_08_02.java"
// Program : Basic Collections and Iterator capabilities

package lesson5.code_examples.ex08_02;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class TestCollections_08_02 
{  
   // create String arrays to perform as the base of the ArrayLists
   private static final String[] students = { "Ron", "Bert", "Sivan", "Dimitry", "Brian" };
   private static final String[] removeStudents = { "Ron", "Sivan", "Brian" };

   // create ArrayList, add students to it and manipulate it
   public TestCollections_08_02()
   {
      // create ArrayLists of String objects
      // the ArrayLists size is not specified, thus they'll get resized automatically on demand
      List< String > studentsList = new ArrayList< String >(); 
      // notice the diamond brackets.
      // since Java 7, there is something that is called "automatic type inference"
      // see more here: http://docs.oracle.com/javase/7/docs/technotes/guides/language/type-inference-generic-instance-creation.html
      List< String > failedStudents = new ArrayList<  >();

      // add elements in students array to studentsList (OPTION A)
      for ( String student : students )
         studentsList.add( student );       
      
      // add elements in removeStudents to failedStudents (OPTION B)
      failedStudents.addAll(Arrays.asList(removeStudents)); 

      System.out.println( "Students List:" );
      // printing of a list using a for-loop and a counter (OPTION 1)
      // print studentsList contents
      for ( int count = 0; count < studentsList.size(); count++ )
      {
         System.out.printf( "%s ", studentsList.get( count ) );
      }      
      System.out.println("\n");
      
      System.out.println( "Failed Students:" );  
      // printing of a list using an enhanced for-loop (OPTION 2)
      // print failedStudents contents
      for ( String student : failedStudents )
      {
         System.out.printf( "%s ", student );
      }
      System.out.println("\n");

      // remove failed students from the students list
      removeFailedStudents( studentsList, failedStudents );

      System.out.println( "studentsList after removeFailedStudents: " );

      // printing of a list using an Iterator construct (OPTION 3)
      Iterator< String > iterator = studentsList.iterator();
      // print studentsList contents
      while ( iterator.hasNext() )
      {
         System.out.printf( "%s ", iterator.next() ); // first next() gets the first item
      }
      System.out.println("\n");
   } 

   // remove items found in collection2 from collection1
   // this is a generic method implementation that will remove elements not only from lists
   // but from all kinds of structs that implement the collection interface.
   // since all collection types has an iterator, we can apply the following code:
   private void removeFailedStudents( 
      Collection< String > collection1, Collection< String > collection2 )
   {
      // get iterator for collection1
      Iterator< String > iterator = collection1.iterator(); 

      // loop while collection has items
      while ( iterator.hasNext() ) 
      {
         if ( collection2.contains( iterator.next() ) ) // contains(arg) checks whether or not struct1.arg is in struct2
         {
            iterator.remove(); // according to program logic, if struct1.arg is in struct2, remove it from struct1
         }
      }
   } 
   
   public static void main( String args[] )
   {
      new TestCollections_08_02();
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

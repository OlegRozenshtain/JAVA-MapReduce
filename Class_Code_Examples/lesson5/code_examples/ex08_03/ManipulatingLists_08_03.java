// Filename: "ManipulatingLists_08_03.java"
// Program : Some more(Linked)Lists manipulation

package lesson5.code_examples.ex08_03;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class ManipulatingLists_08_03
{
   private static final String failedStudents[] = { "Ron", "Sivan", "Brian" };
   private static final String[] recentlyFailedStudents = { "Dan", "Carry", "David", "Ben", "Rose" };
                  
   // LinkedLists creation and manipulation via constructor
   public ManipulatingLists_08_03()
   {
      List< String > failedStudentsList = new LinkedList< String >(); 
      List< String > recentlyFailedStudentsList = new LinkedList< String >();
      
      // add array elements to the LinkedLists (create list from an array,
      // then concatenate the arrayAsList to the empty linkedList)
      failedStudentsList.addAll(Arrays.asList(failedStudents));
      recentlyFailedStudentsList.addAll(Arrays.asList(recentlyFailedStudents));

      // concatenate the linkedLists
      // NOTICE: addAll(argumentList) trims the argument list in such a way
      // that it MOVES its elements to the concatenated list.
      failedStudentsList.addAll( recentlyFailedStudentsList );
      
      // since we used add-ALL, the argumentList left empty, so a resource release 
      // will be a good programming practice.
      // we did not do that in previous uses of addAll() since in previous cases
      // we weren't the ones to allocate the memory for the list in the first place
      // we used asList() and the JVM did the allocation, and that's why the JVM
      // knows to do the garbage collection in those cases.
      recentlyFailedStudentsList = null;
      
      printList( failedStudentsList ); // print concatenated failedStudentsList elements
      System.out.println();

      convertStringsToUppercase( failedStudentsList ); // convert list's string elements to upper-case
      printList( failedStudentsList ); // print upper-cased failedStudentsList elements
      System.out.println();

      removeItems( failedStudentsList, 2, 5 ); // remove items 2, 3, 4 from the list
      
      printList( failedStudentsList ); // print failedStudentsList elements
      System.out.println();
      
      printReversedList( failedStudentsList ); // print failedStudentsList elements in reverse order
      System.out.println();
   } 

   // output List contents
   public void printList( List< String > list )
   {
      System.out.println( "List: " );
   
      for ( String student : list )
      {
         System.out.printf( "%s ", student );
      }
      System.out.println();
   }                                                    

   // convert lower-case String elements to upper-case String elements
   private void convertStringsToUppercase( List< String > list )
   {
       // obtain a ListIterator for a given list.
       // a List Iterator is an iterator that works specifically with Lists
       // and add more functionality to the concept of iterating through a List structure
      ListIterator< String > iterator = list.listIterator();

      while ( iterator.hasNext() ) 
      {
         String student = iterator.next();  // get item
         // an example for the added functionality is the method set()
         // with this method you can touch every element and set it with a new
         // value according to it's original type
         iterator.set( student.toUpperCase() ); // convert to upper-case
      }
   }

   // get a view of a sub list of the original list
   // and delete the view items from the original list
   private void removeItems( List< String > list, int start, int end )
   {
      System.out.println( "Removing elements " + start + " to " + end + "!" );
      // subList() creates a VIEW of the list the method was invoked upon
      // it does not create a real list in memory, but only gives a sneak peek
      // to a portion of the original list. The method clear() then removes
      // that sub list from the list, by trimming it starting at index "start"
      // up to index "end-1".
      list.subList( start, end ).clear();  // remove items
   }

   // print list in a reverse order
   private void printReversedList( List< String > list )
   {
       // obtain a ListIterator for the list.
       // NOTICE: this time we give the ListIterator the list.Size() as an argument upon creation
       // this is to get the iterator point right after the last element of the list
       // so that the first previous() call will point at the last element
      ListIterator< String > iterator = list.listIterator( list.size() );

      System.out.println( "Reversed List:" );
      // print list in reverse order
      while ( iterator.hasPrevious() ) 
      {
         System.out.printf( "%s ", iterator.previous() ); 
      }
      System.out.println();
   }
   
   public static void main( String args[] )
   {
      new ManipulatingLists_08_03();
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
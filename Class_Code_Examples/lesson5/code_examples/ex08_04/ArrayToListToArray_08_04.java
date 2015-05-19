// Filename: "ArrayToListToArray_08_04.java"
// Program : Demonstrating views in Java: List-As-Array, Array-As-List

package lesson5.code_examples.ex08_04;

import java.util.LinkedList;
import java.util.Arrays;

public class ArrayToListToArray_08_04 
{
   // constructor creates LinkedList, adds elements and converts to array
   public ArrayToListToArray_08_04()
   {
       // a String array to back the list
      String[] students = { "Sasha", "Yonit", "Guy" };
      
      // print to demonstrate initial array values
      printArray( students );
      System.out.println();

      // NOTICE: there are 2 versions for the constructor of the LinkedList class,
      // one that receives no arguments and creates n empty list (the one we used in previous examples)
      // and the second one, receives a "Collection" object, meaning, you can send
      // it any type of Collection object and a LinkedList is-A List is-A Collection.
      // obtaining a list view of the array as an argument for the constructor
      LinkedList< String > linkedList = new LinkedList< String >( Arrays.asList( students ) );
      
      // print to demonstrate initial list values
      printList( linkedList );
      System.out.println();
 
      linkedList.addFirst( "Dolev" ); // add as 1st item 
      linkedList.addLast( "Zed" );    // add to the end of the list (no return value)
      linkedList.add( "Tom" );        // add to the end of the list (returns true if succeeded, false otherwise)
      linkedList.add( 2, "Jerry" );   // add at index 2 (as 3rd item)
     
      // print to demonstrate updated list values
      printList( linkedList );
      System.out.println();
      
      // get LinkedList elements as an array
      // this is to reverse what we did before: obtaining an array view of the
      // linkedList object using toArray() and using it as the base during the 
      // creation of a new String array (in the size of the list), then reassigning
      // the students variable with the returned array reference
      students = linkedList.toArray( new String[ linkedList.size() ] );

      // print to demonstrate updated array values
      printArray( students );
      System.out.println();
   }
   
   // output List contents
   public void printList( LinkedList< String > list )
   {
      System.out.println( "List: " );
   
      for ( String student : list )
      {
         System.out.printf( "%s ", student );
      }
      System.out.println();
   }  
   
   // output array contents
   public void printArray( String[] array )
   {
      System.out.println( "Array: " );
   
      for ( String student : array )
      {
         System.out.printf( "%s ", student );
      }
      System.out.println();
   }  

   public static void main( String args[] )
   {
      new ArrayToListToArray_08_04();
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

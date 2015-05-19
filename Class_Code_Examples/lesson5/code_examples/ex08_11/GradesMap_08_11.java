// Filename: "GradesMap_08_11.java"
// Program : Advanced Structures: using Map and HashMap to create a statistics output 
// of the number of tasks in a specific course according to a given input

package lesson5.code_examples.ex08_11;

import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class GradesMap_08_11
{
    // creating a HashMap requires us to specify both the Key type and the Value type for that map
   private Map< String, Integer > map;
   private Scanner input;

   // initialize the map and the scanner objects and call methods 
   // to put data into the map and display it's content
   public GradesMap_08_11()
   {      
      map = new HashMap< String, Integer >(); 
      input = new Scanner( System.in );
      createMap();
      printMap();
   }
   
   // create a map based on the user input
   private void createMap() 
   {
      // the user has to input a string in the form of:
      // "programming math math programming theory math theory programming math english english"
      System.out.println( "Enter course fields each followed by a space: (i.e. programming math math theory...)" );
      // NOTICE: use of the same variable name "input" hides the instance "input" variable
      // so the use of the "this" keyword is necessary
      String input = this.input.nextLine();

      // create a StringTokenizer for the user's input
      // a StringTokenizer is like an Iterator in a way that it also has it's own hasNext and next methods
      // the StringTokenizer knows to take a string and break it into individual words
      StringTokenizer tokenizer = new StringTokenizer( input );
               
      // processing user's input while the tokenizer didn't pull the last courseField
      while ( tokenizer.hasMoreTokens() ) 
      {
          // get the courseField in lower case letters (we don't want to make a distinction between math and Math)
         String courseField = tokenizer.nextToken().toLowerCase(); 
                  
         // if the map contains the courseField we want to increment the occurrences counter
         // else we would like to add the key to the map with the occurrences value of 1
         if ( map.containsKey( courseField ) ) 
         {
            // get() gets the value of the current courseField (the number of occurrences)
            int occurences = map.get( courseField ); 
            // increment the number of occurrences for the value of the current coureField
            map.put( courseField, occurences + 1 );  
         } 
         else 
            // the put method works according to the parameter list of the map as declared:
            // (Key, Value) -> (String, Integer)
            // NOTICE: the int value supplied automatically goes through a "Boxing" procedure
            // in order to get placed in an Integer container.
            // add a new courseField with occurrences set to 1 to map (first occurrence)
            map.put( courseField, 1 );
       } 
   } 
   
   // display map content
   private void printMap() 
   {  
       System.out.println();
      // HashMap has a keySet() method that returns a set of all the keySet in the map
      // obtain a set of the keySet in the map
      Set< String > keySet = map.keySet();
      
      // generate output for each key in map      
      System.out.println( "initial map content:" );
      System.out.println( "Key\t\t\tValue" );      
      for ( String key : keySet )
      {
         System.out.printf( "%-14s%14s\n", key, map.get( key ) );
      }
      System.out.println();
      
      // we know that TreeSet uses the Binary Search Tree algorithm to sort it's content
      // so we create a TreeSet by supplying it with the set of keys we obtained from the map
      TreeSet< String > sortedKeySet = new TreeSet< String >( keySet );

      // generate output for each key in map
      System.out.println( "sorted map content:" );
      System.out.println( "Key\t\t\tValue" );      
      for ( String key : sortedKeySet )
      {
         System.out.printf( "%-14s%14s\n", key, map.get( key ) );
      }
      System.out.println();
      
      System.out.println( "Map size: " + map.size() );
      System.out.println( "is Map Empty? " + map.isEmpty() );
   } 

   public static void main( String args[] )
   {
      new GradesMap_08_11();
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

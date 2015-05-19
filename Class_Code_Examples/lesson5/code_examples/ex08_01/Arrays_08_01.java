// Filename: "Arrays_08_01.java"
// Program : Introduction to the Arrays class

package lesson5.code_examples.ex08_01;

import java.util.Arrays;

public class Arrays_08_01 
{
   // arrays initialized using an initialization list
   private static int evenIntegers[] = { 2, 4, 6, 8, 10, 12 };
   private static double oddDoubles[] = { 1.7, 5.5, 11.1, 9.9, 7.3 };
   // arrays initialized using the constructor
   private static int evenIntegersCopy[];
   private static int filledOddIntegers[];

   // initialization constructor
   public Arrays_08_01() 
   {
      // initialize both arrays according to the size of the "evenIntegers" array
      // will initially get filled with zeroes according to the default value for integers
      filledOddIntegers = new int[ evenIntegers.length ];
      evenIntegersCopy = new int[ evenIntegers.length ];
   }

   // print out all the arrays to the console
   public void printArrays() 
   {     
      System.out.print( "evenIntegers: " );
      for ( int value : evenIntegers )
      {
         System.out.printf( "%d ", value );
      }
      System.out.println();
      
      System.out.print( "evenIntegersCopy: " );
      for ( int value : evenIntegersCopy )
      {
         System.out.print( value + " " );
      }
      System.out.println();
          
      System.out.print( "oddDoubles: " );
      for ( double value : oddDoubles )
      {
         System.out.printf( "%.2f ", value );
      }
      System.out.println();

      System.out.print( "filledOddIntegers: " );
      for ( int value : filledOddIntegers )
      {
         System.out.print( value + " " );
      }
      System.out.println();
   }

   // find value in array "evenIntegers"
   public void findInteger(int value)
   {  
      int index = Arrays.binarySearch( evenIntegers, value ); // requires a sorted array, returns a negative index if value not found
	  
      if ( index>=0 )
	  {
         System.out.println( value + " found at index " + index + " in evenIntegers" ); 
	  }
      else
	  {
         System.out.println( value + " not found in evenIntegers" ); 
	  }
   }

   // find equality of 2 given arrays
   public void printEquality( int[] array1, int[] array2 )
   {
      boolean equal = Arrays.equals( array1, array2 );
      System.out.printf( "first array %s second array\n",
         ( equal ? "==" : "!=" ) );
   }

   public static void main( String args[] )
   {
      Arrays_08_01 arrays = new Arrays_08_01();

      arrays.printArrays();
      System.out.println();
      
      Arrays.fill( filledOddIntegers, 1 ); // fill the "filledOddIntegers" array with the value 1
      Arrays.sort( oddDoubles ); // sort oddDoubles in a default ascending order

      // notice there are more static methods for manipulating arrays (this one is from "System")
      // not all of them found in the "Arrays" class and not all of them found in the "java.util" package
      // copy array evenIntegers into array evenIntegersCopy
      // first  0 - index to start copying from in "evenIntegers"
      // second 0 - index to start copying to in "evenIntegersCopy"
      // last parameter is the number of items to copy
      System.arraycopy( evenIntegers, 0, evenIntegersCopy, 0, evenIntegers.length );
      
      arrays.printArrays();
      System.out.println();
      
      arrays.printEquality( evenIntegers, evenIntegersCopy );
      arrays.printEquality( evenIntegers, filledOddIntegers );
      System.out.println();
      
      arrays.findInteger( 6 );
      arrays.findInteger( 534534 );      
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
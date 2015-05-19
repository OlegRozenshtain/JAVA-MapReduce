// Filename: "HashSetTest_08_09.java"
// Program : Advanced Structures: removing duplicates using a hash set

package lesson5.code_examples.ex08_09;

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class HashSetTest_08_09 
{
   private static final String studentsArray[] = 
      { "Larry", "Moe", "Curly", "Shira", "Don", "Curly", "Shira", "Don", "Curly", "Shira", "Don"  };
                  
   // create an array backed list, print the list and call a method to remove duplicates
   public HashSetTest_08_09()
   {
      List< String > studentsList = Arrays.asList( studentsArray );
      
      System.out.println( "Students List: " + studentsList );
      System.out.println();
      
      toHashSet( studentsList );
   } 

   // create a hash set from the list to remove duplicates
   private void toHashSet( List< String > list )
   {
      // create a hash set based on the students list
      Set< String > set = new HashSet< String >( list );   

      System.out.println( "Students Set: " + set );
      System.out.println();
   }

   public static void main( String args[] )
   {
      new HashSetTest_08_09();
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


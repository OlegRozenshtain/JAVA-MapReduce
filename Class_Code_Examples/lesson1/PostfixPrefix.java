package lesson1;

// Filename: PostfixPrefix.java
public class PostfixPrefix {
   public static void main( String args[] ) {
	int x;
	x = 10;
	System.out.println( x );   // prints 10
	System.out.println( x++ ); // prints 10 & then increments
	System.out.println( x );   // prints 11
	System.out.println();
	x = 10;
	System.out.println( x );   // prints 10
	System.out.println( ++x ); // increments & then prints 11
	System.out.println( x );   // prints 11
   }
}

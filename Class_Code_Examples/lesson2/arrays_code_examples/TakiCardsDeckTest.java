// Filename: TakiCardsDeckTest.java
// Program : test the TakiCardsDeck class

package lesson2.arrays_code_examples;

public class TakiCardsDeckTest
{
	public static void main( String args[] )
	{
		TakiCardsDeck myTakiCardsDeck = new TakiCardsDeck();
		
		System.out.println ("====================================================================================================================================================================================");
		System.out.println ("Original Deck:");
		System.out.println ("====================================================================================================================================================================================");		
		for ( int i = 0 ; i < 8 ; i++ )
		{
			System.out.printf( "%-27s%-27s%-27s%-27s%-27s%-27s%-27s\n", 
			myTakiCardsDeck.dealCard(), myTakiCardsDeck.dealCard(), myTakiCardsDeck.dealCard(), myTakiCardsDeck.dealCard(),
			myTakiCardsDeck.dealCard(), myTakiCardsDeck.dealCard(), myTakiCardsDeck.dealCard() );
		}
		
		myTakiCardsDeck.shuffle();
		
		System.out.println ("====================================================================================================================================================================================");
		System.out.println ("Shuffled Deck:");
		System.out.println ("====================================================================================================================================================================================");
		for ( int i = 0 ; i < 8 ; i++ )
		{
			System.out.printf( "%-27s%-27s%-27s%-27s%-27s%-27s%-27s\n", 
			myTakiCardsDeck.dealCard(), myTakiCardsDeck.dealCard(), myTakiCardsDeck.dealCard(), myTakiCardsDeck.dealCard(),
			myTakiCardsDeck.dealCard(), myTakiCardsDeck.dealCard(), myTakiCardsDeck.dealCard() );
		}
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
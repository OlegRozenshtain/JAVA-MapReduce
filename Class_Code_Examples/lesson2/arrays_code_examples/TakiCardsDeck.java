// Filename: TakiCardsDeck.java
// Program : demonstrating composition and the initialization, shuffle and drawing of cards
// Version : 5.3

package lesson2.arrays_code_examples;

import java.util.Random;

public class TakiCardsDeck
	{
	private Card deck[];
	private int cardToDeal;
	private final int CARDS_IN_DECK = 56;
	private Random randomNumbers;

	public TakiCardsDeck()
	{
		// for more details on the content of the Taki deck of cards, go to: http://www.takionline.com/info.html"
		
		String values[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "2+", "3+", "STOP", "TakiTaki" }; // 14 values
		//String SpecialValues[] = { "Change Direction", "Super TakiTaki", "Change Color" }; // 3 values
		String colors[] = { "Green", "Red", "Yellow", "Blue" }; // 4 colors

		deck = new Card[ CARDS_IN_DECK ];
		cardToDeal = 0; // 0 by default
		randomNumbers = new Random(); // for shuffling the deck

		// deck[0 ], values[0%14=0  ], colors[0/14=0 ]
		// ...
		// deck[13], values[13%14=13], colors[13/14=0]
				
		// deck[14], values[14%14=0 ], colors[14/14=1]
		// ...
		// deck[27], values[27%14=13], colors[27/14=1]
		
		// deck[28], values[28%14=0 ], colors[28/14=2]
		// ...
		// deck[41], values[41%14=13], colors[41/14=2]
		
		// deck[42], values[42%14=0 ], colors[42/14=3]
		// ...
		// deck[55], values[55%14=13], colors[55/14=3]
		for ( int spot = 0 ; spot < deck.length ; spot++ )
		{
			System.out.printf("deck[%2d], values[%2d%%%2d=%2d], colors[%2d\\%2d=%d]\n",
					spot, spot, 14, spot%14, spot, 14, spot/14);
			deck[ spot ] = new Card( values[ spot % 14 ], colors[ spot / 14 ] );
		}
	}

	public void shuffle()
	{
		for ( int cardToSwap = 0 ; cardToSwap < deck.length ; cardToSwap++ ) 
		{
			int newSpot =  randomNumbers.nextInt( CARDS_IN_DECK );

			Card temporaryCardHolder = deck[ cardToSwap ];        
			deck[ cardToSwap ] = deck[ newSpot ];   
			deck[ newSpot ] = temporaryCardHolder;            
		}
		
		cardToDeal = 0; // each time the deck of cards being shuffled,
						 // the current card to deal should be the first
						 // card of the deck
	}

	public Card dealCard()
	{
		if ( cardToDeal < deck.length )
			return deck[ cardToDeal++ ];
		else        
			return null;
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
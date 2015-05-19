// Filename: Card.java
// Program : defining the entity of a Card
// Version : 5.3

package lesson2.arrays_code_examples;

public class Card 
{
	private String value;
	private String color;

	public Card( String cardValue, String cardColor )
	{
		value = cardValue;
		color = cardColor;
	}

	public String toString() 
	{ 
		return color + " " + "\"" + value + "\"";
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
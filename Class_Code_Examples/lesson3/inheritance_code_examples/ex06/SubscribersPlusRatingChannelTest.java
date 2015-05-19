// Filename: SubscribersPlusRatingChannelTest.java
// Program : test the SubscribersPlusRatingChannel class

package lesson3.inheritance_code_examples.ex06;

public class SubscribersPlusRatingChannelTest
{
	public static void main(String args[])
	{
		SubscribersPlusRatingChannel channel = new SubscribersPlusRatingChannel("BBC", 27, 10000, .06, 47000);

		// get details via toString() method
		System.out.printf("\n%s:\n\n%s\n",
				"Original channel information obtained by toString", channel);

		// update details
		channel.setGrossWeeklyRating(5000);

		// get details via toString() method
		System.out.printf("\n%s:\n\n%s\n",
				"Updated channel information obtained by toString", channel.toString());
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
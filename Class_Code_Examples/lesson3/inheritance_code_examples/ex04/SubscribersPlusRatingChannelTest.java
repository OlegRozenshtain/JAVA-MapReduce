// Filename: SubscribersPlusRatingChannelTest.java
// Program : test the SubscribersPlusRatingChannel class

package lesson3.inheritance_code_examples.ex04;

public class SubscribersPlusRatingChannelTest
{
	public static void main(String args[])
	{
		SubscribersPlusRatingChannel channel = new SubscribersPlusRatingChannel("BBC", 27, 10000, .06, 47000);

		// get details via get methods
		System.out.println("Channel information obtained by get methods: \n");
		System.out.printf("%s %s\n", "Channel name is",
				channel.getChannelName());
		System.out.printf("%s %d\n", "Channel number is",
				channel.getChannelNumber());
		System.out.printf("%s %.2f\n", "Gross weekly rating is",
				channel.getGrossWeeklyRating());
		System.out.printf("%s %.2f\n", "Profit rate is",
				channel.getProfitRate());
		System.out.printf("%s %.2f\n", "Subscribers fees are",
				channel.getSubscribersFees());

		// update details
		channel.setGrossWeeklyRating(5000);
		channel.setProfitRate(.1);
		channel.setSubscribersFees(49000.5);

		// get details via toString() method
		System.out.printf("\n%s:\n\n%s\n",
				"Updated channel information obtained by toString", channel); // calling channel.toString explicitly is equivalent 
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
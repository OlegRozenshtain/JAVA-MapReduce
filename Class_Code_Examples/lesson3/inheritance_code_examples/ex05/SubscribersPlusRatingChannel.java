// Filename: SubscribersPlusRatingChannel.java
// Program : using getters rather than variable names
// Version : 7.5

package lesson3.inheritance_code_examples.ex05;

public class SubscribersPlusRatingChannel extends RatingChannel
{
	private double subscribersFees;

	public SubscribersPlusRatingChannel(String channel, int number, double rating, double rate, double fees)
	{
		super(channel, number, rating, rate);
		
		setSubscribersFees(fees);
	}

	
	public double getSubscribersFees()
	{
		return subscribersFees;
	}

	public void setSubscribersFees(double fees)
	{
		subscribersFees = (fees < 0.0 ) ? 0.0 : fees;
	}

	public double profit()
	{
		return getSubscribersFees() + ( getProfitRate() * getGrossWeeklyRating() );
	}

	public String toString()
	{
		return String.format("%s: %s\n%s: %d\n%s: %.2f\n%s: %.2f\n%s: %.2f",
				"Subscribers Plus Rating channel", getChannelName(), "Channel number", getChannelNumber(),
				"Gross weekly rating", getGrossWeeklyRating(), "Profit rate", getProfitRate(),
				"Subscribers fees", getSubscribersFees());
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

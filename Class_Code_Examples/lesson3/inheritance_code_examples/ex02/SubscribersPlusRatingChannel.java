// Filename: SubscribersPlusRatingChannel.java
// Program : presenting the second piece of the puzzle and showing code duplication
// Version : 7.2

package lesson3.inheritance_code_examples.ex02;

public class SubscribersPlusRatingChannel
{
	private String channelName;
	private int channelNumber;
	private double grossWeeklyRating;
	private double profitRate; // profit percentage
	private double subscribersFees;

	public SubscribersPlusRatingChannel(String channel, int number, double rating, double rate, double fees)
	{
		setChannelName(channel);
		setChannelNumber(number);
		setGrossWeeklyRating(rating);
		setProfitRate(rate);
		setSubscribersFees(fees);
	}

	public void setChannelName(String first)
	{
		channelName = first;
	}

	public String getChannelName()
	{
		return channelName;
	}

	public void setChannelNumber(int number)
	{
		channelNumber = number; // needs validation
	}

	public int getChannelNumber()
	{
		return channelNumber;
	}

	public void setGrossWeeklyRating(double rating)
	{
		grossWeeklyRating = (rating < 0.0) ? 0.0 : rating;
	}

	public double getGrossWeeklyRating()
	{
		return grossWeeklyRating;
	}

	public void setProfitRate(double rate)
	{
		profitRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
	}

	public double getProfitRate()
	{
		return profitRate;
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
				"Subscribers Plus Rating channel", channelName, "Channel number", channelNumber,
				"Gross weekly rating", grossWeeklyRating, "Profit rate", profitRate,
				"Subscribers fees", subscribersFees);
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

// Filename: RatingChannel.java
// Program : presenting the RatingChannel class, a basic representation for the first part of a profit system
// Version : 7.1

package lesson3.inheritance_code_examples.ex01;

public class RatingChannel extends Object
{
	private String channelName;
	private int channelNumber;
	private double grossWeeklyRating;
	private double profitRate; // profit percentage

	public RatingChannel(String channel, int number, double rating, double rate)
	{
		setChannelName(channel);
		setChannelNumber(number);
		setGrossWeeklyRating(rating);
		setProfitRate(rate);
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

	public double profit()
	{
		return getProfitRate() * getGrossWeeklyRating();
	}

	public String toString()
	{
		return String.format("%s: %s\n%s: %d\n%s: %.2f\n%s: %.2f",
				"Channel name", channelName, "Channel number", channelNumber,
				"Gross weekly rating", grossWeeklyRating, "Profit rate", profitRate);
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

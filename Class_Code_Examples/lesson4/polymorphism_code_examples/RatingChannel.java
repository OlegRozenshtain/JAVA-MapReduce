// Filename: RatingChannel.java
// Program : changing profit to getTotalPayment
// Version : 8.11

package lesson4.polymorphism_code_examples;

public class RatingChannel extends Channel
{
	private double grossWeeklyRating;
	private double profitRate; // profit percentage

	public RatingChannel(String channel, int number, double rating, double rate)
	{
                super(channel, number);
		setGrossWeeklyRating(rating);
		setProfitRate(rate);
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

	public double getTotalPayment()
	{
		return getProfitRate() * getGrossWeeklyRating();
	}

	public String toString()
	{
		return String.format("%s:\n\n%s\n%s: %.2f\n%s: %.2f",
				"Rating channel", super.toString(),
                                "Gross weekly rating", getGrossWeeklyRating(),
                                "Profit rate", getProfitRate());
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

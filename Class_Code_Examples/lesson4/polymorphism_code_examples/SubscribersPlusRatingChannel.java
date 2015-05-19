// Filename: SubscribersPlusRatingChannel.java
// Program : changing profit to getTotalPayment
// Version : 8.11

package lesson4.polymorphism_code_examples;

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

	public double getTotalPayment()
	{
		return getSubscribersFees() + super.getTotalPayment();
	}

	public String toString()
	{
		return String.format("%s:\n\n%s\n%s: %.2f",
				"Subscribers Plus Rating channel", super.toString(),
				"Subscribers fees", getSubscribersFees());
	}
	
	/*
	// another option to format the string representation so that the output will match the rest
	public String toString()
	{
		return String.format("%s %s\n%s: %.2f",
				"Subscribers Plus", super.toString(),
				"Subscribers fees", getSubscribersFees());
	}
	*/
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

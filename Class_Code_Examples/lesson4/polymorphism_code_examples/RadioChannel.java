// Filename: RadioChannel.java
// Program : changing profit to getTotalPayment
// Version : 8.11

package lesson4.polymorphism_code_examples;

public class RadioChannel extends Channel
{
    private final double FEE_PER_POINT=20;
    private int accessPointsCount;

	public RadioChannel(String channel, int number, int count)
	{
	    super(channel, number);
	    setAccessPointsCount(count);
	}

	public void setAccessPointsCount(int count)
	{
		accessPointsCount = (count < 0) ? 0 : count;
	}

	public int getAccessPointsCount()
	{
		return accessPointsCount;
	}

	public double getFeePerPoint()
	{
		return FEE_PER_POINT;
	}

	public double getTotalPayment()
	{
		return (getFeePerPoint() * getAccessPointsCount())/1.2;
	}

	public String toString()
	{
		return String.format("%s:\n\n%s\n%s: %d\n%s: %.2f\n",
				"Radio channel", super.toString(),
                                "Access point count", getAccessPointsCount(),
                                "Fee per point", getFeePerPoint());
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

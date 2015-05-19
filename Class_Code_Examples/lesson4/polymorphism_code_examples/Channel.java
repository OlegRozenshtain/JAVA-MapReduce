// Filename: Channel.java
// Program : adding the Payable interface to the top of the hierarchy
// Version : 8.10

package lesson4.polymorphism_code_examples;

public abstract class Channel implements Payable
{
	private String channelName;
	private int channelNumber;

	public Channel(String channel, int number)
	{
		setChannelName(channel);
		setChannelNumber(number);
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

	public String toString()
	{
		return String.format("%s: %s\n%s: %d\n",
				"Channel name"    , getChannelName(),
				"Channel number"  , getChannelNumber());
	}
        
        // public abstract double profit(); // removed and will be replaced by getTotalPayment()
        // needs to implement getTotalPayment() at all subclasses
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

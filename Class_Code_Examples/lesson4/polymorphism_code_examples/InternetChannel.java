// Filename: InternetChannel.java
// Program : changing profit to getTotalPayment
// Version : 8.11

package lesson4.polymorphism_code_examples;

public class InternetChannel extends Channel
{
    private int clicksCount;
    private double feePerClick;
    private double seoFees;

    public InternetChannel(String channel, int number, int count, double click, double seo)
	{
        super(channel, number);
        setClicksCount(count);
        setFeePerClick(click);
        setSeoFees(seo);
    }

    public void setClicksCount(int count)
	{
        clicksCount = (count < 0) ? 0 : count;
    }

    public int getClicksCount()
	{
        return clicksCount;
    }

    public void setFeePerClick(double click)
	{
    	feePerClick = (click < 0) ? 0 : click;
    }
    
    public double getFeePerClick()
	{
        return feePerClick;
    }
    
    public void setSeoFees(double seo)
	{
        seoFees = (seo < 0) ? 0 : seo;
    }
    
    public double getSeoFees()
	{
        return seoFees;
    }

    public double getTotalPayment()
	{
        return (getFeePerClick() * getClicksCount()) - getSeoFees();
    }

    public String toString()
	{
        return String.format("%s:\n\n%s\n%s: %d\n%s: %.2f\n%s: %.2f\n",
                "Internet channel", super.toString(),
                "Clicks count", getClicksCount(),
                "Fee per click", getFeePerClick(),
                "SEO fees", getSeoFees());
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

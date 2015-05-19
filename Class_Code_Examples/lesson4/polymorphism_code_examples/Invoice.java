// Filename: Invoice.java
// Program : showing an invoice is-A Payable object
// Version : 8.9

package lesson4.polymorphism_code_examples;

public class Invoice implements Payable
{
    private String itemInfo;
    private int quantity;
    private double itemPrice;

    public Invoice( String item, int count, double price)
    {
        setItemInfo(item);
        setQuantity(count);
        setItemPrice(price);
    }

    public void setItemInfo(String item)
    {
        itemInfo=item;
    }

    public String getItemInfo()
    {
        return itemInfo;
    }

    public void setQuantity(int count)
    {
        quantity = (count < 0) ? 0 : count;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setItemPrice(double price)
    {
        itemPrice = (price < 0.0) ? 0.0 : price;
    }

    public double getItemPrice()
    {
        return itemPrice;
    }

    public String toString()
    {
        return String.format("%s: \n%s \n%s: %d \n%s: $%,.2f",
        "invoice", getItemInfo(),
        "quantity", getQuantity(), "price per item", getItemPrice());
    }

    public double getTotalPayment()
    {
        return getQuantity() * getItemPrice();
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


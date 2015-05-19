// Filename: "PayableInterfaceTest.java"
// Version : "8.12"

package lesson4.polymorphism_code_examples;

public class PayableInterfaceTest
{
    public static void main(String args[])
    {
        Payable payableObjects[] = new Payable[6];

        payableObjects[ 0]
            = new Invoice("tomatos", 12, 2.4);
        payableObjects[ 1]
            = new Invoice("orange juice", 4, 7.5);
        payableObjects[ 2]
            = new InternetChannel("BBC", 24, 9788, .1, 7555.5);
        payableObjects[ 3]
            = new RadioChannel("NBC", 32, 23000);
        payableObjects[ 4]
            = new RatingChannel("ABC", 15, 10000, .03);
        payableObjects[ 5]
            = new SubscribersPlusRatingChannel("CNN", 11, 10000, .03, 75000);

        System.out.println(
            "Invoices and Channels processed polymorphically:\n");

        // generically process each element in array payableObjects
        for (Payable currentPayable : payableObjects)
        {
        // output currentPayable and its appropriate payment amount
            System.out.printf("%s \n%s: $%,.2f\n\n",
                currentPayable.toString(),
                "payment due", currentPayable.getTotalPayment());
        }
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

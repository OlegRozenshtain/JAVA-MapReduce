package lesson1;
// Filename: Lottery.java
// Program : demonstrating switch-case
// Version : 3.11

public class Lottery {
	public static void main(String[] args) {
		int luckyNumber = 15;
		switch (luckyNumber) {
		case 28:
			System.out.println("You won the 1st prize!");
			break;
		case 1440:
			System.out.println("You won the 2nd prize!");
			break;
		case 155:
			System.out.println("You won the 3rd prize!");
			break;
		default:
			System.out.println("Sorry, you did not win.");
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
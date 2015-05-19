// Filename: SheshBesh.java
// Program : demonstrating random numbers generation using the Random class, introducing enums and a switch-case
// Version : 4.1

package lesson2.control_statements;

import java.util.Random;

public class SheshBesh
{
	private Random randomNumbers = new Random();

	private enum Status
	{
		CONTINUE, WON, LOST
	};
	// 	private enum Status	{ CONTINUE, WON, LOST }; -> optional writing

	private final static int SHESH_BESH = 11;
	private final static int SHESH = 6;
	private final static int BESH = 5;

	public void play()
	{
		int anchor = 0; // user is still in the game for one more dice roll
		Status gameStatus; // according to enum Status { CONTINUE, WON, LOST }

		int sumOfDice = rollDice();

		switch (sumOfDice) {
		case SHESH_BESH:
			gameStatus = Status.WON;
			break;
		case SHESH:
		case BESH:
			gameStatus = Status.CONTINUE;
			anchor = sumOfDice;
			System.out.printf("Player's Anchor is: %d\n", anchor);
			break;
		default:
			gameStatus = Status.LOST;
			break;
		}

		while (gameStatus == Status.CONTINUE) // can swap while with if
		{
			sumOfDice = rollDice();

			if ((sumOfDice + anchor) == SHESH_BESH)
				gameStatus = Status.WON;
			else if ((sumOfDice + anchor) != SHESH_BESH) {
				gameStatus = Status.LOST;
				System.out.printf("Game total is: %d\n", sumOfDice + anchor); // reason for loosing
																			  // in the second
																			  // dice roll
			}
		}

		if (gameStatus == Status.WON)
			System.out.println("Player won!");
		else
			System.out.println("Player lost!");
	}

	public int rollDice()
	{
		int die1 = randomNumbers.nextInt(6) + 1;
		int die2 = randomNumbers.nextInt(6) + 1;

		int sumOfDice = die1 + die2;

		System.out.printf("Player rolled %d & %d which is: %d\n", die1, die2, sumOfDice);

		return sumOfDice;
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
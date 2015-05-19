package keyboard_input;

import java.util.Scanner;

/**
 * Input 2 values: Number of seats in a bus and Number of passengers.
 * Print how many buses are required to fit all passengers.
 */
public class Ex6
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter the number of seats in a bus:");
		int seatsBus = input.nextInt();
		System.out.println("please enter the number of passengers:");
		int numberPassengers = input.nextInt();
		
		int numberBuses = numberPassengers / seatsBus;
		
		if(numberPassengers % seatsBus != 0)
		{
			numberBuses += 1;
		}
		
		System.out.println("\nthe number of buses required to fit all "
						   + "passengers is: " + numberBuses);
		
		input.close();
	}
}

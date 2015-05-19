package methods;

public class MethodsExercise 
{
	/**
	 * Ex1: write a method that receives a number and returns the number of its 
	 * digits
	 */
	public int countDigits(int number)
	{
		int numberDigits = 0;
		
		do
		{
			number /= 10;
			numberDigits++;
		} while(number != 0);
		
		return numberDigits;
	}
	
	/**
	 * Ex2: write a method that receives a number and a character and prints a 
	 * line of the character with the length of the number
	 */
	public void printCharacter(int numberCopies, char character)
	{
		for(int i = 0; i < numberCopies; ++i) 
		{
			System.out.print(character);
		}
	}
	
	/**
	 * Ex3: write a method that receives two numbers and a character and prints 
	 * a rectangle of the received character and size
	 */
	public void printRectangleCharacter(int length, int width, char character)
	{
		for(int i = 0; i < width; ++i) 
		{
			for(int j = 0; j < length; ++j) 
			{
				System.out.print(character);
			}
			System.out.println();
		}
	}
	
	/**
	 * Ex4: write a method that receives a number and returns its reverse number
	 */
	public int reverseNumber(int number)
	{
		int reverseNumber = 0;
		
		while(number != 0)
		{
			reverseNumber = 10 * reverseNumber + (number % 10); 
			number /= 10;
		}
		
		return reverseNumber;
	}
	
	/**
	 * Ex5: write a method that receives an array of numbers and a number and 
	 * returns the number of times the number appears in the array
	 */
	public int countAppearances(int array[], int number)
	{
		int counter = 0;
		
		for(int i = 0; i < array.length; ++i) 
		{
			if(array[i] == number)
			{
				counter++;
			}
		}
		
		return counter;
	}
	
	/**
	 * Ex6: write a method that receives a number and returns the minimal number
	 * of bills that should be used to construct it (use 1,2,5,10,20,50,100,200)
	 */
	public int constructNumberOutOfBills(int number)
	{
		int numberBills = 0;
		
		int billsType[] = {1, 2, 5, 10, 20, 50, 100, 200};
		for (int i = billsType.length - 1; i >= 0; --i) 
		{
			numberBills += (number / billsType[i]);
			number -= ((number / billsType[i]) * billsType[i]);
		}
		
		return numberBills;
	}
}

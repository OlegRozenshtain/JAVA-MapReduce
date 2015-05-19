package control_structure;

/**
 * print the first 10 numbers in Fibonacci series.
 */
public class Ex15
{
	public static void main(String[] args) 
	{
		int number1 = 1;
		int number2 = 1;
		int nextNumber = number1 + number2;
		
		System.out.print(number1 + " " + number2);
		
		// first two members were printed already
		for(int i = 0; i < 8; i++) 
		{
			System.out.print(" " + nextNumber);
			number1 = number2;
			number2 = nextNumber;
			nextNumber = number1 + number2;
		}
		
	}
}
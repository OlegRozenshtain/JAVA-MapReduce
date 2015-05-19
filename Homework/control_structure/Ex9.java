package control_structure;

/**
 * print the even numbers between 1-100 (also in reverse order).
 */
public class Ex9
{
	public static void main(String[] args) 
	{
		System.out.println("even numbers between 1-100 in reverse order:");
		
		for (int i = 100; i > 0; i-=2) 
		{
			System.out.println(i);
		}
	}
}
package control_structure;

/**
 * print all 3-digit numbers that are divided by 9.
 */
public class Ex10
{
	public static void main(String[] args) 
	{
		System.out.println("3-digit numbers that are divided by 9:");
		
		// 108 is the first 3-digit number divided by 9.
		for (int i = 108; i < 1000; i+=9) 
		{
			System.out.println(i);
		}
	}
}
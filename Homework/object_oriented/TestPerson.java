package object_oriented;

/**
 * write a main method that initializes an array of 10 people
 */
public class TestPerson 
{
	public static void main(String[] args)
	{
		Person personArray[] = new Person[10];
		
		for(int i = 0; i < personArray.length; ++i) 
		{
			personArray[i] = Person.createPerson();
			System.out.println();
		}
	}
}

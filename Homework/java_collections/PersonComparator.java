package java_collections;

import java.util.Comparator;

import object_oriented.Person;

public class PersonComparator implements Comparator<Person> 
{
	// compare people by the lexicographic order of their name
	@Override
	public int compare(Person p1, Person p2) 
	{
		return p1.getName().compareToIgnoreCase(p2.getName());
	}
}

package java_collections;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import object_oriented.Person;

public class PersonCollections 
{
	/**
	 * Ex1: write a program that inputs details of 10 people and store them in a
	 * collection instance of your preference
	 */
	public static void main(String[] args) 
	{
		final int arraySize = 10;
		Scanner input = new Scanner(System.in);
		
		List<Person> personList = new ArrayList<Person>(arraySize);
		
		for(int i = 0; i < arraySize; ++i) 
		{
			personList.add(Person.createPerson());
			System.out.println();
		}
		
		PersonComparator personComparator = new PersonComparator();
		
		/**
		 * Ex2: sort the collection using one of the sorting methods available
		 * (including comparable)
		 */
		Collections.sort(personList, personComparator);
		
		/**
		 * Ex3: write a method that searches a person in this collection (use 
		 * one of search methods)
		 */
		System.out.println("\nSearch for:");
		System.out.println("please enter name");
		String name = input.nextLine();
		Person searchForPerson = new Person();
		searchForPerson.setName(name);
		// for usage of binary search the array has to be sorted. moreover, the
		// same comparator has to be used in both search and sort. if another
		// way of search needed (for example search by id number), need to write
		// another comparator class and use a different searching method
		int searchResult = Collections.binarySearch(personList, searchForPerson, 
													personComparator);
		
		if (searchResult >= 0)
		{
			System.out.println("person found in place: " + searchResult);
		}
		else
		{
			System.out.println(searchForPerson.toString() + 
							   "wasn't found. check the name");
		}
		
		/**
		 * Ex4: store the elements in some mapping collection using the ID of
		 * the person as the ID of the map 
		 */
		Map<Integer, Person> personMap = new HashMap<Integer, Person>(arraySize);
		
		for (Person personIter : personList)
		{
			// use copy constructor so instances in map and list would have 
			// different references
			Person p = new Person(personIter);
			personMap.put((Integer)p.getId(), p);
		}
		
		/**
		 * Ex5: input from the user a name of a person and remove it from the 
		 * collection (using iterator)
		 */
		System.out.println("\nRemove:");
		System.out.println("please enter name");
		name = input.nextLine();
		searchForPerson.setName(name);
		for (Iterator<Person> personIter = personList.iterator(); 
			 personIter.hasNext(); )
		{
			if(personComparator.compare(searchForPerson, personIter.next()) == 0)
			{
				personIter.remove();
			}
		}
	}
}

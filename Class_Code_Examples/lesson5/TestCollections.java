package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TestCollections {

	public static void main(String[] args) {
	
		int[] items = {5,6,1,2,3,4,5,3,2,1,4,5};
	
		// Iterate using for
		for (int i = 0; i < items.length ; i++) {
			System.out.print(items[i] + " ");
		}
		System.out.println();
		
		// Iterate using for-each
		for (int i : items) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// Add array items to list using for-each
		List<Integer> l = new ArrayList();
		for (int i : items) {
			l.add(i);
		}
		
		// Iterate using Iterator
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		// Create 2 different collections: a set and a list
		// a set does not allow duplicates while a list does	
		Collection c1 = new TreeSet(); //LinkedHashSet
		Collection c2 = new ArrayList();
		
		// adding both the set and the list all the items of the array "items"
		// in a polymorphic way
		for (int i = 0; i < items.length ; i++) {
			c1.add(items[i]);
			c2.add(items[i]);
		}
		
		// Proof that the set did not allow the duplicates in
		// Notice: TreeSet gives an ordered set, if you change TreeSet to LinkedHashSet
		// you will get an unordered set
		System.out.println(c1);
		System.out.println(c2);
		}
}

package myProject.practicle.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>(Arrays.asList(9, 8, 12, 1, 6, 7));
		
		ListIterator<Integer> listIterator = integers.listIterator();
		System.out.println(listIterator + " - listIterator");
		System.out.println(integers + " - integers");
		listIterator = integers.listIterator(3);
		System.out.println("Previos 3 listIterstor: " + listIterator.previous());
		System.out.println("Previos index: " + listIterator.previousIndex());
		
		listIterator.set(20);
		System.out.println("Next element after 'set(20)': " + listIterator.next());
		System.out.println(integers + " - integers");
		
		listIterator.add(21);
		System.out.println("Previous after adding 21: " + listIterator.previous());
		System.out.println(integers + " - integers");
		
		listIterator.remove();
		System.out.println(integers);
		
		
		
		

	}

}

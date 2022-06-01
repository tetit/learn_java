package myProject.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
				animals.add("dog");
				animals.add("cat");
				animals.add("frog");
				animals.add("bird");
				animals.add("z");
				animals.add("bird fly");
				
				Collections.sort(animals); 
				System.out.println(animals);
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(1);
		numbers.add(76);
		numbers.add(0);
		numbers.add(9);
		
		Collections.sort(numbers); 
		System.out.println(numbers);
		
		Collections.sort(animals, new StringLengthComparator());
		System.out.println(animals);
		
		Collections.sort(numbers, new BackWardsIntegerComparator());
		System.out.println(numbers);
		
		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) return -1;
				else if (o1 < o2) return 1;
				else return 0;
		}
		});
		System.out.println(numbers);
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(7, "Mykyta"));
		people.add(new Person(1, "Bob"));
		people.add(new Person(7, "Mykyta"));
		people.add(new Person(4, "Daniel"));
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getId() > o2.getId()) return 1;
				if (o1.getId() < o2.getId()) return -1;
				else return 0;
			}
			
		});
		
		System.out.println(people);

	}

}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		/*
		 * o1 > o2 => 1;
		 * o1 < o2 => -1;
		 * o1 == o2 => 0;
		 */
		if (o1.length() > o2.length()) return 1;
		else if (o1.length() < o2.length()) return -1;
		else return 0;
	}
	
}

class BackWardsIntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2) return -1;
		else if (o1 < o2) return 1;
		else return 0;
	}
	
}

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}

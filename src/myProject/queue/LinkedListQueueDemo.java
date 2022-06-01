package myProject.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LinkedListQueueDemo {
	public static void main(String[] args) {
		Person person1 = new Person(1);
		Person person4 = new Person(4);
		Person person2 = new Person(2);
		Person person3 = new Person(3);
		
		Queue<Person> people = new LinkedList<Person>();
		people.add(person4);
		people.add(person1);
		people.add(person2);
		people.add(person3);
		people.add(person3);
		
		for (Person person : people) {
			System.out.println(person);
		}
		
		System.out.println(people);
		
		Queue<Person> people1 = new ArrayBlockingQueue<Person>(3);
//		people1.add(person4);
//		people1.add(person1);
//		people1.add(person2);
//		people1.add(person3);
//		people1.add(person3);
		
		people1.offer(person4);
		people1.offer(person1);
		people1.offer(person2);
		people1.offer(person3);
		people1.offer(person3);
		
		System.out.println(people1);
		
		System.out.println(people1.remove());
		System.out.println(people1.peek());
		System.out.println(people1);
		
	}

}
class Person {
	private int id;

	public Person(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + "]";
	}
	
	
}

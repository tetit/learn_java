package myProject.hashEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCodeEqualsDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		Set<Integer> set = new HashSet<Integer>();

		map.put(1, "one");
		map.put(1, "one other");

		set.add(1);
		set.add(1);

		System.out.println(map);
		System.out.println(set);
		
		Person person1 = new Person(1, "Mike");
		Person person2 = new Person(2, "Katy");
		
		Map<Person, String> map1 = new HashMap<>();
		Set<Person> set1 = new HashSet<>();
		
		map1.put(person1, "one");
		map1.put(person2, "one other");

		set1.add(person1);
		set1.add(person2);
		
		System.out.println(map1);
		System.out.println(set1);
		
		Person person3 = new Person(1, "Mike");
		Person person4= new Person(1, "Mike");
		
		map1.put(person3, "one");
		map1.put(person4, "one other");

		set1.add(person3);
		set1.add(person4);
		
		System.out.println(map1);
		System.out.println(set1);
		
	}

}

class Person {

	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	

}

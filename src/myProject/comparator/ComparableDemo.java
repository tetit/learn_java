package myProject.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
		List<Person1> peopleList = new ArrayList<Person1>();
		Set<Person1> peopleSet = new TreeSet<Person1>();
		
		addElements(peopleList);
		addElements(peopleSet);
		
		Collections.sort(peopleList);
		
		System.out.println(peopleList);
		System.out.println();
		System.out.println(peopleSet);

	}
	
	private static void addElements(Collection<Person1> collection) {
		collection.add(new Person1(2, "Zaki"));
		collection.add(new Person1(1, "Bob"));
		collection.add(new Person1(15, "Ku"));
		collection.add(new Person1(4, "Lulia"));
		
	}

}
class Person1 implements Comparable<Person1>{
	private int id;
	private String name;
	
	public Person1(int id, String name) {
		this.id = id;
		this.name = name;
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
		Person1 other = (Person1) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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

//	@Override
//	public int compareTo(Person1 o) {
//		if(this.id > o.getId()) return 1;
//		else if(this.id < o.getId()) return -1;
//		else return 0;
//	}
	
	@Override
	public int compareTo(Person1 o) {
		if(this.name.length() > o.getName().length()) return 1;
		else if(this.name.length() < o.getName().length()) return -1;
		else return 0;
	}
	
	
	
}

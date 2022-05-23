package myProject.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedhashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		
		addStringValue(hashSet);
		addStringValue(linkedhashSet);
		addStringValue(treeSet);
		
		Set<Integer> hashSetInt1 = new HashSet<Integer>();
		Set<Integer> hashSetInt2 = new HashSet<Integer>();
		
		addIntValue(hashSetInt1, 5, 25, 2);
		addIntValue(hashSetInt2, 15, 35, 2);
		
		//union - объединние множеств
		Set<Integer> union = new HashSet<Integer>(hashSetInt1);
		union.addAll(hashSetInt2);
		System.out.println(union);
		
		//intersection - пересечение множеств
		Set<Integer> intersection = new HashSet<Integer>(hashSetInt1);
		intersection.retainAll(hashSetInt2);
		System.out.println(intersection);
		
		//difference - разность множеств
		Set<Integer> difference = new HashSet<Integer>(hashSetInt1);
		difference.removeAll(hashSetInt2);
		System.out.println(difference);
		
	}
	private static void addStringValue(Set<String> set) {
		
		set.add("Mike");
		set.add("Joke");
		set.add("Mim");
		set.add("Oma");
		set.add("Luke");
		set.add("Mike"); //do not added
		
		for (String name : set) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		System.out.println(set.contains("Mim"));
		System.out.println(set.contains("Mom"));
		
		System.out.println(set);
		System.out.println();

	}
	
	private static void addIntValue(Set<Integer> set, int first, int end, int step){
		for (int i = first; i <= end; i += step) {
			set.add(i);
		}
		System.out.println(set);
	}
	
	
}
	

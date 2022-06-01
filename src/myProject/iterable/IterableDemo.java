package myProject.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator<Integer> iterator = list.iterator();
		int indx = 0;
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			if(indx == 1)
			iterator.remove();
			
			indx++;
		}
		
		System.out.println(list);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		

	}

}

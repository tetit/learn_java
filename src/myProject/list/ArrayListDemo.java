package myProject.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 25; i++) {
			list.add(i);
		}
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		
		list.add(list.size());
		System.out.println(list.remove(7));
//		arr.remove(77);
		System.out.println(list);
		
		list = new LinkedList<Integer>(list);
		System.out.println("======1==========");
		System.out.println(list);
		
		List<Integer> list1 = convertALtoLL(list);
		list = new LinkedList<>(convertALtoLL(list));
		System.out.println("======2==========");
		System.out.println(list);
		System.out.println("======3==========");
		System.out.println(list1);
		

	}
	
	// Generic function to convert an ArrayList to LinkedList
    public static <T> List<T> convertALtoLL(List<T> aL)
    {
  
        // Create the LinkedList by passing the ArrayList
        // as parameter in the constructor
        List<T> lL = new LinkedList<>(aL);
  
        // Return the converted LinkedList
        return lL;
    }

}

package myProject.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		MyLinkedList myList = new MyLinkedList();
		
		for (int i = 0; i < 20;) {
			myList.add(i);
			i += 3;
		}
		
		System.out.println(myList);
		System.out.println(myList.get(3));
//		System.out.println(myList.get(30));
		
		myList.remove(0);
		System.out.println(myList);
		
		myList.remove(1);
		System.out.println(myList);
		
	}

}

package myProject.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVSArrayList {
	public static void main(String[] args) {
		List<Integer> lL = new LinkedList<>();
		List<Integer> aL = new ArrayList<>();

//		System.out.println(lL.add(7) + " " + lL);
//		System.out.println(lL.get(0) + " " + lL);
//		System.out.println(lL.size() + " " + lL);
//		System.out.println(lL.remove(0) + " " + lL);
//		

		measureTimeAdd(lL);
		measureTimeAdd(aL);
		
		measureTimeGet(lL);
		measureTimeGet(aL);
		
		measureTimeAddToStart(lL);
		measureTimeAddToStart(aL);
		
		

	}

	private static void measureTimeAdd(List<Integer> list) {

		long start = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}

		long end = System.currentTimeMillis();

		System.out.println("measureTimeAdd " + (end - start));
	}

	private static void measureTimeGet(List<Integer> list) {

		long start = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			list.get(i);
		}

		long end = System.currentTimeMillis();

		System.out.println("measureTimeGet " + (end - start));
	}

	private static void measureTimeAddToStart(List<Integer> list) {

		long start = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			list.add(0, i);
		}

		long end = System.currentTimeMillis();

		System.out.println("measureTimeAddToStart " + (end - start));
	}

}

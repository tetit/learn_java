package com.itbulls.learnit.javacore.methods.hw;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please, enter integer numbers separated by space: ");
			String intString = sc.nextLine();
			String[] arrayString = intString.split("[ ]");
			int[] intArray = new int[arrayString.length];
			for (int i = 0; i < arrayString.length; i++) {
				intArray[i] = Integer.parseInt(arrayString[i]);
			}
			int maxInt = findMaxIntInArray(intArray);
		
		
			System.out.println("*** Initial Array ***");
			System.out.println(Arrays.toString(intArray));
			System.out.println("*** Max number in array ***");
			System.out.println(maxInt);
		}

		
		public static int findMaxIntInArray(int[] intArray) {
			int maxInt = 0;
			for (int i = 0; i < intArray.length; i++) {
				if (intArray[i] > maxInt) {
					maxInt = intArray[i];
				}
			}
			return maxInt;
			
		}
	}
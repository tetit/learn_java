package myProject.function.hw;

import java.util.Arrays;
import java.util.Scanner;

/*Implement console program which will meet the following requirements:
Program starts and asks user to enter 7 words separated by space
Program stores all these strings in array.
Program sorts the array putting on the first place strings which has more characters and putting at the end strings with less length
Program prints to console sorted array

EXAMPLE:
User input: “apple windows oracle microsoft Apple zpple”

Program console output:
microsoft windows oracle apple Apple zpple*/


public class SortWordsInArray {
	
	public static void main(String[] args) {
		System.out.print("Please, enter words separated by space: ");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.trim().split("\\s+");
		
		Arrays.sort(words, (str1, str2) -> {
			int res = str2.length() - str1.length();
			if (res == 0)
				res = str1.compareToIgnoreCase(str2);
			return res;
		});
		
		for (String word : words)
			System.out.println(word + " ");
			
	
		
		
		
    }

}

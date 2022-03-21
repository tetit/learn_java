package com.itbulls.learnit.javacore.string.hw;

import java.util.Arrays;
import java.util.Scanner;

public class InputTextToArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any text: ");
		String text = sc.nextLine();

		String[] arrayFromText = text.split("[ !._,'@?]");
		System.out.println(Arrays.toString(arrayFromText));

	}

}

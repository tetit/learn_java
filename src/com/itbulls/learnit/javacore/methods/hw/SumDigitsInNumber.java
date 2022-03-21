package com.itbulls.learnit.javacore.methods.hw;

import java.util.Scanner;

public class SumDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
		String input = String.valueOf(Math.abs(number));
		String arr[] = input.split("");
		int sum = 0;
		for (String str : arr) {
			sum += Integer.parseInt(str);
		}
		return sum;
	}
}
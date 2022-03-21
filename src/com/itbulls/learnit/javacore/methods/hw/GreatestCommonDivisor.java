package com.itbulls.learnit.javacore.methods.hw;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter two numbers separated by space: ");
		String userInput = sc.nextLine();

		String[] inputArgumentsArray = userInput.split("\\s+");
		int number1 = Integer.parseInt(inputArgumentsArray[0]);
		int number2 = Integer.parseInt(inputArgumentsArray[1]);

		System.out.println(gcdRecursive(number1, number2));
	}

	public static int gcdRecursive(int firstNumber, int secondNumber) {
		if (firstNumber > 0 && secondNumber > 0) {
			if (firstNumber > secondNumber) {
				int gcd = firstNumber % secondNumber;
				if (gcd == 0) {
					return secondNumber;
				} else {
					firstNumber = secondNumber;
					secondNumber = gcd;
					return gcdRecursive(firstNumber, secondNumber);
				}
			}
			else {
				int smolest = firstNumber;
				firstNumber = secondNumber;
				secondNumber = smolest;
				return gcdRecursive(firstNumber, secondNumber);
			}
			
		}
		return 0;
	}
}
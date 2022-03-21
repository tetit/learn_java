package com.itbulls.tymoshchuk;

import java.util.Arrays;
import java.util.Scanner;


public class Typing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input roman number: ");
		String romanNumber = sc.nextLine();
		
			String romanNumeral = romanNumber.toUpperCase();
			System.out.println("romanNumeral= "+romanNumeral);

			int decimal = 0;
			int lastNumber = 0;

			for (int x = romanNumeral.length() - 1; x >= 0; x--) {
				char convertToDecimal = romanNumeral.charAt(x);
				System.out.println("romanNumeral= "+romanNumeral);
				System.out.println("convertToDecimal= "+convertToDecimal);

				switch (convertToDecimal) {
				case 'C':
					System.out.println("case V lastNumber= "+lastNumber+" decimal= "+decimal);
					decimal = processDecimal(100, lastNumber, decimal);
					System.out.println("case C lastNumber= "+lastNumber+" decimal= "+decimal);
					lastNumber = 100;
					break;

				case 'L':
					System.out.println("case L lastNumber= "+lastNumber+" decimal= "+decimal);
					decimal = processDecimal(50, lastNumber, decimal);
					System.out.println("case L lastNumber= "+lastNumber+" decimal= "+decimal);
					lastNumber = 50;
					break;

				case 'X':
					System.out.println("case X lastNumber= "+lastNumber+" decimal= "+decimal);
					decimal = processDecimal(10, lastNumber, decimal);
					System.out.println("case X lastNumber= "+lastNumber+" decimal= "+decimal);
					lastNumber = 10;
					break;

				case 'V':
					System.out.println("case V lastNumber= "+lastNumber+" decimal= "+decimal);
					decimal = processDecimal(5, lastNumber, decimal);
					System.out.println("case V lastNumber= "+lastNumber+" decimal= "+decimal);
					lastNumber = 5;
					break;

				case 'I':
					System.out.println("case I lastNumber= "+lastNumber+" decimal= "+decimal);
					decimal = processDecimal(1, lastNumber, decimal);
					System.out.println("case I lastNumber= "+lastNumber+" decimal= "+decimal);
					lastNumber = 1;
					break;

				}

			}

	

	}
	 
		private static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
			if (lastNumber > decimal) {
				return lastDecimal - decimal;
			} else {
				return lastDecimal + decimal;
			}
		}


}

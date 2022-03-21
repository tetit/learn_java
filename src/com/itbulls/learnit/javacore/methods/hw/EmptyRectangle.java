package com.itbulls.learnit.javacore.methods.hw;

import java.util.Scanner;

public class EmptyRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();

		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {
		for (int i = 0; i < height; i++) {
			if (i == 0 || i == (height - 1)) {
				for (int j = 0; j < width; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int k = 0; k < width; k++) {
					if (k == 0 || k == (width - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println();
			}
		}
	}

}
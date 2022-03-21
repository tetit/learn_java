package com.itbulls.learnit.javacore.methods.hw;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixRotation1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please, enter matrix size: ");
		int size = in.nextInt();
		double[][] matrix = generateMatrix(size);

		System.out.println("How you want to rotate matrix:" + System
				.lineSeparator() + "\t1 - 90" + System.lineSeparator()
				+ "\t2 - 180" + System.lineSeparator() + "\t3 - 270");
		int mode = in.nextInt();

		System.out.println(System.lineSeparator() + "Base matrix:" + System
				.lineSeparator());
		printMatrixToConsole(matrix);
		System.out.println();

		if (rotateMatrix(matrix, mode)) {
			printMatrixToConsole(matrix);
		}

	}

	public static double[][] generateMatrix(int size) {
		double[][] matrix = new double[size][size];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == 0 && j == 0) {
					matrix[i][j] = 0.0;
				} else if (j == 0) {
					matrix[i][j] = matrix[i - 1][j] + 1.0;
				} else {
					matrix[i][j] = matrix[i][j - 1] + 0.10001;
				}

			}
		}
		return matrix;
	}

	public static void rotate90(double[][] matrix) {
		double[][] matrix90 = new double[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix90[i][j] = matrix[i][j];
			}
		}
		for (int i = 0; i < matrix90.length; i++) {
			for (int j = 0; j < matrix90[i].length; j++) {
				matrix[i][j] = matrix90[matrix90[i].length - j - 1][i];
			}
		}
	}

	public static void rotate180(double[][] matrix) {
		double[][] matrix180 = new double[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix180[i][j] = matrix[i][j];
			}
		}
		for (int i = 0; i < matrix180.length; i++) {
			for (int j = 0; j < matrix180[i].length; j++) {
				matrix[i][j] = matrix180[matrix180[i].length - i
						- 1][matrix180[i].length - 1 - j];
			}
		}
	}

	public static void rotate270(double[][] matrix) {
		double[][] matrix270 = new double[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix270[i][j] = matrix[i][j];
			}
		}
		for (int i = 0; i < matrix270.length; i++) {
			for (int j = 0; j < matrix270[i].length; j++) {
				matrix[i][j] = matrix270[j][matrix270[i].length - 1 - i];
			}
		}
	}

	public static void printMatrixToConsole(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				System.out.printf("%.3s\t", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static boolean rotateMatrix(double[][] matrix, int mode) {
		switch (mode) {
		case 1:
			rotate90(matrix);
			break;
		case 2:
			rotate180(matrix);
			break;
		case 3:
			rotate270(matrix);
			break;
		}
		return true;
	}

}
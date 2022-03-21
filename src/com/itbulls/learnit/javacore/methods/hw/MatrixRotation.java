package com.itbulls.learnit.javacore.methods.hw;

import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please, enter matrix size: ");
		int size = in.nextInt();
		double[][] matrix = new double[size][size];
		for (int i = 0; i < matrix.length; i ++) {
			for (int j = 0 ; j < matrix[i].length; j ++) {
				if (i == 0 && j == 0) {
					matrix[i][j] = 0.0;
				}
				else if (j == 0) {
					matrix[i][j] = matrix[i-1][j] + 1.0;
				}
				else {
					matrix[i][j] = matrix[i][j-1] + 0.1;
				}
				
				System.out.printf("%.3s\t", matrix[i][j]);
			}
			System.out.println();
		
		}
//		generateMatrix(size, matrix);
	}

//		double[][] matrix = generateMatrix(size);

	/*	System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
				"\t1 - 90" + System.lineSeparator() +
				"\t2 - 180" + System.lineSeparator() +
				"\t3 - 270");
		int mode = in.nextInt();

		System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
		printMatrixToConsole(matrix);
		System.out.println();

		if (rotateMatrix(matrix, mode)) {
			printMatrixToConsole(matrix);
		}
	}*/
	
	/*
	 * public static void generateMatrix (int size, double[][] matrix) { matrix
	 * [0][0] = 0.0; for (int i = 0; i < matrix.length; i ++) { for (int j = 0 ;
	 * j < matrix[i].length; j ++) { if (i == 0 & j == 0) { matrix[i][j] = 0.0;
	 * } else { matrix[i][j] += 0.1; }
	 * 
	 * System.out.print(matrix[i][j]+" "); }
	 * 
	 * } }
	 */
	/*
	 * public static void rotate90(double[][] matrix) { <write your code here> }
	 * 
	 * public static void rotate180(double[][] matrix) { <write your code here>
	 * }
	 * 
	 * public static void rotate270(double[][] matrix) { <write your code here>
	 * }
	 */
  }
 
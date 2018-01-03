package com.forgeinnovations.cracking.the.code.interview;

public class RotateMatrixBy90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[8][8];
		int count = 1;
		//Filling the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = count++;

			}

		}

		System.out.println("Original");
		printMatrix(matrix);

		int[][] rotatedMatrix = new int[8][8];

		rotatedMatrix = RotateMatrixByNinetyDegrees(matrix);

		System.out.println("Rotated");
		printMatrix(rotatedMatrix);
		
		System.out.println("Rotated Solution 2");
		
		rotate(matrix, matrix.length);

	}

	private static int[][] RotateMatrixByNinetyDegrees(int[][] matrix) {
		int col = matrix.length;
		int row = matrix[0].length;
		int[][] result = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				result[i][j] = matrix[(col - 1) - j][i];

			}
		}

		return result;
	}

	// SOLUTION 2
	public static void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; ++i) {
				int offset = i - first;
				int top = matrix[first][i]; // save top
				// left -> top
				matrix[first][i] = matrix[last - offset][first];

				// bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
		
		printMatrix(matrix);
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");

			}

			System.out.println();
		}

	}

}

package com.sapient.gs;

public class PascalTriangleIterative {

	public static void main(String[] args) {
		int row = 4, col = 1;
		System.out.print("Element at-->"+row+","+col+":"+getElementFromPascal(row, col));
	}

	private static int pascal(int row, int col) {
		if (col > row)
			return -1;
		if (row == col || col == 0) {
			return 1;
		}
		return pascal(row - 1, col) + pascal(row - 1, col - 1);
	}

	private static int getElementFromPascal(int row, int col) {
		int rows = row + 1;
		int n = rows;
		int[][] ar = new int[rows][rows];
		int i = 0, j = 0;
		for (i = 0; i < rows; i++) {
			for (int k = n--; k > 0; k--) System.out.print(" ");
			for (j = 0; j <= i; j++) {
				if (j == i || j == 0) {
					ar[i][j] = 1;
					System.out.print(ar[i][j] + " ");
				} else {
					ar[i][j] = ar[i - 1][j] + ar[i - 1][j - 1];
					System.out.print(ar[i][j] + " ");
				}
			}
			System.out.println();

		}
		return ar[row][col];
	}

}

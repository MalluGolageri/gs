package com.sapient.gs;

public class SpiralMatrixGFG {
	// Function print matrix in spiral form
	static void spiralPrint(int rows, int columns, int a[][]) {
		int i, sRowInd = 0, sColumnInd = 0;
		/*
		 * sRowIndex - starting row index m - ending row index sColumnIndex - starting
		 * column index n - ending column index i - iterator
		 */

		while (sRowInd < rows && sColumnInd < columns) {
			// Print the first row from the remaining rows
			for (i = sColumnInd; i < columns; i++) {
				System.out.print(a[sRowInd][i] + " ");
			}
			sRowInd++;
			// Print the last column from the remaining columns
			for (i = sRowInd; i < rows; ++i) {
				System.out.print(a[i][columns - 1] + " ");
			}
			columns--;

			// Print the last row from the remaining rows */
			if (sRowInd < rows) {
				for (i = columns - 1; i >= sColumnInd; --i) {
					System.out.print(a[rows - 1][i] + " ");
				}
				rows--;
			}

			// Print the first column from the remaining columns */
			if (sColumnInd < columns) {
				for (i = rows - 1; i >= sRowInd; --i) {
					System.out.print(a[i][sColumnInd] + " ");
				}
				sColumnInd++;
			}
		}
	}

	// driver program
	public static void main(String[] args) {
		int R = 3;
		int C = 6;
		int a[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
		spiralPrint(R, C, a);
	}
}

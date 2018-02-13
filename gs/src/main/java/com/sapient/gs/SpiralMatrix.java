package com.sapient.gs;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] ar = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		spiral(ar);
	}

	public static void spiral(int[][] arr) {
		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr[0].length - 1;

		int row = top;
		int col = left;

		while (left <= right && top <= bottom) {
			row = top;
			col = left;

			while (col <= right && left <= right && top <= bottom) {
				System.out.print(arr[row][col] + " ");
				col++;
			}

			top = top + 1;
			row = top;
			col = right;
			while (row <= bottom && left <= right && top <= bottom) {
				System.out.print(arr[row][col] + " ");
				row++;
			}
			right = right - 1;
			col = right;
			row = bottom;
			while (col >= left && left <= right && top <= bottom) {
				System.out.print(arr[row][col] + " ");
				col--;
			}
			bottom = bottom - 1;
			row = bottom;
			col = left;

			while (row >= top && left <= right && top <= bottom) {
				System.out.print(arr[row][col] + " ");
				row--;
			}
			left = left + 1;
		}
	}

}

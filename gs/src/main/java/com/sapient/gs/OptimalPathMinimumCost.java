package com.sapient.gs;

import java.io.*;
import java.util.*;

public class OptimalPathMinimumCost {

	public static void main(String[] args) {

		// int[][] ar = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };
		int[][] ar = { { 6, 7, 4, 2 }, { 3, 4, 5, -9 }, { 6, 7, 2, 1 } };

		System.out.println(getOptimalPath(ar, 2, 3));
	}

	private static int min(int x, int y, int z) {
		if (x < y) {
			return x < z ? x : z;
		} else if (y < x) {
			return y < z ? y : z;
		} else {
			return x < z ? x : z;
		}

	}

	private static int getOptimalPath(int[][] ar, int m, int n) {
		int[][] totalCost = new int[m + 1][n + 1];
		//fill first row
		totalCost[0][0] = ar[0][0];
		for (int i = 1; i <= n; i++) {
			totalCost[0][i] = totalCost[0][i - 1] + ar[0][i];
		}
		//fill first column
		for (int i = 1; i <= m; i++) {
			totalCost[i][0] = totalCost[i - 1][0] + ar[i][0];
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				totalCost[i][j] = min(totalCost[i - 1][j - 1], totalCost[i - 1][j], totalCost[i][j - 1]) + ar[i][j];
			}
		}
		return totalCost[m][n];
	}
}

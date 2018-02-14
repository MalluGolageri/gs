package com.sapient.gs;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int sum = 16;
		int[] ar = { 1, 2, 3, 4, 5, 6, 12, 15, 7 };
		System.out.print("\n" + minimumSubArrayLength(ar, sum));
	}

	private static int minimumSubArrayLength(int[] ar, int sum) {
		int startIndex = 0, endIndex = 0, minLength = Integer.MAX_VALUE, res = 0, start = 0;
		;
		while (endIndex < ar.length) {
			while (res <= sum && endIndex < ar.length) {
				res += ar[endIndex++];
			}

			while (res > sum && startIndex < ar.length) {
				res = res - ar[startIndex++];
				if ((endIndex - startIndex) < minLength && res > sum) {
					minLength = endIndex - startIndex;
					start = startIndex;
					// System.out.println("startIndex:"+startIndex+" endIndex:"+endIndex+"
					// minLength:"+minLength);
				}
			}
		}

		for (int i = start; i < (start + minLength); i++) {
			System.out.print(ar[i] + ",");
		}
		return minLength;
	}
}

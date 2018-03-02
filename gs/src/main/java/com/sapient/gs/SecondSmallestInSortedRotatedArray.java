package com.sapient.gs;

public class SecondSmallestInSortedRotatedArray {

	public static void main(String[] args) {

		int[] ar = { 8, 9, 10, 11, 12, -6, -5, -1, 0, 1, 2, 3, 4, 5, 6, 7 };
		getSecondSmallest(ar, 11);
	}

	private static void getSecondSmallest(int[] ar, int k) {

		int minIndex = getMinimumIndex(ar, 0, ar.length - 1);
		k = k < 1 ? 0 : k - 1;
		int kthIndex = (minIndex + k) % ar.length;
		System.out.println(ar[kthIndex]);
	}

	private static int getMinimumIndex(int[] ar, int low, int high) {
		int mid = low + (high - low) / 2;
		if (ar[mid + 1] < ar[mid]) {
			return mid + 1;
		}
		if (ar[mid - 1] > ar[mid]) {
			return mid;
		}
		if (ar[high] > ar[mid])
			return getMinimumIndex(ar, low, mid - 1);

		return getMinimumIndex(ar, mid + 1, high);
	}

}

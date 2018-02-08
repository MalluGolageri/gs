package com.sapient.gs;


public class SmallestSubArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 7, 8, 40, 34, 56, 20, 1, 3, 1, 1, 1, 1, 1, 1, 1 };
		System.out.println("minlength:" + smallestSubArray(arr, 114));
	}

	private static int smallestSubArray(int[] arr, int x) {
		int start = 0, end = 0;
		int cursum = 0, minlength = arr.length+1;
		//int startIndex = 0;
		while (end < arr.length) {
			while (cursum <= x && end < arr.length) {
				cursum += arr[end++];
			}

			while (cursum >= x && start < arr.length) {
				cursum -= arr[start++];
				if (end - start < minlength && cursum >= x ) {
					minlength = end - start;
					//startIndex = start;
				}				
			}
		}
//		System.out.println(startIndex);
//		for (int i = 0; i < minlength; i++) {
//			System.out.print(arr[startIndex + i] + ",");
//		}
		return minlength;
	}

	public static String smallestSubArrayOld(int[] ar, int x) {
		int minlen = ar.length;
		int startindex = 0;

		int start = 0;
		int end = 0;
		int cursum = 0;
		while (start <= end && end < ar.length) {

			while ( cursum < x && end < ar.length) {
				cursum += ar[end++];				
			}

//			if (end - start < minlen && start <= end && x <= cursum) {
//				minlen = end - start;
//				startindex = start;
//			}

			while (cursum >= x && start <= end && start < ar.length) {
				cursum -= ar[start++];
				if (end - start < minlen && x <= cursum) {
					minlen = end - start;
					startindex = start;
				}
			}

		}
		minlen = minlen == ar.length ? -1 : minlen;
		String res = "[ ";
		for (int k = 0; k < minlen; k++) {
			res = res + ar[startindex + k] + ",";
		}
		res = res + "]";
		return "min len subarry is of size " + minlen + " from index " + startindex + " elemets " + res;
	}

}


public class SecondSmallestInSortedRotatedArray {

	public static void main(String[] args) {

		int[] ar = { 6,7,8,9,10,11,12, 1, 2, 3, 4, 5 };

		getSecondSmallest(ar);
	}

	private static void getSecondSmallest(int[] ar) {

		int minIndex = getMinimumIndex(ar, 0, ar.length - 1);
		if(minIndex==ar.length-1) {
			System.out.println(ar[0]);
		}else {
			System.out.println(ar[minIndex]);	
		}		

	}

	private static int getMinimumIndex(int[] ar, int low, int high) {
		int mid = low+ (high -low) / 2;
		if (ar[mid + 1] < ar[mid] ) {
			return mid+1;
		}
		if (ar[mid - 1] > ar[mid] ) {
			return mid;
		}
		if (ar[high] > ar[mid])
			return getMinimumIndex(ar, low, mid - 1);
		return getMinimumIndex(ar, mid + 1, high);
	}

}

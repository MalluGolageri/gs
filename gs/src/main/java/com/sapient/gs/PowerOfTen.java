package com.sapient.gs;

public class PowerOfTen {

	public PowerOfTen() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		double n = -1000000;
		boolean negative=false;
		if(String.valueOf(n).charAt(0)=='-') {
			negative=true;
			n=n*-1;
		}		
		System.out.println(isPowerOfTen(n));
	}

	private static boolean isPowerOfTen(double n) {
		if (n < 1) {
			while (n < 1)
				n = n * 10;
		}
		int pow = 1;
		while (pow < n) {
			pow *= 10;
		}
		return pow == n;
	}
}

package com.sapient.gs;

public class AddFractions {

	public static void main(String[] args) {
		int[] f1 = { 2, 5 };
		int[] f2 = { 1, 3 };
		int[] res=addFraction(f1, f2);
		System.out.println(res[0]+"/"+res[1]);
	}

	private static int[] addFraction(int[] f1, int[] f2) {
		int[] res=new int[2];
		int num = f1[0] * f2[1] + f2[0] * f1[1];
		int den = f1[1] * f2[1];

		int gcd = getGcd(num, den);
		res[0]=num/gcd;
		res[1]=den/gcd;
		return res;
	}

	private static int getGcd(int num, int den) {
		int max = Math.max(num, den);
		int min = Math.min(num, den);
		int gcd = 1;
		for (int i = min; i > 0; i--) {
			if (max % i == 0 && min % i == 0)
				return i;
		}
		return gcd;
	}

}

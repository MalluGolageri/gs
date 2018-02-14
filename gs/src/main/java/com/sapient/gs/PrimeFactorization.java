package com.sapient.gs;

import java.io.*;
import java.util.*;

public class PrimeFactorization {

	public static void main(String[] args) {
		int n = 25;
		int[] primeFactors = getPrimeFactors(n);		
	}

	private static int[] getPrimeFactors(int n) {
		List<Integer> list = new ArrayList<Integer>();
		while (n % 2 == 0) {
			list.add(2);
			n =n/ 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				list.add(i);
				n =n/ i;
			}							
		}

		if (n > 2)
			list.add(n);

		int[] res = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+",");
			res[i] = list.get(i);
		}

		return res;
	}
}

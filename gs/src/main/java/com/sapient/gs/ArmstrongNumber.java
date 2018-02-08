package com.sapient.gs;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
	}

	public static boolean isArmstrong(int num) {
		int order = order(num);
		long res = 0;
		int temp = num;
		while (temp > 0) {
			res = res + (int) Math.pow(temp % 10, order);
			temp = temp / 10;
		}
		return res == num;
	}

	public static int order(int num) {
		int order = 0;
		while (num > 0) {
			num = num / 10;
			order++;
		}
		return order;
	}
}

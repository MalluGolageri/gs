package com.sapient.gs;

public class AsciiToInteger {

	public static void main(String[] args) {
		System.out.print(Atoi("263"));		

	}

	public static int Atoi(String str) {
		int res = 0;
		boolean isNegative = false;
		str = str.trim();
		char[] ch = str.toCharArray();
		int index = 0;
		if (ch[index] == '-') {
			isNegative = true;
			index++;
		}

		while (index < ch.length && ch[index] >= '0' && ch[index] <= '9') {
			res = res * 10 + ch[index] - '0';
			index++;
		}
		if (ch.length != index) {
			return 0;
		}

		return isNegative ? -1 * res : res;

	}

}

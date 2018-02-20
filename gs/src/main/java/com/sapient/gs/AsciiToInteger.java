package com.sapient.gs;

public class AsciiToInteger {

	public static void main(String[] args) {
		System.out.println(Atoi("-56657"));				
		System.out.println('2'-'0');		
	}

	public static int Atoi(String str) {
		int res = 0;
		boolean isNegative = false;
		str = str.trim();
		char[] chars = str.toCharArray();
		int index = 0;
		if (chars[index] == '-') {
			isNegative = true;
			index++;
		}
		while (index < chars.length && chars[index] >= '0' && chars[index] <= '9') {
			res = res * 10 + chars[index] - '0';//'1'-'0'=
			index++;
		}
		//123
		//123
		//41=0, 42=1
		
//		if (chars.length != index) {
//			return 0;
//		}
		return isNegative ? -1 * res : res;
	}
	
	
	static int asciiToInteger(int ascNum) {	
		if(ascNum>47 && ascNum < 58) {
			return ascNum-'0';
		}else {
			throw new RuntimeException("It is not a digit");	
		}		
	}


}

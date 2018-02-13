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
			res = res * 10 + chars[index] - '0';
			index++;
		}
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
	
	
	static int atoi(String str) {
		  if (str == null || str.length() < 1)
		    return 0;
		 
		  str = str.trim();
		   int i = 0;
		    double result = 0;
		     while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
		    result = result * 10 + (str.charAt(i) - '0');
		    i++;
		  }
		 
		  return (int) result;
		}

}

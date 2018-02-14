package com.sapient.gs;

public class PowerOfAnother {

	public static void main(String[] args) {		
		System.out.println(isPowerOf(-5,1));				
	}

	private static boolean isPowerOf(int x, int y) {		
		if(x==1) return y==1;		
		int pow=1;		
		while(pow<y) {
			pow=Math.abs(pow*x);
		}
		return pow==y;
	}

}

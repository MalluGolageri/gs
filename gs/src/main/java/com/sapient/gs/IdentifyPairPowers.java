package com.sapient.gs;

public class IdentifyPairPowers {

	public IdentifyPairPowers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,6,7,8,9};		
		for(int i=0;i<ar.length;i++) {
			for ( int j=i+1;i!=j && j<ar.length;j++) {
				if(isPowerOfEachOtherSame(ar[i], ar[j])) {
					System.out.println(ar[i]+","+ar[j]);
				}
			}
		}		
	}
	
	private static boolean isPowerOfEachOtherSame(int x, int y){		
		return Math.pow(x, y)==Math.pow(y, x);
	}

}

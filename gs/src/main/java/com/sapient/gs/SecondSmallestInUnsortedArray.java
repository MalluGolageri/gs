package com.sapient.gs;

public class SecondSmallestInUnsortedArray {
	public static void main(String[] args) {
		int[] ar= {2,3,2,4,-2,-1};	
		int smallest=Integer.MAX_VALUE,secondSmallest=Integer.MAX_VALUE;		
		for(int i:ar) {			
			if(i==smallest) {
				secondSmallest=i;
			}else if(i<smallest) {
				secondSmallest=smallest;
				smallest=i;
			}else if(i<secondSmallest){
				secondSmallest=i;
			}
		}
		System.out.println("Second Smallest:"+secondSmallest);
	}
}

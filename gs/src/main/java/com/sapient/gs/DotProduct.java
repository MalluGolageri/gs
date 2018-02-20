package com.sapient.gs;


public class DotProduct {
	public static void main(String[] args) {				
		int[][] a1= {
				{2,3,4},
				{4,5,6},
				
		};
	
		int[][] a2= {
				{2,3,4,8},
				{4,5,6,7},
				{1,2,3,3},
		};
		
		int[][] r={
				{4+12+4, 6+15+8,8+18+12,16+21+12,16+21+12},
				{1,2,3,4},
				
		};
		
		dotProduct(a1,a2);
		
	}

	private static void dotProduct(int[][] a1, int[][] a2) {			
		int m1=a1.length;
		int n1=a1[0].length;
		int m2=a2.length;
		int n2=a2[0].length;
		int[][] res=new int[m1][n2];
		for (int i=0;i<m1;i++) {			
			for(int j=0;j<n2;j++) {				
				for(int k=0;k<n1;k++) {
					res[i][j]+= a1[i][k] *a2[k][j];					
				}
			System.out.print(res[i][j]+" ");	
			}
			System.out.println();			
		}		
	}
}

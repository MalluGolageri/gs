package com.sapient.gs;

public class PascalTriangle {
	public static void main(String[] args) {
	    int DEFAULT_ROWS = 10;
	    int row = 5;
	    int col = 2;
	    int element  = getElementFromPascalTree(DEFAULT_ROWS,col,row);
	    System.out.println("At row:"+row+", position:"+col+"-->"+element);
	  }
	  
	  static int getElementFromPascalTree(int default_rows,int col,int row){
	      if(col > row){
	          return 0;
	      }
	      if(col == 0 || row == col){
	        return 1;
	      }
	      return getElementFromPascalTree(default_rows,col,row-1) + 
	    		  getElementFromPascalTree(default_rows,col-1,row-1);
	  }
}

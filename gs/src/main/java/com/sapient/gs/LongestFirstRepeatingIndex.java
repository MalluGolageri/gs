package com.sapient.gs;

public class LongestFirstRepeatingIndex {


	public static void main(String[] args) {

		String s="aabbbc";
	    char[] chars=s.toCharArray();
	    int startIndex=0,index=0,maxLength=0;
	    
	    for(int i=0;i<chars.length;) {
	      int len=0;
	      index=i;
	      char c=chars[i];
	      while(i<chars.length && chars[i]==c) {              
	        i++;
	        len++;        
	      }	           
	      if(maxLength<len){
	        maxLength=len; 
	        startIndex=index;
	      }    
	    }
	    
	    System.out.println("Longest repeating string:"+ startIndex +","+maxLength);
	}

}

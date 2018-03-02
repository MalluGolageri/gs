package com.sapient.gs;

public class LargestPalindromeInString {
	public static void main(String[] args) {
	    	    
	    System.out.println(largestPalindromeString("abcbabgadagxyz"));
	    System.out.println(largestPalindromeString("221233214569"));
	    System.out.println(largestPalindromeString("hellow"));
	    System.out.println(largestPalindromeString("mmmm11111"));
	  }
	  
	  private static String largestPalindromeString(String str){	   
	    int start=0,end=0;    
	    String largestPal="";	    
	    for(int i=1;i<str.length();i++){	     
	      start=i-1;
	      end=i+1;
	      
	      //handle odd length palindrome
	      while(start >=0 && end < str.length() && str.charAt(start)==str.charAt(end)){        
	        String pal=str.substring(start,end+1);
	        largestPal = pal.length() > largestPal.length() ? pal : largestPal;        
	        start--;
	        end++;        
	      }
	    //handle even length palindrome
	      start=i-1;
	      end=i;
	      while(start >=0 && end < str.length() && str.charAt(start)==str.charAt(end)){
	        String pal=str.substring(start,end+1);
	        largestPal = pal.length() > largestPal.length() ? pal : largestPal;
	        start--;
	        end++;        
	      }
	    }
	    
	    return largestPal;
	  }

}

package com.sapient.gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDistanceBWTwoWords {
	
	public static void main(String[] args) {	    
	    String s="ABC is      XYZ heyy ABC";	    
	    System.out.println(getMinimumDistance(s,"ABC","XYZ"));
	  }
	  
	  private static int getMinimumDistance(String s,String w1,String w2){	    
	    int pos1=0,pos2=Integer.MAX_VALUE,distance=0,minDistance=Integer.MAX_VALUE;
	    String[] words=s.split("\\s+");  	    
	    for(String word:words){     
	      if(word.equals(w1)){
	        pos1=s.lastIndexOf(word) + (int) Math.ceil(word.length()/2.0);        
	      }if(word.equals(w2)){
	         pos2=s.lastIndexOf(word) + (int) Math.ceil(word.length()/2.0);        
	      }
	         
	      distance=pos2-pos1;
	      if(distance<0)
	         distance=distance*-1;
	      if(distance<minDistance)
	         minDistance=distance;              
	    }
	    return minDistance;
	  }
	  

}

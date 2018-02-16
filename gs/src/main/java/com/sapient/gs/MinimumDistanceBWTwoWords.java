package com.sapient.gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDistanceBWTwoWords {
	public static void main(String[] args) {
	    
	    String s="heyy how    are you ? how you are doing?";
	    String w1="how",w2="are";    
	    System.out.println(getMinDIstance(s,w1,w2));
	  }
	  
	  private static int getMinDIstance(String s, String w1,String w2){   
	    String words[]=s.split(" ");
	    //System.out.println("words length:"+words.length);
	    int d1=0,d2=Integer.MAX_VALUE,minDistance=Integer.MAX_VALUE,cur=0;
	    for(String word:words){ 
	      if(word.equals(" ")) cur++;
	      if(word.equals(w1)){
	        d1=cur + (int) Math.ceil(word.length()/2);                
	      }
	      if(word.equals(w2)){
	        d2=cur+ (int) Math.ceil(word.length()/2);               
	      }      
	      int dist=Math.abs(d2-d1);
	      if(dist<minDistance)
	          minDistance=dist;      
	      cur=cur+word.length()+1;
	    }  
	    
	    
	    return minDistance;
	  }
}

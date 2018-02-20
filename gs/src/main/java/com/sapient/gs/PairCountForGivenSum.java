package com.sapient.gs;

import java.util.*;

public class PairCountForGivenSum {
	public static void main(String[] args) {
	    
	    int[] input = {-2,8,5,3,-4,-14,-9};
	    int sum = -6;
	    int countOfPairs  = getCountOfPairsForTheGivenSum(input,sum);
	    System.out.println("Pair count:"+countOfPairs);
	    
	    }

	  static int getCountOfPairsForTheGivenSum(int[] input,int sum){	    
	    Map<Integer,Integer> map = new HashMap<Integer, Integer>();
	    int length = input.length;
	    int count= 0;
	    
	    if(length<2){
	     System.out.println("Input array length is less than 2.");
	       return 0;
	    }
	    //store numbers from input array into map
	    for(int i=0; i<length;i++){
	      int key = input[i];
	      if(!map.containsKey(key)){
	          map.put(key,1);
	      }else{
	        map.put(key,map.get(key)+1);
	      }
	    }
	    
	    //check for the sum - numbers in array to find the count
	    for(int i=0; i<length;i++){
	      int remainingSum = sum-input[i];
	      if(map.containsKey(remainingSum))
	          count++;
	    }
	    
	    return count/2;
	  }
}

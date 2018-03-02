package com.sapient.gs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageGradeProblem {

	//He got the same 2 programs which I got, we know the solution, jus
	//Remove whole stuff and keep your original code
	public static void main(String[] args) {
		//System.out.println(Integer.parseInt("-34"));
		//String[][] scores = { { "sobby", "87" }, { "arush", "37" }, { "charles", "22" }, { "tony", "20" },
		//		{ "tony", "20" }, { "tony", "250" } };
		String[][] scores= {{"a","-20"},{"b","-10"},{"a","50"}};
		
		Map<String, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < scores.length; i++) {
			String name = scores[i][0];
			int score = Integer.parseInt(scores[i][1]);
			if (!map.containsKey(name)) {			
				List<Integer> marks=new ArrayList<>();				
				marks.add(score);
				map.put(name, marks);								
			} else {
				List<Integer> marks = map.get(name);				
				marks.add(score);
				map.put(name, marks);				
			}
		}
		// 
//tests
		float bestAverage = Integer.MIN_VALUE; //this will straight away work, 
		for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
			List<Integer> sd = entry.getValue();
			int totalScore=0;
			for(int score:sd)  {
				totalScore+=score;			
			}
			float average = totalScore / sd.size();
			if (bestAverage < average) {
				bestAverage = average;				
			}
		}
		System.out.println(" best grade:" +(int) Math.floor(bestAverage));
	}
	
	//just click on link and open in IE 

}

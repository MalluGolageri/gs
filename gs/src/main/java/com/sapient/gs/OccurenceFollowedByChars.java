package com.sapient.gs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceFollowedByChars {
	public static void main(String[] args) {
		String s = "SSSSSTTPPQGUG";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char key=s.charAt(i);
			map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
		}		
		map.forEach((key,value)->{System.out.print(""+value+key);});
		System.out.println();
		countChars(s);
	}
	
	private static void countChars(String s) {		
		for(int i=0;i<s.length();) {
			int len=0;
			char c=s.charAt(i);
			while(i<s.length() && c==s.charAt(i)) {
				i++;
				len++;
			}
			System.out.print(""+len+c);
		}
	}
}

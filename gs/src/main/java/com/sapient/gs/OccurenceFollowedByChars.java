package com.sapient.gs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceFollowedByChars {
	public static void main(String[] args) {
		String s = "SSSSSTTPPQ";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) + 1 : 1);
		}		
		map.forEach((key,value)->{System.out.print(""+value+key);});
	}
}

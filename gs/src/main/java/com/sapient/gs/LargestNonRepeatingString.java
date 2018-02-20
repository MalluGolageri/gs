package com.sapient.gs;

import java.util.*;

public class LargestNonRepeatingString {
	public static void main(String[] args) {
		String str = "aaabcbdeaff ";
		System.out.println(largestStringwithUniquechar(str));
	}  

	public static String largestStringwithUniquechar(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		int maxlen = 0;
		int startindex = 0;		
		for (int i = 0; i < ch.length;) {
			int index = i;
			int len = 0;
			while (i < ch.length && !map.containsKey(ch[i])) {
				map.put(ch[i], i);
				len++;
				i++;
			}
			
			if (maxlen < len) {
				maxlen = len;
				startindex = index;
			}
			
			if (i < ch.length) {
				i = map.get(ch[i]) + 1;
			}
			map.clear();
		}
		return str.substring(startindex, startindex + maxlen);
	}

}

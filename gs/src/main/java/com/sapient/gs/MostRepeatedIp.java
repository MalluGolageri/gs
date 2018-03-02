package com.sapient.gs;

import java.util.*;
import java.util.function.Predicate;

public class MostRepeatedIp {
	public static void main(String[] args) {

		String[] s = { "10.0.0.1-frank [10/dec/17 10:14:27]", "10.0.0.1-frank [10/dec/17 10:14:28]",
				"10.0.0.2-nancy [10/dec/17 10:14:28]", "10.0.0.1-frank [10/dec/17 10:14:27]" };
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = 0; i < s.length; i++) {
			int sp_index = s[i].indexOf('-');			
			String ip = s[i].substring(0, sp_index);			
			hashMap.put(ip, hashMap.containsKey(ip) ? hashMap.get(ip) + 1 : 1);
		}
		
		
		
		//System.out.println(hashMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());		
	}
}

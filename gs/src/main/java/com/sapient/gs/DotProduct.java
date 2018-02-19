package com.sapient.gs;

import java.util.LinkedHashMap;
import java.util.Map;

public class DotProduct {
	public static void main(String[] args) {		
		String s="vsjhvjjk";
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for (char c:s.toCharArray()) map.put(c, map.containsKey(c)?map.get(c)+1:1);					
		System.out.println(map.entrySet().stream().filter(e->e.getValue()==1).findFirst().get().getKey());
	}
}

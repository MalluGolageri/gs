package com.sapient.gs;

import java.util.*;

public class FirstUniqueCharacterInWord {

	public static void main(String[] args) {
		System.out.println(firstUniqueCharacter("abcdabefg"));	
	}

	private static char firstUniqueCharacter(String string) {		
		Set<Character> repeating=new HashSet<Character>();
		List<Character> nonRepeating=new ArrayList<Character>();		
		for(char c:string.toCharArray()) {			
			if(repeating.contains(c)) {
				continue;
			}
			if(nonRepeating.contains(c)) {
				repeating.add(c);
				nonRepeating.remove((Character)c);
			}else {
				nonRepeating.add(c);
			}
		}		
		return nonRepeating.get(0);
	}
}

package com.sapient.gs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueTuples {

	public static void main(String[] args) {
		String s="abcdef";
		printUniqueTuples(s, 2);
	}

	private static void printUniqueTuples(String s,int n) {
		Set<String> uniqueTuples=new LinkedHashSet<>();		
		for(int i=0;i<=(s.length()-n);i++) uniqueTuples.add(s.substring(i, n+i));
		uniqueTuples.forEach(System.out::println);
	}
}

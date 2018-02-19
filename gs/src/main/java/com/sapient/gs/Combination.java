package com.sapient.gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
public class Combination {
	static HashSet<String> set = new HashSet<String>();
	static String[] arr = { "to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana" };
	static HashSet<String> dictionary = new HashSet<String>(Arrays.asList(arr));

	// this ll list down all possible combination of String i.e;
	// {abc}-{abc,acb,bac,bca,cab,cba}
	static void permute(char[] chars, int k) {
		if (k == chars.length) {
			String str = "";
			for (int i = 0; i < chars.length; i++) {
				str = str + chars[i];
			}
			System.out.print(str);
			combination(str.toCharArray());
			System.out.println();
		} else {
			for (int i = k; i < chars.length; i++) {
				char temp = chars[k];
				chars[k] = chars[i];
				chars[i] = temp;
				permute(chars, k + 1);
				temp = chars[k];
				chars[k] = chars[i];
				chars[i] = temp;
			}
		}
	}

	// from each String it ll find sub string from begining i.e abcd- a, ab, abc
	// ,abcd
	// permute and comination method ll provide all possiable combination.....
	static void combination(char[] ch) {
		String str = "";
		for (int i = 0; i < ch.length; i++) {
			str = str + ch[i];
			if (dictionary.contains(str))
				set.add(str);
		}
	}

	public static void main(String rgs[]) {
		String str = "dsetog";
		permute(str.toCharArray(), 0);
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() > s2.length()) {
					return 1;
				} else if (s1.length() < s2.length()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		System.out.println(list);
	}
}
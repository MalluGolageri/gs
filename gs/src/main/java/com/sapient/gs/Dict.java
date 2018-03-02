package com.sapient.gs;

import java.util.HashSet;
import java.util.List;

public class Dict {
	static HashSet<String> dictionary = new HashSet<String>();
	static HashSet<String> set = new HashSet<String>();
	static HashSet<String> total = new HashSet<String>();
	static int tot = 0;

	static void combination(char[] all, String comb, String indices) {
		for (int i = 0; i < all.length; i++) {
			String flag = comb;
			String index = indices;
			if (!index.contains(i + "")) {
				index = index + i;
				flag = flag + all[i];
				// System.out.println(flag);
				// total.add(flag);
				tot++;
				if (dictionary.contains(flag))
					set.add(flag);
				combination(all, flag, index);
			}

		}
	}

	public static void main(String arg[]) {
		String str = "abc";
		char[] all = str.toCharArray();		
		dictionary.add("ab");
		dictionary.add("cb");
		dictionary.add("sky");
		dictionary.add("rat");		
		combination(all, "", "");
		System.out.println(set);
		System.out.println("count " + tot);

	}
}

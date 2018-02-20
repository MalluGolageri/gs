package com.sapient.gs;

import java.util.HashSet;
import java.util.Set;

public class PermutationsOfString {
	
	static Set<String> words=new HashSet<>();
	public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        PermutationsOfString permutation = new PermutationsOfString();
        permutation.permute(str, 0, n-1);
        System.out.println("=======");
        words.forEach(System.out::println);
    }
 
    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    private void permute(String str, int l, int r)
    {
        if (l == r) {
            System.out.println(str);
        		words.add(str);
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
 
}

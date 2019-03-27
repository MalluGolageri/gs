package com.sapient.gs;

public class LargestPalindromeInString {

    public static void main(String[] args) {
        System.out.println(largestPalindromeString("abcbabgadagxyz"));
        System.out.println(largestPalindromeString("221233214569"));
        System.out.println(largestPalindromeString("hellow"));
        System.out.println(largestPalindromeString("mmmm11111"));
        System.out.println(largestPalindromeString("bnmmdf"));
    }

    private static String largestPalindromeString(String str) {
        String largestPal = "";
        for (int i = 1; i < str.length(); i++) {
            //for even
            largestPal = getLargestPal(str, i - 1, i + 1, largestPal);

            //for odd
            largestPal = getLargestPal(str, i - 1, i, largestPal);
        }
        return largestPal;
    }

    private static String getLargestPal(String str, int start, int end, String largestPal) {
        while (start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            String pal = str.substring(start, end + 1);
            largestPal = pal.length() > largestPal.length() ? pal : largestPal;
            start--;
            end++;
        }
        return largestPal;
    }

}

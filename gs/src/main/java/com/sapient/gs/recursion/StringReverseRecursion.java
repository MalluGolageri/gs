package com.sapient.gs.recursion;

public class StringReverseRecursion {
    public static void main(String[] args) {
        String s = "dummy";
        System.out.println(reverse(s, ""));
    }

    private static String reverse(String s, String res) {
        if (s.length() == 0) return res;
        res += reverse(s.substring(0, s.length() - 1), "" + s.charAt(s.length() - 1));
        return res;
    }
}

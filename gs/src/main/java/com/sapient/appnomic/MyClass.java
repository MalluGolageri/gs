package com.sapient.appnomic;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static String m(MyClass o1, MyClass o2) {
	    String s1 = o1 == o2 ? "T" : "F";
	    String s2 = o1.equals(o2) ? "T" : "F";
	    String s3 = o1.hashCode() == o2.hashCode() ? "T" : "F";
	    return s1 + s2 + s3;
	}
}

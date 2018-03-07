package com.sapient.appnomic;

public class Exc {

	public static void main(String[] args) {

		try {
		    int c = 1/0;
		} catch (Exception e) {
		    System.out.println("E");
		} finally {
		    System.out.println("F");
		}
	}

	
}

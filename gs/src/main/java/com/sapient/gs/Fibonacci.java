package com.sapient.gs;

public class Fibonacci {

	public Fibonacci() {
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fib(n));
	}

	static int fib(int n) {
//		if (n <= 1) return n;
//		return fib(n - 1) + fib(n - 2);		
		int f1 = 0, f2 = 1, f3;
        if (n == 0) return f1;
        for (int i = 2; i <= n; i++)
        {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f2;
	}	
}

//1 1 2 3 5 8 13 21 34

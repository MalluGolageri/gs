package com.sapient.gs;

public class NewtonRaphsonSquareRoot {

	public NewtonRaphsonSquareRoot() {

	}

	public static void main(String[] args) {
		float sqroot = 0;
		float f = 25;
		float temp = f / 2;
		while (f > 0) {
			sqroot = temp - ((temp * temp - f) / (2 * temp));
			float absValue = Math.abs(sqroot - temp);
			if (absValue < .0001) {
				System.out.println("sqroot:" + sqroot);
				break;
			} else {
				temp = sqroot;
			}
		}
	}
}

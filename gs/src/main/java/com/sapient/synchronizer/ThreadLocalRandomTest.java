package com.sapient.synchronizer;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomTest {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(ThreadLocalRandom.current().nextInt(0, 100));
		}
	}

}

package com.sapient.synchronizer;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueTest {

	ConcurrentLinkedQueue<String> que = new ConcurrentLinkedQueue<String>();

	public void producer() {

		System.out.println("Producer Started");
		try {
			for (int i = 1; i < 10; i++) {
				que.add("String" + i);
				System.out.println("Added: String" + i);
				Thread.currentThread().sleep(200);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void consumer() {

		String str;
		System.out.println("Consumer Started");
		
		for (int x = 0; x < 10; x++) {
			while ((str = que.poll()) != null) {
				System.out.println("Removed >>>>> " + str);
			}
			try {
				Thread.currentThread().sleep(200);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		final ConcurrentLinkedQueueTest obj = new ConcurrentLinkedQueueTest();

		Thread t1 = new Thread() {			
			public void run() {
				obj.producer();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				obj.consumer();
			}
		};

		t1.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();

	}

}

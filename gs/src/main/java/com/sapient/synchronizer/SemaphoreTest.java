package com.sapient.synchronizer;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	public void test(Semaphore semaphore) {

		try {
			semaphore.acquire();
			System.out.println("Hello " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		} catch (InterruptedException ie) {
		} finally {
			semaphore.release();
			System.out.println("Goodbye " + Thread.currentThread().getName());
		}

	}

	public static void main(String args[]) {

		final Semaphore semaphore = new Semaphore(2);
		final SemaphoreTest semaphoreTest = new SemaphoreTest();

		Thread t1 = new Thread() {
			@Override
			public void run() {
				semaphoreTest.test(semaphore);
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				semaphoreTest.test(semaphore);
			}
		};

		Thread t3 = new Thread() {
			@Override
			public void run() {
				semaphoreTest.test(semaphore);
			}
		};

		Thread t4 = new Thread() {
			@Override
			public void run() {
				semaphoreTest.test(semaphore);
			}
		};

		t1.start();
		t1.setName("T1");
		t2.start();
		t2.setName("T2");
		t3.start();
		t3.setName("T3");
		t4.start();
		t4.setName("T4");

	}

}

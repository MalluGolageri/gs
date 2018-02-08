package com.sapient.synchronizer;
public class ThreadLocalTest {

	private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

	public void test(int number) {
		threadLocal.set(number);
		System.out.println(Thread.currentThread().getName() + "  >>>>> " + threadLocal.get());
	}

	public static void main(String[] args) throws InterruptedException {

		final ThreadLocalTest obj = new ThreadLocalTest();

		Thread t1 = new Thread() {
			@Override
			public void run() {
				obj.test(100);
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				obj.test(200);
			}
		};

		Thread.sleep(1000);
		Thread t3 = new Thread() {
			@Override
			public void run() {
				obj.test(300);
			}
		};

		Thread t4 = new Thread() {
			@Override
			public void run() {
				obj.test(400);
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

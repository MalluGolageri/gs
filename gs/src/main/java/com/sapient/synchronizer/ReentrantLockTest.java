package com.sapient.synchronizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLockTest {
	
	ReentrantLock lock = new ReentrantLock();

	public void test() {
		/*
		 * lock.lock(); try {
		 * System.out.println("Thread Name"+Thread.currentThread().getName()); } catch
		 * (Exception e) { e.printStackTrace(); } finally { lock.unlock(); }
		 */

		/*
		 * if(lock.tryLock()) { try { Thread.sleep(1000);
		 * System.out.println("Thread Name"+Thread.currentThread().getName()); } catch
		 * (Exception e) { e.printStackTrace(); } finally { lock.unlock(); }
		 * 
		 * } else { System.out.println("Else Block "); }
		 * 
		 * }
		 */

		try {
			if (lock.tryLock(5000, TimeUnit.MILLISECONDS)) {
				try {
					Thread.sleep(1000);
					System.out.println("Thread Name" + Thread.currentThread().getName());
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}

			} else {
				System.out.println("Else Block ");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		final ReentrantLockTest obj = new ReentrantLockTest();

		for (int i = 0; i < 10; i++) {

			Thread t1 = new Thread() {
				public void run() {
					obj.test();
				}
			};

			t1.start();

		}

	}

}

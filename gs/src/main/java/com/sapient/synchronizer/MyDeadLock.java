package com.sapient.synchronizer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyDeadLock {

	private static void test1() {
	    final Object lock1 = new Object();
	    final Object lock2 = new Object();
	 
	    Thread thread1 = new Thread(new Runnable() {
	        public void run() {
	            synchronized (lock1) {
	                System.out.println("Thread1 acquired lock1");
	                try {
	                    TimeUnit.MILLISECONDS.sleep(50);
	                } catch (InterruptedException ignore) {}
	                synchronized (lock2) {
	                    System.out.println("Thread1 acquired lock2");
	                }
	            }
	        }
	 
	    });
	    thread1.start();
	 
	    Thread thread2 = new Thread(new Runnable() {
	         public void run() {
	            synchronized (lock2) {
	                System.out.println("Thread2 acquired lock2");
	                try {
	                    TimeUnit.MILLISECONDS.sleep(50);
	                } catch (InterruptedException ignore) {}
	                synchronized (lock1) {
	                    System.out.println("Thread2 acquired lock1");
	                }
	            }
	        }
	    });
	    thread2.start();
	    detectDeadlock1();
	}
	
	
	
	private static void test2() {
	    final ReentrantLock lock1 = new ReentrantLock();
	    final ReentrantLock lock2 = new ReentrantLock();
	 
	    Thread thread1 = new Thread(new Runnable() {
	         public void run() {
	            try {
	                lock1.lock();
	                System.out.println("Thread1 acquired lock1");
	                try {
	                    TimeUnit.MILLISECONDS.sleep(50);
	                } catch (InterruptedException ignore) {}
	                lock2.lock();
	                System.out.println("Thread1 acquired lock2");
	            }
	            finally {
	                lock2.unlock();
	                lock1.unlock();
	            }
	        }
	    });
	    thread1.start();
	 
	    Thread thread2 = new Thread(new Runnable() {
	        public void run() {
	            try {
	                lock1.lock();
	                System.out.println("Thread2 acquired lock2");
	                try {
	                    TimeUnit.MILLISECONDS.sleep(50);
	                } catch (InterruptedException ignore) {}
	                lock2.lock();
	                System.out.println("Thread2 acquired lock1");
	            }
	            finally {
	                lock1.unlock();
	                lock2.unlock();
	            }
	        }
	    });
	    thread2.start();
	 
	    // Wait a little for threads to deadlock.
	    try {
	        TimeUnit.MILLISECONDS.sleep(100);
	    } catch (InterruptedException ignore) {}
	 
	    detectDeadlock2();
	}

	private static void detectDeadlock1() {
	    ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
	    long[] threadIds = threadBean.findMonitorDeadlockedThreads();
	    int deadlockedThreads = threadIds != null? threadIds.length : 0;
	    System.out.println("Number of deadlocked threads: " + deadlockedThreads);
	}
	
	
	private static void detectDeadlock2() {
	    ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
	    long[] threadIds = threadBean.findDeadlockedThreads();
	    int deadlockedThreads = threadIds != null? threadIds.length : 0;
	    System.out.println("Number of deadlocked threads: " + deadlockedThreads);
	}
	
	public static void main(String[] args) {
		MyDeadLock.test2();
	
	}
	
}

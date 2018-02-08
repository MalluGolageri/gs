package com.sapient.synchronizer;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest implements Runnable {
	
	CountDownLatch obj = null;
	String[] items = null;
	
	public CountDownLatchTest (CountDownLatch obj , String[] items){
		this.obj = obj;
		this.items=items;
	}
	public CountDownLatchTest (){
		
	}
	

	public void run() {
		
		for(int i=0;i<items.length;i++) {
			System.out.println(" Item Name >>> "+ items[i] +" &&  count >>>> " + obj.getCount());
			try {
				Thread.sleep(2000);
				obj.countDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		//System.out.println(Thread.currentThread().getName()+"Done");
		}
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		String[] items = new String[] {"Upma", "Idly" , "Tea"};
		
		final CountDownLatch obj = new CountDownLatch(items.length);
		
		Thread t1= new Thread(new CountDownLatchTest(obj ,items));
	//	t1.setName("Thread 1");
		t1.start();
		try {
			System.out.println("Order is received and being processed");
			obj.await();
			System.out.println("Order has been processed");
		} catch (Exception e) {
			
		}
	
		
		
	}
	
	
}

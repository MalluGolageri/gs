package com.sapient.synchronizer;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ReadWriteLockTest {

	public static void main(String[] args) {

		ExecutorService exeservice = Executors.newFixedThreadPool(3);
		try {
			final ReadWriteLockImpl obj = new ReadWriteLockImpl();

			exeservice.submit(new Runnable() {			
				public void run() {
					for(int i=0; i<=50; i++) {
						obj.increment(i);
					}
					System.out.println("Writing Map >>>>>");
				}
			});

			exeservice.awaitTermination(1,TimeUnit.SECONDS);

			exeservice.submit(new Runnable() {				
				public void run() {
					Map<Integer , Integer> map = obj.get();
						System.out.println("Read Map >>>>>" + map);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			exeservice.shutdown();
		}

	}

}

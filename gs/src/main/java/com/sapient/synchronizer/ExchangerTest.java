package com.sapient.synchronizer;
import java.util.concurrent.Exchanger;

public class ExchangerTest {

	Exchanger<String> exchanger;
	String obj;

	ExchangerTest(Exchanger<String> exchanger) {
		this.exchanger = exchanger;
	}

	public void test(String obj) {
		try {

			this.obj = obj;
			
			String previousMsg = this.obj;
			String newMessage = exchanger.exchange(this.obj);
			
			System.out.println(Thread.currentThread().getName() + " >>>>>  exchanged  >>>>>" + previousMsg + " >>>> looking  for >>>>  " + newMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		Exchanger<String> exchanger = new Exchanger<String>();
		final ExchangerTest exchangerTest = new ExchangerTest(exchanger);

		Thread t1 = new Thread() {			
			public void run() {
				exchangerTest.test("A");
			}
		};

		Thread t2 = new Thread() {			
			public void run() {
				exchangerTest.test("B");
			}
		};

		t1.start();
		t1.setName("TA");

		t2.start();
		t2.setName("TB");

	}
}

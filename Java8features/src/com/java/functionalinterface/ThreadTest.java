package com.java.functionalinterface;

public class ThreadTest {

	public static void main(String[] args) {
		Runnable rb = ()->{
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+" : "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(rb);
		Thread t2 = new Thread(rb);
		t1.start();
		t2.start();
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

	}
	
	

}

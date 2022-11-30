package com.java.functionalinterface;

public class MyThread {

	public static void show() {
		for(int i=0;i<5;i++) {
			System.out.println("Show -- "+Thread.currentThread().getName()+" : "+i);
		}
	}
	public void display() {
		for(int i=0;i<5;i++) {
			System.out.println("Display --"+Thread.currentThread().getName()+" : "+i);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		
		Runnable rb = ()->{
			for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName()+" : "+i);
			}
		};
		Thread t1 = new Thread(rb);
		t1.start();
		
		new Thread(rb).start();
		new Thread(MyThread::show).start();
		
		Thread t4 = new Thread(MyThread::show);
		t4.start();
		new Thread(new MyThread()::display).start();
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}

	}

}

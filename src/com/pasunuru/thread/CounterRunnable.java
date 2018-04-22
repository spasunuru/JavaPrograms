package com.pasunuru.thread;

public class CounterRunnable implements Runnable {

	public void run() {
		// TODO Auto-generated method stub

	}

	
	public static void main(String[] args) {
		Thread t1 = new Thread(new CounterRunnable());
		Thread t2 = new Thread(new CounterRunnable());
		
		t1.start();
		t2.start();
	}

}

package com.pasunuru.thread;

public class Counter  extends  Thread {
	
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Counter();
		Thread t2 = new Counter();
		
		t1.start();
		t2.start();
	}

}
package com.pasunuru.thread;

public class ProducerConsumer {
	
	int counter;
	
	public synchronized void consume() {
		if (counter == 0){
			try{
				wait();
			}catch (Exception e) {
				
			}
		}
		counter--;
	}

	public synchronized void produce() {
		counter++;
		notifyAll();
	}
}

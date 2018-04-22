package com.pasunuru.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExSum implements Callable<String> {
	private static final int NO_OF_THREADS = 3;
	int maxNumber;

	public ExecutorExSum(int maxNumber) {
		this.maxNumber = maxNumber;
	}

	public String call() {
		int sum = 0;
		for (int i = 0; i <= maxNumber; i++) {
			sum += maxNumber;
		}
		return Thread.currentThread().getName() + " count is " + sum;
	}

	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(NO_OF_THREADS);
		List<Future<String>> list = new ArrayList<Future<String>>(10);

		for (int i = 10000; i < 10100; i++) {
			Callable<String> worker = new ExecutorExSum(i);
			Future<String> submit = executor.submit(worker);
			list.add(submit);
		}
		for (Future<String> future : list) {
			try {
				System.out.println("Thread " + future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		executor.shutdown();
		System.out.println("Finished all threads");
	}

}

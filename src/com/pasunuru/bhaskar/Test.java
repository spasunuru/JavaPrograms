package com.pasunuru.bhaskar;


public class Test {

	public static void main(String[] args) {
		
		ResourceProvider myResourceProvider = ResourceProvider.getResourceProvider();
		System.out.println(myResourceProvider.getUsedCount());
		for (int i = 0; i < 10000; i++) {
			
			new Thread(new Runnable() {
				   public void run() {
				    new Consumer().useMyResource();
				   }
				}).start();
			
		}
		
	}
}

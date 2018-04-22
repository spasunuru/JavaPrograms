package com.pasunuru.designpatterns;

public class LazySingltonWithStaticHolder {
	
	private static class LazyHolder {
		private static final LazySingltonWithStaticHolder myConnection = new LazySingltonWithStaticHolder();
	}
	
	private LazySingltonWithStaticHolder() {
	}

	public static final LazySingltonWithStaticHolder getConnection() {
		return LazyHolder.myConnection;
	}

	
	public static void main(String[] args) {
		System.out.println(LazySingltonWithStaticHolder.getConnection());
	}
}
package com.pasunuru.designpatterns;

public class LazySingltonDoubleLock {
	
	private static LazySingltonDoubleLock onlyOne;
	
	private LazySingltonDoubleLock(){
	}
	
	public static LazySingltonDoubleLock getInstance() {
		if(onlyOne == null){
			synchronized(LazySingltonDoubleLock.class){
				if (onlyOne == null) //to optimize the programe
					onlyOne = new LazySingltonDoubleLock();
			}
		} 
		return onlyOne;
	}
	
	public static void main(String args[]){
		LazySingltonDoubleLock.getInstance();
	}
	

}

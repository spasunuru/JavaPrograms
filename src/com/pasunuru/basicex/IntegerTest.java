package com.pasunuru.basicex;


public class IntegerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		System.out.println(i1 == i2);
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println("i1 != i2 - " + (i1 != i2));
		System.out.println("i1 <= i2-"+ (i1 <= i2));
		System.out.println("i1 >= i2-"+ (i1 >= i2));
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
	
		System.out.println("s1==s2-" + (s1==s2));
		System.out.println("s1!=s2-" + (s1!=s2));
		
		
	}

}

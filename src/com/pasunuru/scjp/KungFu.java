package com.pasunuru.scjp;

public class KungFu {
	public static void main(String[] args) {
		Integer x = 400;
		Integer y = x;
		x++;
		StringBuilder sb1 = new StringBuilder("123");
		StringBuilder sb2 = sb1;
		System.out.println(sb2.toString());
		sb1.append("5");
		sb1.append("6");
		
		System.out.println((x == y) + " " + (sb1 == sb2));
		System.out.println(sb2.toString());
		
	}
}
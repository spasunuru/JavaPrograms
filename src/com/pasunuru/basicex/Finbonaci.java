package com.pasunuru.basicex;

public class Finbonaci {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int current = n1 + n2;
		for (int i = 0; i <= 5; i++) {
			System.out.println(current);
			n1 = n2;
			n2 = current;
			current = n1 + n2;
			
		}
	}
}

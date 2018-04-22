package com.pasunuru.stringex;

public class MissingElement {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		int asum = 0, sum = 0;
		
		for (int i = 1; i <= 10; i++)
			sum = sum + i;
		
		for (int i = 0; i < a.length; i++)
			asum = asum + a[i];
		int missnum = sum - asum;
		System.out.println("Missing Number" + missnum);
	}

}

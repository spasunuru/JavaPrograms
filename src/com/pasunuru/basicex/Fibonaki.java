package com.pasunuru.basicex;

public class Fibonaki {

	public static void main(String[] args) {
		int a =0;
		int b= 1;
		int sum = a+b;
		for(int i=0;i<5;i++) {
			System.out.println(sum);
			a =b;
			b=sum;
			sum = a+b;
		}
	}

}

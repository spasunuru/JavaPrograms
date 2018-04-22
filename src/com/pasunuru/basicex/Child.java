package com.pasunuru.basicex;


public class Child extends Parent{

	int a= 20;
	int b = 20;
	
	public int add () {
		return a+b;
	}
	
	private void print() {
		System.out.println("Hello child");
	}
	
	

public static void main(String args[]) {
	Parent p = new Child();
	int c = p.add();
	
	System.out.println(c);
	

	}
}

package com.pasunuru.stringex;

public class StringExample {

	public String reverseRecursive(String one) {
		if (one.length() < 2) {
            return one;
        }
        return reverseRecursive(one.substring(1)) + one.charAt(0);
	}
	
	public void reverseIterative(String one) {
		char[] oneChar = one.toCharArray();
		StringBuilder oneSb = new StringBuilder();
		for(int i=oneChar.length-1; i>=0; i--){
			oneSb.append(oneChar[i]);
		}
		System.out.println(oneSb);
	}
	

	public void stringMethods(String one) {
		System.out.println("'Hello'.substring(2): "+one.substring(2));
		System.out.println("'Hello'.charAt(0): " + one.charAt(0));
	}
	
	public void stringSpace(String one) {
		char[] str1Char = one.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char ch: str1Char) {
			if (ch == " ".toCharArray()[0])
				sb.append("%20%");
			else
			sb.append(ch);
		}
		System.out.println(sb);
	}
	
	public void stringPool() {
		String one = "Hello";
		String two = new String("Hello");

		System.out.println("one == two before intern---"+ (one == two));
		String three = two.intern();
		System.out.println("one.equals(two)---" + one.equals(two));
		System.out.println("one == two---" + (one == two));

	}
	
		
	
	
	public static void main(String[] args) {
		String one = new String("Hello World");
		StringExample se = new StringExample();
		
		se.reverseRecursive(one);
		se.reverseIterative(one);
		se.stringSpace(one);
		se.stringMethods(one);
		
	}

	

	
}

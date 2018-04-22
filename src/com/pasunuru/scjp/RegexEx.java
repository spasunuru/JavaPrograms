package com.pasunuru.scjp;

public class RegexEx {

	public static void main(String[] args) {
		String test = "Test A. Test B. Test C.";
		
//		String regex = "";
		String regex = " ";
//		String regex = ".*";
//		String regex = "\\s";
//		String regex = "\\.\\s*";
//		String regex = "\\w[ \.] +";
//		String regex = "\\s";
//		
		
		String[] result = test.split(regex);
		
		for(String s: result) {
			System.out.println(s);
		}
			
	}

}

package com.pasunuru.scjp;

public class Donkey2 {

	public void asserFirst() {
		boolean assertsOn = false;
		assert (assertsOn) : "it is false";
		if (assertsOn) {
			System.out.println("assert is on");
		}
	}

	public void assertSecond() {
		int number = 9;
		assert number <= 10: "number is greater"; // stops if number > 10
		//System.out.println("Pass");
	}
	
	public void assertThrid(int value) {
		  assert( value >= 0 && value <= 20 ) :  "Invalid number: " + value;
		  System.out.printf( "You have entered %d\n", value );
	}

	public static void main(String[] args) {
		Donkey2 donkey2 = new Donkey2();
		donkey2.asserFirst();
		donkey2.assertSecond();
		donkey2.assertThrid(45);
		assert false: "Here's a message saying what happened";
	}
}

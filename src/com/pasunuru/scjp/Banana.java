package com.pasunuru.scjp;

import java.io.*;

class Food implements Serializable {
	int food = 3;
}

class Fruit extends Food {
	int juice = 5;
}

public class Banana extends Fruit {
	int yellow = 4;

	public static void main(String[] args) {
		Banana b = new Banana();
		Banana b2 = new Banana();
		
		b.serializeBanana(b); // assume correct serialization
		b2 = b.deserializeBanana(); // assume correct
		System.out.println("restore " + b2.yellow + b2.juice + b2.good);
	}
	// more Banana methods go here
}

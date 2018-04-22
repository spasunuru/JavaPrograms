package com.pasunuru.scjp;

public class Test {
	public static void main(String[] args) {
		int x = 5;
		boolean b1 = true;
		boolean b2 = false;
		if ((x == 4) && !b2)
			System.out.print("1 ");
		System.out.print("2 ");
		if ((b2 = true) && b1)
			System.out.print("3 ");
	}

	public void go() {
		String o = "";
		z: 
			for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 2; y++) {
				if (x == 1)
					break;
				if (x == 2 && y == 1)
					break;
				o = o + x + y;
			}
		}
		System.out.println(o);
	}
}
package com.pasunuru.scjp;

import java.util.*;

public class Quest {
	public static void main(String[] args) {
		String[] colors = { "blue", "red", "green", "yellow", "orange" };
		Arrays.sort(colors);
		int s2 = Arrays.binarySearch(colors, "orange");
		int s3 = Arrays.binarySearch(colors, "yolet");
		System.out.println(s2 + " " + s3);
	}
}
package com.pasunuru.security;

import java.security.MessageDigest;

public class MyMessageDigest {

	public static void main(String args[]) {

		try {

			byte[] data1 = "0123456789".getBytes("UTF-8");
			byte[] data2 = "abcdefghijklmnopqrstuvxyz".getBytes("UTF-8");

			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			
			messageDigest.update(data1);
			messageDigest.update(data2);

			byte[] digest = messageDigest.digest();
		} catch (Exception e) {
			System.out.println();
		}
	}
}

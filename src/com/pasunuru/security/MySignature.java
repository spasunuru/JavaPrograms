package com.pasunuru.security;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.Signature;

public class MySignature {

	public static void main(String[] args) {
		try {
			Signature signature = Signature.getInstance("SHA256WithDSA");
			
			SecureRandom secureRandom = new SecureRandom();
			KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
			KeyPair keyPair = keyPairGenerator.generateKeyPair();
			
			byte[] data = "abcdefghijklmnopqrstuvxyz".getBytes("UTF-8");
			signature.update(data);

			byte[] digitalSignature = signature.sign();
			
			
			/* Signature signature = Signature.getInstance("SHA256WithDSA");
			signature.initVerify(keyPair.getPublic());
			byte[] data2 = "abcdefghijklmnopqrstuvxyz".getBytes("UTF-8");
			signature2.update(data2);
			boolean verified = signature2.verify(digitalSignature);
			signature.initSign(keyPair.getPrivate(), secureRandom); */

		}catch(Exception e) {
			
		}
	}

}

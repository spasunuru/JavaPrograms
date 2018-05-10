package com.pasunuru.security;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class SM4Encryption {

	public static void main(String[] args) throws NoSuchProviderException {
		try{

		    KeyGenerator keygenerator = KeyGenerator.getInstance("SM4");
		    SecretKey myDesKey = keygenerator.generateKey();
		    
		    Cipher desCipher = Cipher.getInstance("SM4/ECB/PKCS5Padding","BC");
		    desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);

		    byte[] text = "6453535364646352".getBytes();
		    System.out.println("Text [Byte Format] : " + text);
		    System.out.println("SIZE : " + text.length);
		    
		    System.out.println("Text : " + new String(text));
		   
		    byte[] textEncrypted = desCipher.doFinal(text);
		    System.out.println("Text Encryted : " + textEncrypted);
		    System.out.println("size : " + textEncrypted.length);
		    
		    
		    desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
		    byte[] textDecrypted = desCipher.doFinal(textEncrypted);
		    
		    System.out.println("Text Decryted : " + new String(textDecrypted));
		    
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}catch(NoSuchPaddingException e){
			e.printStackTrace();
		}catch(InvalidKeyException e){
			e.printStackTrace();
		}catch(IllegalBlockSizeException e){
			e.printStackTrace();
		}catch(BadPaddingException e){
			e.printStackTrace();
		} 
	   

	}

}

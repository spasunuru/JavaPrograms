package com.pasunuru.security;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class DESEncryption
{    
	public static void main(String[] argv) {
		
		try{

		    KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
		    SecretKey myDesKey = keygenerator.generateKey();
		    
		    Cipher desCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
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
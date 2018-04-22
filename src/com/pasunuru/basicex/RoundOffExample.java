package com.pasunuru.basicex;

import java.text.DecimalFormat;
import java.text.ParseException;
public class RoundOffExample {

	public static void main(String[] args) throws ParseException {
		
		DecimalFormat df=new DecimalFormat("0.00");
		String formate = df.format(234.2343); 
		System.out.println(formate);
		
		double finalValue = (Double)df.parse(formate) ;
		System.out.println(finalValue);
		
		System.out.println(Math.round(234.2343*100)/100.f);
	}

}

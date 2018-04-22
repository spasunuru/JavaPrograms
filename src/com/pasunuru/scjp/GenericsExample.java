package com.pasunuru.scjp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsExample {

	public static int sum(List list) {
		int sum = 0;
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			int i = ((Integer) iter.next()).intValue();
			sum += i;
		}
		return sum;
	}
	
	public static int sumGenerics(List<Integer> intList) {
		int sum = 0;
		for (int i : intList) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList();
		intList.add(5);
		intList.add(4);
		intList.add(3);
		
		GenericsExample genericsExample = new GenericsExample();
		System.out.println(genericsExample.sum(intList)); 
		System.out.println(genericsExample.sumGenerics(intList));
	}

}


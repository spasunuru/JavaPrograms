package com.pasunuru.scjp;

import java.util.*;

public class SetEx {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Integer i1 = 45;
		Integer i2 = 46;
		set.add(i1);
		set.add(i1);
		set.add(i2);
		
		System.out.print("first iteration "+set.size());
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
			
		}
		
		set.remove(i1);
		System.out.print("second"+set.size());
		iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
			
		}
		i2 = 47;
		set.remove(i2);
		System.out.print("third "+set.size());
		iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
			
		}
	}

}

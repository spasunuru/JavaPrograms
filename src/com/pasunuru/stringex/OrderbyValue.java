package com.pasunuru.stringex;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OrderbyValue {

	public static void main(String a[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 20);
		map.put("C++", 45);
		map.put("Java2Novice", 2);
		map.put("Unix", 67);
		map.put("MAC", 26);
		map.put("Why this kolavari", 93);

		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		Collections.sort(list, new MyComparator());
		
		System.out.println("-----------------");
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + "=====" + entry.getValue());
		}
	}

}

class MyComparator implements Comparator<Entry<String,Integer>>, Serializable {
	
	private static final long serialVersionUID = 1L;

	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		return (o1.getValue().compareTo(o2.getValue()));
	}

}

/*
 * Set<Entry<String, Integer>> set = map.entrySet(); List<Entry<String,
 * Integer>> list = new ArrayList<Entry<String, Integer>>(set);
 * Collections.sort( list, new Comparator<Map.Entry<String, Integer>>() { public
 * int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ) {
 * return (o2.getValue()).compareTo( o1.getValue() ); } } );
 * for(Map.Entry<String, Integer> entry:list){
 * System.out.println(entry.getKey()+" ==== "+entry.getValue()); }
 */

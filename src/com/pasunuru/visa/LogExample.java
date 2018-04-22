package com.pasunuru.visa;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogExample {

	public void processFile(String path, Map<String, Integer> resultMap) {
		try {
			
			List<String> listUrls = new ArrayList<String>();
			List<String> lines = Files.readAllLines(new File(path).toPath());

			for (String line : lines) {
				extractUrls(line, listUrls);
			}
			insertIntoMap(listUrls, resultMap);

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	 public void listofFiles(String directoryName, List<String> listFiles){
	        
		 	File directory = new File(directoryName);
	        File[] fList = directory.listFiles();
	        
	        for (File file : fList){
	            if (file.isFile()){
	                listFiles.add(file.getAbsolutePath());
	            }
	        }
	    }

	private void extractUrls(String text, List<String> containedUrls) {

		String urlRegex = "((https?|ftp|gopher|telnet|file):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";
		Pattern pattern = Pattern.compile(urlRegex, Pattern.CASE_INSENSITIVE);
		Matcher urlMatcher = pattern.matcher(text);

		if (urlMatcher.find() == true) {
			containedUrls.add(text.substring(urlMatcher.start(0), urlMatcher.end(0)));
		}
	}

	private void insertIntoMap(List<String> list, Map<String, Integer> resultMap) {

		for (String url : list) {
			String ipaddressRegex = "http://(.*?)/";
			Pattern pattern = Pattern.compile(ipaddressRegex, Pattern.CASE_INSENSITIVE);
			Matcher urlMatcher = pattern.matcher(url);

			if (urlMatcher.find() == true) {
				resultMap.put(urlMatcher.group(1), count(url));
			}
		}
	}

	private int count(String url) {
		String SPECIAL_CHARS_REGEX = "[!@#$%^&*()\\[\\]|;',./{}\\\\:\"<>?]";
		int specials = url.split(SPECIAL_CHARS_REGEX, -1).length - 1;
		return specials;
	}

	private void finalOutput(Map<String, Integer> result) {
		System.out.println("\n\n Ipaddress     	 :     No of occurances");
		System.out.println("--------------------------------------");
		int total = 0;
		for (Map.Entry entry : result.entrySet()) {

			System.out.println(entry.getKey() + "	 : 		" + entry.getValue());
			total = total + (int) entry.getValue();
		}
		System.out.println("\n\nTotal Occurances :		" + total);
	}

	private Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap) {
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	public static void main(String[] args) throws IOException {
		
		LogExample logExample = new LogExample();
		Map<String, Integer> resultMap = new HashMap<String, Integer>();
		File directory = new File("d:\\work\\logs");
        File[] fList = directory.listFiles();
        
        System.out.println( "List of Files");
        for (File file : fList){
            if (file.isFile()){
            	System.out.println(file.getAbsolutePath());
            	logExample.processFile(file.getAbsolutePath(), resultMap);
            }
        }
        
        Map<String, Integer> sortedMap = logExample.sortByComparator(resultMap);
        logExample.finalOutput(sortedMap);
	}
}

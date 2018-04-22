package com.pasunuru.algorithems;

public class SecondHighest {
	
	int[] array = {21, 13, 45, 32, 36, 29 };
	
	public int find() {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		System.out.println("testing" + highest);
		
		
		for (int i=0; i< array.length-1; i++) {
			
			if (array[i] > highest) {
				secondHighest = highest;
				highest = array[i];
				
			} else if(array[i] >  secondHighest) {
				secondHighest = array[i];
			}
		}
		
		return secondHighest;
	}

	public static void main(String[] args) {
		SecondHighest scondHighest = new SecondHighest();
		int sh = scondHighest.find();
		System.out.println(sh);
	}

}

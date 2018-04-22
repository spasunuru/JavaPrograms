package com.pasunuru.algorithems;

public class SearchingAlgorithms {

	int[] theArray = { 4, 2, 9, 6, 23, 12, 34, 0, 1, 9};

	public void linearSearchForValue(int value) {

		boolean found = false;
		int i=0;
		for (i = 0; i < theArray.length; i++) {
			if (theArray[i] == value) {
				found = true;
				System.out.print("The Value was Found in the Following: " + ++i);
			}
		}

		
		if (!found)
			System.out.println("not found");

	}

	public void binarySearchForValue(int value) {
		int lowIndex = 0;
		int highIndex = theArray.length - 1;
		
		while (lowIndex <= highIndex) {
			int middleIndex = (highIndex + lowIndex) / 2;
			
			if (theArray[middleIndex] < value)
				lowIndex = middleIndex + 1;
			else if (theArray[middleIndex] > value)
				highIndex = middleIndex - 1;
			else {
				System.out.println("\nFound a Match for " + value
						+ " at Index " + middleIndex);
				lowIndex = highIndex + 1;
			}
		}
	}
	

	public static void main(String[] args) {
		SearchingAlgorithms searchingAlgo = new SearchingAlgorithms();
		//searchingAlgo.binarySearchForValue(34);
		
		searchingAlgo.linearSearchForValue(9);
	}

}

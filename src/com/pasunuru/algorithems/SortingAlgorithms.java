package com.pasunuru.algorithems;

public class SortingAlgorithms {
    
    public void bubblesort(int array[]) {
        
    	for (int i=array.length -1;i > 1; i--){
          for (int j = 0; j < i; j++ )
            if (array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }

    	for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + ", ");
        }
    	
    }
    
	
	
	public void selectionSort(int array[]){
		
		for(int i=0; i < array.length; i++){
			  int minimum = i;
			  for(int j = i; j < array.length; j++){
				  if(array[minimum] > array[j]){
					  minimum = j;
				  }
			  }
			  int temp = array[i];
              array[i] = array[minimum];
              array[minimum] = temp;
		}
		
		for (int k = 0; k < array.length; k++) {
		    System.out.print(array[k] + ", ");
		}
	}
	
 
	public void insertionSort1(int array[]) {
		int in, out;
		int n = array.length;
		for (out = 1; out < n; out++) {	  				
			int temp = array[out]; 						
			in = out; 								 	
			while (in > 0 && array[in - 1] >= temp) { 	
				array[in] = array[in - 1]; 				
				--in; 									
			}
			array[in] = temp; 							
		} 											
	} 
	
   
 
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        SortingAlgorithms sa = new SortingAlgorithms();
        
        //sa.bubblesort(input);
        sa.selectionSort(input);
        //sa.selectionSort(input);
    }
}

package com.examples.array;
/*
 * Merge two sorted arrays without using extra space.
 */
public class Merge2SortedArrays {
	int arr1[] = {-20,4,18,20,35,40,65,135};
	int arr2[] = {26,31,41,63,130,140,150,160,170};
	int loopCounter = 0;
	
	public static void main(String[] args) {
		Merge2SortedArrays merge2SortedArrays = new Merge2SortedArrays();
		merge2SortedArrays.merge2SortedArrays();
		System.out.println();
		
		for(int i=0;i<merge2SortedArrays.arr1.length;i++) {
			System.out.print(merge2SortedArrays.arr1[i]+"\t");
		}
		for(int i=0;i<merge2SortedArrays.arr2.length;i++) {
			System.out.print(merge2SortedArrays.arr2[i]+"\t");
		}
		System.out.println("\nLoopCounter \t"+merge2SortedArrays.loopCounter);
	}
	
	private void merge2SortedArrays() {
		int i = 0;
		int j = 0;
		int temp = 0;
		
		
		while (arr1[arr1.length-1] > arr2[0]) {
			System.out.println("Before I Reset "+i);
			this.loopCounter++;
			i = 0;
		while(i< arr1.length ) {
			 j = 0;
			if(arr1[i] > arr2[j]) {				
				while(j < arr2.length) {
					this.loopCounter++;
					
					if(arr1[i] < arr2[j]) { // TODO: insert at right position instead of swapping
						temp = arr1[i];
						arr1[i]= arr2[j-1];
						arr2[j-1] = temp;						
						break;
					}
					j++;
				}							
		}else {
			this.loopCounter++;
		}
		i++;
		} }
	}
	
	
}

package com.examples.array;

public class SortArrWith01And2 {

	//private int arr[] = {0, 2, 1, 2, 0};
	private int arr[] = {0, 1, 0,2,2,0,1,2,0,0};
	
	public static void main(String[] args) {
		SortArrWith01And2 sortArrWith01And2 = new SortArrWith01And2();
		sortArrWith01And2.sortArrWith01And2();
		
		for(int i=0;i<sortArrWith01And2.arr.length;i++) {
			System.out.print(sortArrWith01And2.arr[i]+"\t");
		}
	}
	
	
	private void sortArrWith01And2(){
		int zeroCount = 0;
		int oneCount = 0;
		int twoCount = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0)
				zeroCount++;
			else if(arr[i] == 1)
				oneCount++;
			else if(arr[i] == 2)
				twoCount++;			
		}
		int commonCounter = 0;
		int counter = 0;
		
		while (commonCounter < zeroCount) {
			arr[commonCounter] = 0;
			commonCounter++;
		}
		while(counter < oneCount) {
			arr[commonCounter] = 1;
			commonCounter++;
			counter++;
		}
		counter = 0;
		while(counter < twoCount) {
			arr[commonCounter] = 2;
			commonCounter++;
			counter++;
		}
	}
}

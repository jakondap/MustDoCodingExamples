package com.examples.array;

public class StockBuyAndSell {

	//int arr[] = {100,180,260,310,40,535,695};
	int arr[] = {4,2,2,2,4};
	int loopCounter = 0;
	
	public static void main(String[] args) {
		StockBuyAndSell obj = new StockBuyAndSell();
		obj.stockBuySell(obj.arr.length);
		System.out.println(" compareConter\t"+obj.loopCounter);
	}
	
	private void stockBuySell(int upper ) {
		
		int least = arr[0];
		int highest = 0;
		int leastIndex = -1;
		int heighestIndex = -1;
		
		for(int i=0;i<upper;i++) {	//Find the least in the array/sub array
			loopCounter++;
			if(arr[i] <= least) {
				least = arr[i];
				leastIndex = i;
			}
		}
		highest = arr[leastIndex+1];
		for(int i = leastIndex+1;i<upper;i++) { // Find highest in the array/sub array later to least
			loopCounter++;
			if(arr[i] >= highest) {
				highest = arr[i];	
				heighestIndex = i;
			}
		}
		if( heighestIndex != -1)
			System.out.println("Least\tHeighest "+least+"\t"+highest+"\t at "+leastIndex+"\t"+heighestIndex);
		
		if(leastIndex > 0)  // repeat in the sub array
			stockBuySell(leastIndex-1);
	}
}

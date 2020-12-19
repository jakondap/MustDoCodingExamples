package com.examples.array;

public class ReverseSubArrayGrp {
	//int arr []= {5,10,3,4,25,01,13};
	//int arr[] = {1,2,3,4,5};
	int arr[] = {5,6,8,9};
	int loopCounter;
	
	public static void main(String[] args) {
		ReverseSubArrayGrp obj = new ReverseSubArrayGrp();
		int subArrSize = 3;
		int k = 0;
		while(k < obj.arr.length) {
			int end = k + subArrSize-1;
			if(end > obj.arr.length-1)
				obj.reverseSubArrayGrp(k, (obj.arr.length-1));
			else 
				obj.reverseSubArrayGrp(k, (k + subArrSize-1));
			k += subArrSize;
		}
		
		for(int i=0;i<obj.arr.length;i++) {
			System.out.print(obj.arr[i]+"\t");
		}
	}
	
	private void reverseSubArrayGrp(int start, int end) {
		int mid = start + (end - start)/2;
		int temp = 0;
		int i = start;
		int j = end;
		while(i<=mid && j>=mid) {
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
	}
	

}

package com.examples.array;

public class KthSmallest {

	int arr []= {5,10,3,4,25,01,13};
	int loopCounter;
	
	public static void main(String[] args) {
		KthSmallest obj = new KthSmallest();
		//obj.kthSmallest(4);
		obj.kthBiggest(5);
		System.out.println("loopCounter  "+obj.loopCounter);
	}
	
	private void kthSmallest(int k) {
		int matchCount = 0;
		for(int i=0;i<arr.length;i++) {
			matchCount =0;
			for(int j=0;j<arr.length;j++) {
				if(i == j)
					continue;
				loopCounter++;
				if(arr[i]>arr[j]) {
					matchCount++;
				}
			}
			if(matchCount == (k-1)) {
				System.out.println("Kth Smallest is \t"+arr[i]);
				return;
			}
		}
	}
	private void kthBiggest(int k) {
		int matchCount = 0;
		for(int i=0;i<arr.length;i++) {
			matchCount =0;
			for(int j=0;j<arr.length;j++) {
				if(i ==j)
					continue;
				loopCounter++;
				if(arr[i]<arr[j]) {
					matchCount++;
				}
			}
			if(matchCount == (k-1)) {
				System.out.println(k+" th Biggest is \t"+arr[i]);
				return;
			}
		}
	}
}

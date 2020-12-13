package com.examples.array;

public class ElementsLeftSmallRightBig {
	
	//private int[] arr = {4,3,2,7,8,9};
	private int[] arr = {3,12,10,15,24,1926};
	
	public static void main(String[] args) {
		ElementsLeftSmallRightBig obj = new ElementsLeftSmallRightBig();
		int arr[] = obj.arr;
		int occurances = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(obj.breakIfGreater(i) && obj.breakIfLesser(i)) {
				System.out.println(arr[i]+"\t");
				occurances++;
			}
		}
		if(occurances == 0) {
			System.out.println(-1);
		}
	}
	private boolean breakIfGreater(int elePos) {		
		if(elePos == 0 || elePos == arr.length-1)
			return false;
		
		int arr[] = this.arr;
		
		for(int i=0;i<elePos;i++) {
			if(arr[i]>arr[elePos]) {
				return false;
			}
		}
		
		return true;
		
	}
	private boolean breakIfLesser(int elePos) {
		if(elePos == 0 || elePos == arr.length-1)
			return false;
		
		int arr[] = this.arr;
		for(int i=elePos+1;i<arr.length;i++) {
			if(arr[i]<arr[elePos]) {
				return false;
			}
		}
		
		return true;
	}
	
}

package com.examples.array;



public class ReverseCountInArr {
	
	private int[] arr = {2,4,1,3,5,48,32,23};
	private int reverCount = 0;
    
	
	public static void main(String[] args) {
		ReverseCountInArr reverseCountInArr = new ReverseCountInArr();
		reverseCountInArr.reverseCountInArr();
		System.out.println("reverCount "+reverseCountInArr.reverCount);
	}
	private void reverseCountInArr() {
		int loopCounter =0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j = i+1;j < arr.length;j++) {
				if(arr[i] > arr[j]) {
					System.out.println(arr[i]+ "\t"+ arr[j]);
					this.reverCount++;
				}
				loopCounter++;
			}
			loopCounter++;
		}
		System.out.println("LoopConter \t"+loopCounter);
	}

}

package com.examples.array;

public class ZigZagArrange {
	int arr[] = {4,3,7,8,6,2,1};
	
	public static void main(String[] args) {
		ZigZagArrange obj = new ZigZagArrange();
		
		obj.zipZagArrange();
		for(int i=0;i<obj.arr.length;i++) {
			System.out.print(obj.arr[i]+"\t");
		}
		
	}
	private void zipZagArrange() {
		int myArr[] = this.arr;
		for(int i=0;i<myArr.length-1;i++) {
			if(i%2==0)
				bringBigSmallNeighbour(i,true);
			else if (i%2 !=0) {
				bringBigSmallNeighbour(i,false);
			}
		}
	}
	private void bringBigSmallNeighbour(int elePos, boolean isBig) {
		int myArr[] = this.arr;
		int bigOrSmall = 0;
		int bigOrSmallIndex = 0;
		for(int i = elePos;i<myArr.length;i++) {
			if(isBig) {
				if(arr[i]>arr[elePos]) {
					bigOrSmall = arr[i];
					bigOrSmallIndex = i;
				}
			}else {
				if(arr[i]<arr[elePos]) {
					bigOrSmall = arr[i];
					bigOrSmallIndex = i;
				}
			}				
		}
		int temp = myArr[elePos+1];
		myArr[elePos+1] = bigOrSmall;
		myArr[bigOrSmallIndex] = temp;
		
	}
}

package com.examples.array;

public class RearrangeAlternatively {
	private int arr[] = {1,2,3,4,5,6};
	//private int arr[]={10,20,30,40,50,60,70,80,90,100,110};
	public static void main(String[] args) {
		RearrangeAlternatively rearrangeAlternatively = new RearrangeAlternatively();
		for(int i=0;i<rearrangeAlternatively.arr.length;i=i+2) {
			rearrangeAlternatively.rotate(rearrangeAlternatively.arr,i);
		}
		for(int i=0;i<rearrangeAlternatively.arr.length;i=i+1) {
			System.out.print(rearrangeAlternatively.arr[i]+"\t");
		}
	}
	private void rotate(int arr[], int pos) {
		int temp = arr[arr.length-1];
		
		for(int j=arr.length-1; j>pos;j--) {
			arr[j] = arr[j-1];
		}	
		arr[pos] = temp;
		
	}
}

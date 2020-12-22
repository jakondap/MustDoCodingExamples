package com.examples.array;

public class LeadersInArr {
	//int arr [] = {3,8,5,4,9};
	//int arr[] = {16,17,4,3,5,2};
	int arr[] = {1,2,3,4,0};
	
	public static void main(String[] args) {
		LeadersInArr obj = new LeadersInArr();
		obj.leadersInArr();
		System.out.print(obj.arr[obj.arr.length-1]+"\t");
	}
	
	private void leadersInArr() {
		boolean isLeader = false;
		for(int i=0;i<arr.length-1;i++) {
			isLeader = false;
			for(int j=0;j<arr.length;j++) {
				if(j == i) {
					continue;
				}
				
				if((j>i && arr[j]<= arr[i]) ) {
					isLeader = true;					
				}else if((j > i && arr[j] > arr[i]) ) {
					isLeader = false;
					break;
				}
			}
			if(isLeader) {
				System.out.print(arr[i]+"\t");
			}
		}
	}
}

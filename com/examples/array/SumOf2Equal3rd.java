package com.examples.array;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class SumOf2Equal3rd {

	private static int arr[] = {5,5,10,35,20,25,10,15};
	private static int subArr[] = new int[arr.length];
	private static Queue tripletQue = new ArrayBlockingQueue(arr.length*2);
	
	public static void main(String[] args) {
		/*sumOf2Equal3rd(25);
		
		for(int i=0;i<subArr.length;i++) {
			System.out.print(subArr[i]+"\t");
		}*/
		printTriplets();
		System.out.println();
	}
	
	private static void printTriplets() {
		for(int i=0;i<arr.length;i++) {
			int ele = arr[i];
			//if(tripletQue.contains(ele))
				//continue;
				
			for(int j=0;j<arr.length;j++) {
				if(i == j)
					continue;
					
				for(int k=0;k<arr.length;k++) {
					if(k == j || i ==k || tripletQue.contains(""+(arr[k]+""+arr[j]+""+arr[i])))
						continue;
					
					if(arr[k]+ arr[j] == ele) {
						tripletQue.add(""+(arr[k]+""+arr[j]+""+arr[i]));
						System.out.println(arr[k]+"\t"+arr[j]+"\t"+ele);
					}
				}
			}
		}
	}
	private static void sumOf2Equal3rd(int third) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			subArr = new int[arr.length];
			sum = arr[i]; 
			subArr[i] = sum;
			for(int j=0;j<arr.length;j++) {
				
				if(i == j)
					continue;
				
				sum += arr[j];
				if(sum < third) {
					subArr[j]= arr[j];
				}else if(sum > third) {
					break;
				}else if(sum == third){
					subArr[j]= arr[j];
					
					//return;
				}
			}
		}
	}
}

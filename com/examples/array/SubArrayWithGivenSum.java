package com.examples.array;

public class SubArrayWithGivenSum {
	private static int arr[] = {5,5,5,35,20,25,68,39};
	private static int subArr[] = new int[arr.length];
	
	public static void main(String[] args) {
		findSubArrayGivenSum(15);
		
		for(int i=0;i<subArr.length;i++) {
			System.out.print(subArr[i]+"\t");
		}
	}
	private static void findSubArrayGivenSum(int sum) {
		int numSum = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			numSum = arr[i];
			subArr = new int[arr.length];
			
			subArr[i] = numSum;
			
			if(sum == numSum) {
				//subArr[subArrCounter]= numSum;
				//subArrCounter++;
				return;
			}
			
			for(int j=i+1; j<arr.length;j++) {
				numSum += arr[j]; 
				
				if(numSum == sum) {					
					subArr[j]= arr[j];
					return;
				}else if((numSum) < sum) {
					subArr[j]= arr[j];
					continue;
				}else {
					break;
				}
			}
		}
	}
	
}

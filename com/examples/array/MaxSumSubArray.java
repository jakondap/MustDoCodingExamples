package com.examples.array;

public class MaxSumSubArray {
	private int arr[] = {3,8,-10,12,4,15};
	//private int arr[] = {-5,0,37,-40,5,10};
	//private int arr[] = {10,0,-400,500,10,-299,280};
	
	private int tempArr[] = new int[arr.length];
	int max = 0;
	int eleSum = 0 ;
	int maxEleSum =0;
	
	public static void main(String[] args) {
		MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
		maxSumSubArray.maxSumSubArrayAdv();
	}
	
	
	private void maxSumSubArrayAdv() {
		int maxIndex = 0;
		for(int i = 0;i<arr.length;i++) {
			
			if(i == 0) {
				eleSum = arr[i];
				maxEleSum = arr[i];
			}else {
				eleSum += arr[i];				
			}
			if(eleSum > maxEleSum) {
				maxEleSum = eleSum;
				maxIndex = i;
			}
		}	
		for(int i=0;i<=maxIndex;i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	
	private void maxSumSubArray() {
		int loopCounter=0;
		int maxIndex = 0;
		for(int i = 0;i<arr.length;i++) {
			int temp = 0;
			for(int j=0;j<=i;j++) {
				loopCounter++;
				temp  += arr[i];
				if(i == j) {
					//tempArr[i] = temp;
					if(temp>max) {
						max = temp;
						maxIndex = i;
					}	
				}
			}
		}
		
		
		
		
		
		System.out.println("loopCounter\t"+loopCounter);
		
		/*for(int i=0;i<tempArr.length;i++) {
			if(tempArr[i] == max) {
				maxIndex = i;
				break;
			}
		}*/
		for(int i=0;i<=maxIndex;i++) {
			System.out.print(arr[i]+"\t");
		}
		
	}

}

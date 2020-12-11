package com.examples.array;

public class LargestNumFormedFromArr {
	private int arr[] = {3, 30, 34, 5, 9};
	//private int arr[] = {54, 546, 548, 60};
	
	
	public static void main(String[] args) {
		LargestNumFormedFromArr largestNumFormedFromArr = new LargestNumFormedFromArr();
		
		int levelHigh = 0;
		int levelIndex = 0;
		
		for(int i=0;i<largestNumFormedFromArr.arr.length-1;i++) {
			levelHigh = 0;
			levelIndex = 0;
			//System.out.println("Comparing \t"+largestNumFormedFromArr.arr[i]);
			for(int j=i+1;j<largestNumFormedFromArr.arr.length;j++) {
				int temp = largestNumFormedFromArr.getNumericBig(largestNumFormedFromArr.arr[i], largestNumFormedFromArr.arr[j]);
				
				temp = largestNumFormedFromArr.getNumericBig(temp,levelHigh);
				
				if(temp != levelHigh) {
					levelHigh = temp;					
					if(levelHigh == largestNumFormedFromArr.arr[i])
						levelIndex = i;
					else if(levelHigh == largestNumFormedFromArr.arr[j])
						levelIndex = j;
					
				}
			}
			
			if(levelHigh != largestNumFormedFromArr.arr[i]) {
				//System.out.println(levelHigh+"\t"+largestNumFormedFromArr.arr[i]);
				largestNumFormedFromArr.arr[levelIndex]= largestNumFormedFromArr.arr[i];
				largestNumFormedFromArr.arr[i] = levelHigh;
			}
		}
		
		String numStr = "";
		for(int i=0;i<largestNumFormedFromArr.arr.length;i++)
			numStr += largestNumFormedFromArr.arr[i];
		
			System.out.print(numStr+"\t");
		
	}
	
	private int getNumericBig(int num1, int num2){
		double num1Temp = num1;
		double num2Temp = num2;
		
		while(num1Temp>10) {
			num1Temp = num1Temp/10; 
		}
		while(num2Temp>10) {
			num2Temp = num2Temp/10; 
		}
		
		if(num1Temp < num2Temp) {
			return num2;
		}else if(num1Temp == num2Temp) {
			if(num2>num1) {
				return num1;
			}else
				return num2;
		}else 
			return num1;
		
	}
	

}

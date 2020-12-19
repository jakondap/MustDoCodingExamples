package com.examples.array;

public class Pythagarean {
	int arr []= {5,10,13,3,4,25,01,13};
	//int arr []= {3,8,5};
	int loopCounter;
	public static void main(String[] args) {
		Pythagarean obj = new Pythagarean();
		if(!obj.isPythagarean())
			System.out.println("No Such triplet possible");
		
	}
	private boolean isPythagarean(){
		int firstEle = 0;
		int secondEle = 0;
		
		for(int i=0;i<arr.length-2;i++) {
			firstEle = arr[i]*arr[i];
			secondEle = arr[i+1]*arr[i+1];
			for(int j=0;j<arr.length;j++) {
				loopCounter++;
					if(i==j || j == i+1)
						continue;
				if((arr[j] * arr[j]) == (firstEle + secondEle)) {
					System.out.println("firstEle \tsecondEle\tThirdEle\t"+arr[i]+"\t"+arr[i+1]+"\t"+arr[j]);
					return true;
				}
			}
			
		}
		
		return false;
	}
}

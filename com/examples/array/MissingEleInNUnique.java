package com.examples.array;

public class MissingEleInNUnique {

	int arr[] = {1,2,0,5,4,6};
	
	public static void main(String[] args) {
		MissingEleInNUnique missingEleInNUnique = new MissingEleInNUnique();
		missingEleInNUnique.missingEleInNUnique();
	}
	
	private void missingEleInNUnique() {
		int totalSum = 0;
		int actualSum = 0;
		
		for(int i=0;i<arr.length;i++) {
			totalSum += arr[i];
			actualSum += (i+1);
		}
		
		System.out.println("Missing Element is \t"+ (actualSum - totalSum ));
	}
}

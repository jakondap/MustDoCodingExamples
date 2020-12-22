package com.examples.array;

public class EquilibriumPoint {
	//int arr[] = {1,3,5,2,2};
	int arr[] = {2,10,8,7,5};
	
	public static void main(String[] args) {
		EquilibriumPoint obj = new EquilibriumPoint();
		obj.equiliBriumPoint();
	}
	private void equiliBriumPoint() {
		int lsum = 0;
		int rsum = 0;
		if(arr.length == 1) {
			System.out.print(arr[0]+"\t");
		}else {
			for(int i=1;i<arr.length-1;i++) {
				lsum = 0;
				rsum = 0;
				for(int j=0;j<arr.length;j++) {
					if(i == j)
						continue;
					else if(j<i) {
						lsum += arr[j];
					}else if(j>i) {
						rsum += arr[j];
					}
				}
				if(lsum == rsum) {
					System.out.println("Equilibrium point is "+arr[i]);
					return;
				}
			}
		}
	}
}

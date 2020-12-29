package com.examples.string;

public class Rotate2Steps {
	char[] strArr1 = new String("amazon").toCharArray();
	char[] strArr2 = new String("azonam").toCharArray();
	
	public static void main(String[] args) {
		Rotate2Steps obj = new Rotate2Steps();
		obj.rotate2Steps();
		System.out.println();
	}
	private void rotate2Steps() {
		char temp = '\0';
		
		for(int i=1;i<=2;i++) {
			temp = strArr2[strArr2.length-1];
			for(int j=strArr2.length-2;j>=0;j--) {
				strArr2[j+1] = strArr2[j];
			}
			strArr2[0]=temp;
		}
	
	}
	
}

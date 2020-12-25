package com.examples.string;

public class Permutations {
	String str = "ABC";
	
	public static void main(String[] args) {
		Permutations obj = new Permutations();
		obj.permutations();
	}
	
	private void permutations() {
		char[] charArr = str.toCharArray();
		char[] tempStr = charArr;
		char tempChar = '\0';
		
		for(int i=0;i<str.length();i++) {			
			for(int j=0;j<tempStr.length;j++) {
				if(i ==j)
					continue;
				tempChar = tempStr[j];
				tempStr[j] =  tempStr[i]; 
				tempStr[i] = tempChar;
				printArr(tempStr);
				tempStr = charArr;
			}
			rotateStr();
		}
	}
	private void rotateStr() {
		char[] charArr = str.toCharArray();
		char[] tempStr = charArr; 
		char tempChar = '\0';
		
		do{
			tempChar = tempStr[0];
			for(int i=0;i<charArr.length-1;i++) {
				tempStr[i] = tempStr[i+1];
				
				if( i == charArr.length-2)
					tempStr[i+1] = tempChar;
			}
			printArr(tempStr);
		}while(!java.util.Arrays.equals(tempStr,charArr));
	}
	private void printArr(char[] tempStr) {
		for(int i=0;i<tempStr.length;i++)
			System.out.print(tempStr[i]);
		System.out.println();
	}
}

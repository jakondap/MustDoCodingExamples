package com.examples.string;

public class Palindrome {
	//String str = "aaaa";
	String str = "geeks";
	char[] tempArr = str.toCharArray();
	
	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		obj.palindrome();
	}
	private void palindrome() {
		char[] reverseTempArr = new char[tempArr.length];
		int j= 0;
		for(int i= str.length()-1;i>=0;i--) {
			reverseTempArr[j++] = tempArr[i];
		}
		if(!java.util.Arrays.equals(tempArr, reverseTempArr)) {
			System.out.println("Required chars " + (reverseTempArr.length-1));
		}else {
			System.out.println("Already a palindrome!");
		}
	}
	
}

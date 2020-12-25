package com.examples.string;

public class StrToNum {
	String str = "103";
	char[] strArr = str.toCharArray();
	char[] numArr = {'0','1','2','3','4','5','6','7','8','9'};
	int decimalIndex = 0;
	int digit = 0;
	int num  = 0;
	
	public static void main(String[] args) {
		StrToNum obj = new StrToNum();
		obj.strToNum();
	}
	
	private void strToNum() {
		for(int i=strArr.length-1;i >= 0;i--) {
			digit = getDigit(strArr[i]);
			if(digit != -1) {
				if(decimalIndex != 0) {
					num += digit *(decimalVal(decimalIndex));
				}else {
					num += digit;
				}
			}else {
				System.out.println("Invalid number");
				return;
			}
			decimalIndex++;
		}
		System.out.println("Converted Number is "+num);
	}
	private int decimalVal(int decimalIndex) {
		int val =1;
		for(int i=1;i<=decimalIndex;i++) {
			val *= 10;
		}
		return val;
	}
	private int getDigit(int ele) {
		for(int i=0;i<numArr.length;i++) {
			if(numArr[i] == ele ) {
				return i;
			}
		}
		return -1;
	}
}

package com.examples.string;

public class LongestSubStr {
	char[] strArr = new String("abcda").toCharArray();
	char[] uniqeArr = new char[strArr.length];
	
	public static void main(String[] args) {
		LongestSubStr obj = new LongestSubStr();
		obj.LongestSubStr();
		for(int i=0;i<obj.uniqeArr.length;i++) {
			System.out.print(obj.uniqeArr[i]);
		}
		
	}
	
	private void LongestSubStr() {
		for(int i=0;i<strArr.length;i++) {
			addToUniqueArr(strArr[i]);
		}
	}
	private void addToUniqueArr(char ele) {
		int emptyPos =0;
		for(int i=0;i<uniqeArr.length;i++) {
			if(uniqeArr[i] == ele) {
				return;
			}else if(uniqeArr[i] == '\0') {
				emptyPos = i;
				break;
			}
		}
		uniqeArr[emptyPos] = ele;
	}
}

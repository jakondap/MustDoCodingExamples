package com.examples.string;

public class LongestPrefix {
	//String strArr[] = {"abc","abcd","ab","abcdef"};
	//String strArr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
	String strArr[] = {"apple", "ape", "april"};
	
	public static void main(String[] args) {
		LongestPrefix obj = new LongestPrefix();
		obj.longestPrefix();
	}
	
	private void longestPrefix() {
		int pos = 0;
		boolean isPosGood = true;
		char ele = '\0';
		
		while(isPosGood) {
			ele = '\0';
			for(int i=0;i<strArr.length;i++) {
				if(pos >= strArr[i].length()) {
					isPosGood = false;
				}else if(ele == '\0') {
					ele = strArr[i].charAt(pos);
				}else if(ele != strArr[i].charAt(pos)) {
					isPosGood = false;
					break;
				}
			}
			pos++;
		}
		for(int i=0;i<pos-1;i++) {
			System.out.print(strArr[0].charAt(i));
		}
	}

}

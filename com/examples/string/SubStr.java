package com.examples.string;

public class SubStr {
	/*String str = "My Name is Karti";
	String subStr = "ame";*/
	String str = "My Name is Karti";
	String subStr = "abc";
	char[] strArr = str.toCharArray();
	char[] subStrArr = subStr.toCharArray();
	
	public static void main(String[] args) {
		SubStr obj = new SubStr();
		obj.subStr();
	}
	
	private void subStr() {
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i] == subStrArr[0]) {
				if(checkStr(i))
					return;
			}
		}
	}
	private boolean checkStr(int pos) {
		for(int i=0;i<subStr.length();i++) {
			if(subStrArr[i] != strArr[i+pos]) {
				return false;
			}
		}
		System.out.println("SubString found at "+pos);
		return true;
	}

}

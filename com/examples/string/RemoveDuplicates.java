package com.examples.string;

public class RemoveDuplicates {
	//String str = "geeksforgeeks";
	//String str = "gfg";
	String str = "isnamenamejugjugKartiKartiIshiIshi";
	char[] tempArr = str.toCharArray();
	char[] charsToRemove = new char[str.length()];
	
	public static void main(String[] args) {
		RemoveDuplicates obj = new RemoveDuplicates();
		obj.removeDuplicates();
		
		for(int i=0;i<obj.tempArr.length;i++) {
			if(obj.tempArr[i] != '\0')
				System.out.print(obj.tempArr[i]);
		}
	}
	int subStrIndex = -1;
	
	private void removeDuplicates() {
		int stIndex = -1;
		
		
		for(int i=0;i<tempArr.length-1;i++) {
			for(int j=i+1;j<tempArr.length;j++) {
				if(findStr(stIndex, i, j)) {
					break;
				}else {					
					if(subStrIndex != -1) {
						removeDup(subStrIndex, (i-1 - stIndex));
						subStrIndex = -1;
					}	
					stIndex++;					
				}
			}
		}
	}
	private boolean findStr(int stIndex, int endIndex, int searchStart) {
		
		for(int i=searchStart;i<tempArr.length;i++) {
			if(tempArr[stIndex+1] == tempArr[i] && stIndex <= endIndex && tempArr[i] != '\0') {
				stIndex++;
				if(subStrIndex == -1)
					subStrIndex = i;
			}			
		}	
		if(stIndex >= endIndex)
			return true;
		
		return false;
	}
	private void removeDup(int startIndex, int charsLen) {
		for(int i=startIndex;i<(startIndex + charsLen);i++) {
			tempArr[i] = '\0';
		}
	}
}

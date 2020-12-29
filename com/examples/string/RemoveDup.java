package com.examples.string;

public class RemoveDup {
	//String str = "geeksforgeeks";
	String str = "PeeTaak";
	
	char[] strArr = str.toCharArray();
	
	public static void main(String[] args) {
		RemoveDup obj = new RemoveDup();
		obj.removeDup(0);
		
		for(int i=0;i<obj.strArr.length;i++)		
			System.out.print(obj.strArr[i]);
	}
	
	int endPos = -1;
	int startPos = -1;
	
	private void removeDup(int pos) {
		if(pos < strArr.length) {			
			if(pos < strArr.length-1 && strArr[pos] == strArr[pos+1] ) {
				if(startPos == -1) {
					startPos = pos;
					endPos = pos;
				}
				endPos++;
			}else {
				if(endPos != -1) {
					for(int i=startPos; i<=endPos;i++) {
						strArr[i] = '\0';
					}
					endPos = -1;
					startPos = -1;
				}
			}
			removeDup(++pos);
		}else {
			return;
		}
	}

}

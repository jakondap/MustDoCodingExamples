package com.examples.string;

public class ReverseWords {
	//String str = "i.like.this.program.very.much";
	String str = "pqr.mno";
	
	public static void main(String[] args) {
		ReverseWords obj = new ReverseWords();
		obj.reverseWords();
	}
	
	private void reverseWords() {
		int endIndex = -1;
		int startIndex = -1;
		
		for(int j=str.length()-1;j>=0;j--) {
			if(j== str.length()-1 && endIndex == -1) {
				endIndex = j;
			}else if(str.charAt(j) == '.' && endIndex != -1) {
				startIndex = j+1;
				printWord(startIndex, endIndex);
				endIndex = startIndex -1 ;
			}else if(j == 0) {
				startIndex = j;
				printWord(startIndex, endIndex-1);
				break;
			}
		}
	}
	private void printWord(int startIndex, int endIndex) {
		for(int i=startIndex; i<=endIndex;i++) {
			System.out.print(str.charAt(i));
		}
		System.out.print("\t");
	}
}

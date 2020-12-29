package com.examples.string;

public class Anagram {
	String str1 = "abc";
	String str2 = "bca";
	
	public static void main(String[] args) {
		Anagram obj = new Anagram();
		
		if(obj.isAnagram()) {
			System.out.println("Is anagram");
		}else 
			System.out.println("Not an anagram");
	}
	private boolean isAnagram() {
		boolean isAnagram = false;
		
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					isAnagram = true;
					break;
				}
			}
		}
		return isAnagram;
	}
	
}

package com.forgeinnovations.interview;

public class FindPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "GFSDA";
		String str12= "ASDFGK";
		
		System.out.println(IsPermutation(str1, str12));
		str12= "ASDFGKY";
		System.out.println(IsPermutation(str1, str12));
		str1 = "GFSDA";
		str12= "ASDAG";
		System.out.println(IsPermutation(str1, str12));
	}
	
	
	private static boolean IsPermutation(String s1, String s2) {
		
		int[] charCount = new int[256];
		
		if(s1.toCharArray().length != s2.toCharArray().length)
			return false;
		
		
		for(char c: s1.toCharArray()) {
			charCount[c]++;
		}
		
		for(char ch: s2.toCharArray()) {
			if(--charCount[ch]<0) {
				return false;
			}
		
		}
		
		
		return true;
	}

}

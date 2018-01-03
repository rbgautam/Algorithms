package com.forgeinnovations.cracking.the.code.interview;

public class IsRotatedSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "WATERBOTTLE";
		String s2 = "ERBOTTLEWAT";
		
		
		System.out.println(isSubstring(s1, s2));
		
	}
	
	private static boolean isSubstring(String s1, String s2){
		
		if(s1.length() != s2.length())
			return false;
		String patternStr = s1+s1;
		
		if(patternStr.contains(s2))
			return true;
		else
			return false;
		
		
		
	}

}

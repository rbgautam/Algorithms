package com.forgeinnovations.interview;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revstr("JIFFYlube");
	}
	
	public static void revstr(String str) {
		
		char[] strChars = str.toCharArray();
		int len = strChars.length;
		
		for(int i=0,j=len-1;i<j;i++,j--) {
			char temp = strChars[i];
			strChars[i] = strChars[j];
			strChars[j] = temp;
		}
		
		String newStr =  new String(strChars);
		System.out.println(newStr);
	}

}

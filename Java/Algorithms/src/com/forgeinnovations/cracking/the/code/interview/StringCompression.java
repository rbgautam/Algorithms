package com.forgeinnovations.cracking.the.code.interview;

public class StringCompression {

	public static void main(String[] args) {
		
		String str1 ="aabcccccaaa";
		String str2 ="aabbcc";
		
//		System.out.println(compressString(str1));
//		System.out.println(compressString(str2));
//		System.out.println(compressString("aa"));
//		
		System.out.println(compressStringBetter(str1));
		System.out.println(compressStringBetter(str2));
		System.out.println(compressStringBetter("aa"));
		

	}
	//Solution 1 : Extra array required
	private static String compressString(String s1) {

		String result = "";

		if (s1.length() <= 2)
			return s1;
		// array to hold count for each char
		String[][] charCountArr = new String[s1.length()][2];
		int charCount = 1;
		int curPos = 0;
		charCountArr[0][0] = String.valueOf(s1.charAt(0));

		for (int i = 1; i < s1.length(); i++) {
			
			if (s1.charAt(i) == s1.charAt(i - 1)) {
				charCount++;
			} else {
				charCountArr[curPos++][1] = String.valueOf(charCount);
				charCountArr[curPos][0] = String.valueOf(s1.charAt(i));
				charCount = 1;
			}

		}
		charCountArr[curPos++][1] = String.valueOf(charCount);
		result = getResult(charCountArr);
		
		if(result.length() == s1.length())
			return s1;

		return result;
	}

	private static String getResult(String[][] charCountArr) {
		
		StringBuffer strBuff = new StringBuffer();
		int curPos = 0;
		while(charCountArr[curPos][1] != null ){
			strBuff.append(charCountArr[curPos][0]);
			strBuff.append(charCountArr[curPos][1]);
			curPos++;
		}
		
		
		return strBuff.toString();
	}
	
	//Solution 2 : Using StringBuffer inline , no Extra array required
		private static String compressStringBetter(String s1) {

			String result = "";

			if (s1.length() <= 2)
				return s1;
			// array to hold count for each char
			//String[][] charCountArr = new String[s1.length()][2];
			StringBuffer strBuff = new StringBuffer();
			int charCount = 1;
			int curPos = 0;
//			charCountArr[0][0] = String.valueOf(s1.charAt(0));
			strBuff.append(String.valueOf(s1.charAt(0)));	
			for (int i = 1; i < s1.length(); i++) {
				
				if (s1.charAt(i) == s1.charAt(i - 1)) {
					charCount++;
				} else {
					//charCountArr[curPos++][1] = String.valueOf(charCount);
					//charCountArr[curPos][0] = String.valueOf(s1.charAt(i));
					strBuff.append(String.valueOf(charCount));
					strBuff.append(String.valueOf(s1.charAt(i)));
					charCount = 1;
				}

			}
			//charCountArr[curPos++][1] = String.valueOf(charCount);
			result = strBuff.append( String.valueOf(charCount)).toString() ;  //getResult(charCountArr);
			
			if(result.length() == s1.length())
				return s1;

			return result;
		}

}

package com.forgeinnovations.cracking.the.code.interview;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

		String searchStr = "abbcdeagh";
		//System.out.println(removeDuplicates(searchStr.toCharArray()));
		System.out.println(ReturnNonDuplicateChars(searchStr));
		//removeDuplicates(searchStr.toCharArray());
	}

	 //Solution 2: O(n) solution
	 //Use one extra array to count through string then concatenate the non-zero indexes character
	private static String ReturnNonDuplicateChars(String searchStr) {

		int[] charArray = new int[256]; 
		String finalString ="";

		for (int i = 0; i < searchStr.length(); i++) {
			int charInt = (int) searchStr.charAt(i);
			
			charArray[charInt] += 1;
		}
		
		for (int j = 0; j < charArray.length; j++) {
			if(charArray[j] > 0) {
				//System.out.println(String.valueOf((char)j));
				finalString += String.valueOf((char)j);
				//System.out.println(finalString);
				//finalString.concat(String.valueOf((char)j));
			}
		}

		return finalString;
	}

	public static String removeDuplicates(char[] str) {
		if (str == null)
			return null;
		int len = str.length;
		if (len < 2)
			return null;

		int tail = 1;

		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j) {
				
				if (str[i] == str[j])
					break;
			}
			System.out.println(String.format("i=%d,j=%d,str[tail]=%s", i,j,String.valueOf(str)));
			
			if (j == tail) {
				
				str[tail] = str[i];
				
				++tail;
			}
		}
		str[tail] = 0;
		
		return String.valueOf(str);
	}

}

package com.forgeinnovations.interview;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aabcccca";
		System.out.println(compStr(s1));
		
	}

	private static String compStr(String str) {
		int strLen = str.length();
		
		char[] retStr =  new char[strLen];
		char[] strToChar = str.toCharArray();
		
		char last = strToChar[0];
		retStr[0]= last;
		int count=1;
		int newArrCount = 1;
		for(int i =1;i< strToChar.length;i++) {
			if(strToChar[i] == last) {
				count++;
			}else {
				addCharCount(retStr,newArrCount, count);
				newArrCount ++;
				if(newArrCount>strLen-1)
					return str;
				retStr[newArrCount] = strToChar[i];
				newArrCount ++;
				if(newArrCount>strLen-1)
					return str;
				last = strToChar[i];
				count = 1;
			}
		}
		
		addCharCount(retStr,newArrCount, count);
		return String.valueOf(retStr);
	}
	
	private static void addCharCount(char[] strArr, int addAtindex, int countInt) {
		String newCount  = String.valueOf(countInt);
		char[] countCharArr =  newCount.toCharArray();
		
		for(char i : countCharArr) {
			strArr[addAtindex]= i;
			addAtindex++;
		}
		
		
	}
	
}

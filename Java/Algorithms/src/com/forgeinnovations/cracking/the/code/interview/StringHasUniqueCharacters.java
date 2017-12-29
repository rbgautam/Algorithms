package com.forgeinnovations.cracking.the.code.interview;

public class StringHasUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String findStr = "abcdeaxyc"; 
		
		String findStr2 = "abcdexy"; 
		
		System.out.println(IsStringUniqueCharacters(findStr2));
		
	}
	//SOLUTION 1
	//Questions ;  is the code case sensitive?
	// By characters do you mean any printable character or just alphabets?
	//
	private static boolean IsStringUniqueCharacters(String searchStr) {
		
		int[] arrChar = new int[256];
		
		for(int i = 0;i< searchStr.length() ;i++ ) {
			int charInt = (int) searchStr.charAt(i);
			
//			if(charInt > 96 && charInt < 123 )
//				charInt -= 32; //Converting to uppercase
//			
//			charInt -= 65; //Normalizing to 0-26
//			
			arrChar[charInt] += 1;
			
			if(arrChar[charInt] > 1) {
				printArrchar(arrChar);
				return false;
			}
			
		}
		
		return true;
				
	}

	private static void printArrchar(int[] arrChar) {
		
		for(int i =0;i<arrChar.length;i++ )
			System.out.println(arrChar[i]);
		
	}
	
	
	

}

package com.forgeinnovations.interview;

import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findDuplicate("ABCASDFCG");
		//findDupLinear("ABCASDFCG");
		findDupBookkeeping("ABCSDFG");
	}

	public static void findDuplicate(String str) {
		
		char[] strChars = str.toCharArray();
		for (int i = 0; i < strChars.length; i++) {
			for(int j=0; j< strChars.length;j++) {
				if(strChars[i] == strChars[j] && i!= j) {
					String op = String.format("posi= %d, posj= %d,char=%s", i,j,String.valueOf(strChars[i]));
					System.out.println(op);
				}
			}
		}		
		
		
	}
	
	
	public static void findDupLinear(String str) {
		HashSet myMap = new HashSet(); 
		char[] strChar =  str.toCharArray();	
		
		for(char c: strChar) {
			if(myMap.contains(c)) {
				System.out.println(String.valueOf(c));
			}else {
				myMap.add(c);
			}
		}
			
	} 
	
	public static void findDupBookkeeping(String str) {
		
		boolean[] dupArr = new boolean[256];
		boolean flag =false;
		for(char c: str.toCharArray()) {
			if(dupArr[(int)c]) {
				System.out.println(String.valueOf(c));
				flag = true;
			}
			else
				dupArr[(int)c] = true;
		}
		if(!flag)
			System.out.println("No Duplicates");
		
	}
}

package com.forgeinnovations.algos.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		
		int[] dictateArr = {1,1,3,3,3,2,2,2,2,14,14,14,11,11,11,2};
		
		CreateMap(dictateArr);

	}
	
	
	public static void CreateMap(int[] arr) {
		
		HashMap<Integer, Integer> myMap =  new HashMap<>();
		
		for(int item: arr) {
			
			if(!myMap.containsKey(item)) {
				myMap.put(item, 1);
			}else
			{
				int currVal = myMap.get(item);
				myMap.replace(item, ++currVal);
			}
			
		}
		
		PrintCompressedKey(myMap);
		
		
		
		
	}


	private static void PrintCompressedKey(HashMap<Integer, Integer> myMap) {
		
		StringBuilder strBuff = new StringBuilder();
		for(Map.Entry<Integer, Integer> entry: myMap.entrySet()  ) {
			
			String val = String.format("%d %d ", entry.getValue(), entry.getKey());
			strBuff.append(val);
			
			
		}
		
		System.out.println(strBuff.toString());
		
	}

}

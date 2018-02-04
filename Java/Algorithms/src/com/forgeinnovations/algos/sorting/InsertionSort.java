package com.forgeinnovations.algos.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,2,4,6,1,3};
		printArray(arr);
		InsertionSortImpl(arr);
	}
	
	public static void InsertionSortImpl(int[] arr) {
		
		int len  = arr.length;
		for(int j=1; j<len;j++ ) {
			int key = arr[j];
			int i = j-1;
			while(i >=0 && arr[i] > key) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
		
		printArray(arr);
		
	}

	private static void printArray(int[] arr) {
		for(int i=0;i< arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------------");
	}
	
}

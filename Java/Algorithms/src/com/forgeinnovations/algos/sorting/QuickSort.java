package com.forgeinnovations.algos.sorting;

public class QuickSort {

	public static void main(String[] args) {
		
		 int[] test = { 5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5 };
		 
		 
		 int[] test2 = {99,88,5,4,3,2,1,0,-23,12,3,7,9,8,3,4,5,7} ;
		 
		 int[] sorted = QuickSort(test2,0,test2.length-1);
		 
		 for(int i:sorted) {
			 System.out.println(i);
		 }
		 
	}
	
	
	public static int[] QuickSort(int numbers[],int low, int high) {
		
		int i= low, j= high;
		//Get the pivot from the middle of the list
		int pivot = numbers[low + (high-low)/2];
		
		//Divide into 2 lists
		while(i<=j) {
			//System.out.println(String.format("pivot=%d", pivot));
			//Keep going until current element(left of the pivot) less than the pivot
			while(numbers[i] < pivot) {
				i++;
			}
			
			//Keep going until current element(right of the pivot) greater than the pivot
			while(numbers[j] > pivot) {
				j--;
			}
			
			//We found both the anomalies (left greater than pivot and right less than pivot)
			if(i<= j) {
				numbers = swap(i,j,numbers);
				i++;
				j--;
				
			}
			
			//recursion
			if(low <j) {
				//System.out.println(String.format("low=%d,j=%d", low,j));
				QuickSort(numbers,low,j);
				
			}
				
			if(i< high ) {
				//System.out.println(String.format("i=%d,high=%d", i,high));
				QuickSort(numbers,i,high);
			}
				
		}
		
		return numbers;
		
	}


	private static int[] swap(int i, int j, int[] arr) {
		//System.out.println(String.format("SWAP: i=%d,high=%d", i,j));
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] =temp;
		
		
		
		return arr; 
		
	}
	
	

}

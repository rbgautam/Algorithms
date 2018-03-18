package com.forgeinnovations.interview;

public class RowColZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myArr = {{1,2,3,4},{5,0,7,8},{9,10,11,12},{13,14,15,0}};
		int [] row = new int[myArr[0].length];
		int [] col = new int[myArr.length];
		
		printArr(myArr);
		System.out.println("------------------\n");
		rowAndColtoZero(myArr,row,col);
		
		fillRowColWithZeroes(myArr,row,col);
		
	}
	
	private static void rowAndColtoZero(int[][]myArr, int []row,int[] col) {
		for(int i=0;i<myArr[0].length;i++) {
			for(int j=0;j< myArr.length;j++) {
				if(myArr[i][j]== 0) {
					
					row[i] =1;
					col[j] = 1;
					
				}
			}
		}
		printArr(myArr);
	}
	

	private static void fillRowColWithZeroes(int[][] myArr, int[] row, int[] col) {
		for(int m=0;m< myArr[0].length;m++) {
			for (int i = 0; i < myArr.length; i++) {
				if(row[m] == 1 || col[i]==1) {
					myArr[m][i] =0;
				}
				
			}
		}
		System.out.println("\n\n------------------");
		printArr(myArr);
		
	}

	private static void printArr(int[][] myArr) {
		
			for(int i=0;i<myArr[0].length;i++) {
				for(int j=0;j < myArr.length;j++) {
				
					System.out.print(String.format("%d,", myArr[i][j]));
			}
			System.out.println();
		}
	}
	
	
	

}

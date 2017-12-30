package com.forgeinnovations.data.model;

public class darwChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {11,7,10,11,4,9,1,15,5,-5,-10,-15};
		WriteChart(input);
	}

	
	static void WriteChart(int[] input) {
        int numelem = input.length;
        String[][] graphArr = new String[31][input.length];
        
        for(int x =0;x<31;x++ )
        	for(int y =0;y<numelem;y++ )
        		graphArr[x][y] =" ";
        
        for(int i =0; i<numelem;i++)
        	graphArr[16][i] = "-";
        for(int l =0; l<numelem;l++)
        {
        	int val = input[l];
        	if(val >= 0){
        		for(int m=0;m<31;m++){
            		if(m>=(15-(val)) && m<=14)
            		  graphArr[m][l] = "X";
            		else
            		  graphArr[m][l] = " ";	
            		if(m==15)
            			graphArr[m][l] = "-";	
            	}
            	
        	}else{
        		for(int n=15;n<31;n++){
        			
            		if(n<(16+(val*-1)))
            		  graphArr[n][l] = "X";
            		else
            		  graphArr[n][l] = " ";	
            		if(n == 15)
        				graphArr[n][l] = "-";
            	}
        	}
        	
        	
        	
        }
        
        
        for(int j=0;j<31;j++){
        	for(int k =0; k<numelem;k++)
        		System.out.print(graphArr[j][k]);
        	System.out.print("\n");
        	
        }
        

    }

}

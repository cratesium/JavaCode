package com.DynamicProgrammming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
	public List<List<Integer>> calculate(int Rows) {
		List<List<Integer>>list = new ArrayList<>();
	    List<Integer> interiorList= new ArrayList<Integer>();
	    if( Rows==1 )
	    {
	     	interiorList.add(1);
	    	 list.add(interiorList);
	    	 return list;
	    	 
	    }else {
	    	 interiorList.add(1);
	    	 list.add(interiorList);
	    	for(int i=2;i<Rows;i++)
	    	{
	    		for(int j=0;j<i;j++)
	    		{
	    			if(j==0||j==i-1) {
	    				interiorList.add(1);
	    			}
	    			else {
						Integer bInteger = list.get(i-1).get(j) ;
						Integer cInteger= list.get(i-1).get(j-1);
						interiorList.add(bInteger+cInteger);
					}
	    			
	    	}
	    		list.add(interiorList);
    		}
	    }
	
		return list;
		
		
	}
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("enter number of rows ");
	int rows = scanner.nextInt();
	PascalsTriangle objPascalsTriangle= new PascalsTriangle();
	System.out.println(objPascalsTriangle.calculate(rows));
	
	
	
}

}

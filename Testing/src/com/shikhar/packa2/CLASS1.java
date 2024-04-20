package com.shikhar.packa2;

import com.shikhar.packa.newClass;

public class CLASS1 {
	
	public static  int [] fun(int array[]  ,int i ,int j , int mid ) {
		
		int min=0;
		int max=0;
		if(i==j)
	{
			min=max=array[i];
			return  new int[] {min,max};
		
	}
		else if(i==j-1) {
			if(array[i]<array[j])
			{
				return  new int [] {array[i],array[j]};
			}
			else
				return  new int [] {array[j],array[i]};
			
		}
		else {
			mid=(i+j)/2;
			fun(array, i,  mid-1,mid );
			fun(array, mid+1, j, mid);
		}
		return new int [] {-1,-1};
	
}
	public static void main(String[] args) {
		int [] array= {1,2,3,4,5,6,7,8,9,10};
		int i=0;
		int j=array.length-1;
		int mid=(i+j)/2;
		int [] ans=new int [2];
		ans =fun(array,i,j,mid);
		System.out.println(ans[0] +" "+ ans[1]);
		
				
	  
	}

	

}

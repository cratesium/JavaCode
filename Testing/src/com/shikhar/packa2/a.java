package com.shikhar.packa2;


import java.util.*;


public class a {
 	public static String binary(Integer n )
	{
		StringBuilder sb = new StringBuilder("");
		while(n!=1) {
			int p=n%2;
			sb.append(p);
			n=n/2;
			
		}
		sb.append(1);
		sb.reverse();
			
			
		return sb+"";
		//return null;
		
	}
   

   
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        StringBuilder sb = new StringBuilder("");

        for( int i=0 ;i<nums.size();i++){
                sb.append(binary(nums.get(i)));

                   int count =0;
                     for ( int j=0 ;j<sb.length();j++){
                         if(sb.charAt(j)=='1')
                         count++;
                     }
                     
                     if(count==k){
                     sum+=nums.get(i);
                  //   System.out.println(sb);
        
                     }
                     sb.delete(0,sb.length());
        }
        return sum;
    }
    public static void main(String[] args) {
    	List<Integer>numsIntegers=new ArrayList<Integer>();
		System.out.println("hello");
		numsIntegers.add(5);
		numsIntegers.add(10);
		numsIntegers.add(1);
		numsIntegers.add(5);
		numsIntegers.add(2);
		System.out.println(sumIndicesWithKSetBits(numsIntegers, 1));
	}
}



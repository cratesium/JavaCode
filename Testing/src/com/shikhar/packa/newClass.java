package com.shikhar.packa;
import java.util.*;
class sol {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> mp1= new HashMap<>();
        HashMap<Integer,Integer> mp2= new HashMap<>();
        for( int i=0 ;i<nums1.length;i++)
        {
            if(mp1.get(nums1[i])==null)
            mp1.put(nums1[i],1);
            else{
              mp1.  put(nums1[i],mp1.get(nums1[i])+1);
            }
            
        }
        for( var v : mp1.entrySet())
        	System.out.println("the key is "+v.getKey() +" and value is "+v.getValue());
           for( int i=0 ;i<nums2.length;i++)
        {
            if(mp2.get(nums2[i])==null)
            mp2.put(nums2[i],1);
            else{
               mp2. put(nums2[i],mp2.get(nums2[i])+1);
            }
        }
           System.out.println();
           System.out.println();
           for( var v : mp2.entrySet())
           	System.out.println("the key is "+v.getKey() +" and value is "+v.getValue());
        List<Integer> list= new ArrayList<>();
        for( int i=0 ;i< nums2.length;i++){
            if(mp1.get(nums2[i])!=null &&  mp2.get(nums2[i])!=null){
            	
                int min = Math.min(mp1.get(nums2[i]),mp2.get(nums2[i]));
                for( int j=0 ;i<min;j++) {
                	list.add(nums2[i]);
                	
                }
            }
        }
        
        int [] array = new int[list.size()];
        int i=0;
        for(Integer l: list){
            array[i]=l;
            i++;
        }
      return array;
        
    }
}
public class newClass {
	public static void main(String[] args) {
		sol mySolution= new sol();
		int [] nums1= {4,9,5};
		int [] nums2= {4,9,9,8,4};
		int arraay[]=mySolution.intersect(nums1, nums2);
		for( int i=0 ;i< arraay.length;i++)
		{
			System.out.print( arraay[i]+" ");
		}
		
		
	}

}

package com.shikhar.packa;
import java.util.*;
public class comparatorstrings {
	
   public static void main(String[] args) {
	
	Comparator<String>comparator = new Comparator<String>() {
		
		@Override
		public int compare(String o1, String o2) {
			if(o1.length()<= o2.length())
			return 1;
			else return 0;
		}
	};
		Scanner scanner = new  Scanner(System.in);
ArrayList<String> list= new ArrayList<String>();
	list.add("hii");
	list.add("i");
	list.add("am");
	list.add("shikhar");
	list.add("pratap");
	list.add("singh");
	
	 System.out.println();
	 System.out.println(" the strings entered are ");
	 for( String i: list)
	 {
		 System.out.println(i);
	 }
	 System.out.println();
	 Collections.sort(list);
	 System.out.println(" after normal sorting ");
	 for( String i: list)
	 {
		 System.out.println(i);
	 }
	 
	 
	 System.out.println();
	 System.out.println();
	 System.out.println(" after comparator sorting ");
	 Collections.sort(list,comparator);
	 for( String i: list)
	 {
		 System.out.println(i);
	 }
	 
	
	 
}
	

}

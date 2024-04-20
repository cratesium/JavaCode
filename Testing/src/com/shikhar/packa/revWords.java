package com.shikhar.packa;


public class revWords {
	public  static String reverseWords(String s) {
	    StringBuilder sb = new StringBuilder("");
	    StringBuilder s1=new StringBuilder("");

	    int i=0;
	    int j=0;
	    for(int k=0;k< s.length();k++)
	    { //  StringBuilder s1=new StringBuilder("");

	        if(s.charAt(k)!=' '){
	           s1.append(s.charAt(k)+"");
	           System.out.println("s1 is => "+s1);
	        }
	        if(s.charAt(k)==' '){
	            s1.reverse();
	            sb.append(s1);
	            sb.append(" ");
	            s1.delete(0,s1.length());
	        }
	        System.out.println("sb is : "+sb);

	    }

	  return sb+"";
	}
	public static void main(String[] args) {
		System.out.println(" this is testing ");
		System.out.println(reverseWords("hii i am shikhar "));
	}

}

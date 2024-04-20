package multiThreading;

import java.util.Iterator;

class Demo extends Thread{
	@Override
	public void run() {
	
		try { 
			System.out.println("Running thread one ");
			
			
		} catch (Exception e) {
		 System.out.println();
		}
		
	}
}

public class basicsOfMultithreading {
	public static void main(String[] args) {
//		Demo object1= new Demo();
		int n = 8 ;
		for( int i=0 ;i< n ;i++)
		{
			Demo object1= new Demo();
			object1.start();
			
		}
		

		}
	
	

}

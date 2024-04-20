package com.mutithreading;


class exampleClass extends Thread{
	public void run() {
		
		for( int i=0 ;i< Integer.MAX_VALUE;i++)
		System.out.println(" example class ");
		
		
	}
}

class AnotherClass extends Thread{
	public void run() {
		for( int i=0 ;i< Integer.MAX_VALUE;i++)
			System.out.println(" basic info class");
	}
	
}
public class BasicInfo {
	
		
		
    
	
	public static void main(String[] args) {
		System.out.println("hii");
		new AnotherClass().run();
		new exampleClass().run();
		
	}

}

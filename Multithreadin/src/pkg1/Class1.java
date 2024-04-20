package pkg1;
import java.io.*;
import java.lang.*;


class DivideByZeroClas extends Thread{
	public void run() {
		System.out.println("hiii this is thread A ");
		System.out.println(3/0);
	}
}
class B extends Thread{
	public void run() {
		System.out.println("this is thread b ");
		
	}
}
class c extends Thread{
	public void run() {
		System.out.println("this is thread c ");
	}
}

public class Class1  {
	public static void main(String[] args) {
		new DivideByZeroClas().start();
		new B().start();
		new c().start();
	}
	

}

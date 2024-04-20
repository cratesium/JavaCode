package exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class ErrorClass{
	public  void exception1 ( ) {
		FileReader fileReader = null;
		
		try {
			System.out.println("initiating the fileReader ");
			 fileReader= new FileReader("/Volumes/macOsHdData/javaMain/multithreading/src/package1/abc.txt");
			 BufferedReader bfBufferedReader= new BufferedReader(fileReader);
			 String lineString;
			 while((lineString=bfBufferedReader.readLine())!=null)
				 System.out.println(lineString);
			 
			System.out.println("file found ");
			
		} catch (Exception e) {
			
//			System.out.println(e.getMessage());
			System.out.println("try again by crating file if file  not found ");
//			System.out.println(e);
			System.out.println(e);
			System.out.println(e.getStackTrace());
		} finally { 
			try {
				fileReader.close();
			} catch (Exception e2) {
				return; 
				// TODO: handle exception
			}
			
		}
	}
}

public class EH2 { 
	public static void main(String[] args) {
		System.out.println(" hii this is starting the main function ");
		ErrorClass objecteErrorClass = new ErrorClass();
		objecteErrorClass.exception1();
     		
	}

}

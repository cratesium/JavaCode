package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class throwskeyword  {
	public void myfiles() throws Exception {
		FileReader fileReader= new FileReader("/Volumes/macOsHdData/javaMain/multithreading/src/package1/abc.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String string;
		while((string=bufferedReader.readLine())!=null){
			System.out.println(string);
			
		}
	}
 public static void main(String[] args) throws Exception {
//	 int a= 2/0;
	 throwskeyword objecThrowskeyword= new throwskeyword();
	 objecThrowskeyword.myfiles();
	
}

}

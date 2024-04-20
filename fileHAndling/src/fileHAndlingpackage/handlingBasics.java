package fileHAndlingpackage;

import java.io.File;
import java.io.FileReader;

public class handlingBasics {
	public static void main(String[] args) {
		try {
			File fileobject = new File("group.txt");
			if(fileobject.createNewFile())
			{
				System.out.println("file created successfully ");
				System.out.println("absolute path is : "+fileobject.getAbsolutePath());
			}else {
				System.out.println("file already exists ");
				
			}
			
			
			
		} catch (Exception e) {
			System.out.println("an error occured");
			// TODO: handle exception
		}
		
	}

}

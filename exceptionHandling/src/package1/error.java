package package1;

import java.util.ArrayList;
import java.util.List;

public class error {
	public static void main(String[] args) {
		
	try {
		
		
		try {
			List<Integer>list= new ArrayList<Integer>();
		    while(true) {
		    	list.add(0);
		    }
		   
		    
		}
		
		catch (Exception e1) {
			System.out.println(e1);
			System.out.println();
			System.out.println(e1.getMessage());
			// TODO: handle exception
		}
		
		
		
		
	} catch (Exception e) {
		try {
			List<Integer>list= new ArrayList<Integer>();
		    while(true) {
		    	list.add(0);
		    }
		   
		    
		}
		catch (Exception e1) {
			System.out.println(e1);
			System.out.println();
			System.out.println(e1.getMessage());
			// TODO: handle exception
		}
		finally {
			System.out.println(" exiting  the program  p1");
		}
		
		// TODO: handle exception
	}
		
		

	}

}

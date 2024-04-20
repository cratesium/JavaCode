package package1;

import java.util.Scanner;

public class multipleexception {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		 System.out.println("Enter a String ");
		 String string =scanner.nextLine();
		 System.out.println(string);
//         System.out.println("enter another string");
//		 String s=scanner.next();
//		 System.out.println(s);
		 String mainString=null;
		 try {
			System.out.println(mainString.length());
		} catch (ArithmeticException | NullPointerException |ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			// TODO: handle exception
		}
		 
	}

}

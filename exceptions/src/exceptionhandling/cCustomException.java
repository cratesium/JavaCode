package exceptionhandling;

import java.util.Scanner;
class ageLessThanZeroException extends Exception{
	public ageLessThanZeroException(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}
}

public class cCustomException {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)){
			System.out.println("enter age ");
			int age = scanner.nextInt();
			if (age <0) {
				
				throw new ageLessThanZeroException("age cannot be nagative ");
				
				
			}
			
		} catch (ageLessThanZeroException exception ) {
		System.out.println("went wrong ");
			// TODO: handle exception
		}
	}

}

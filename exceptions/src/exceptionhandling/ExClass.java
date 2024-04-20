package exceptionhandling;

import java.util.Scanner;

public class ExClass {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)){
			System.out.println("hii enter a number ");
			int d=scanner.nextInt();
			double f= 12/d;
			System.out.println(" f = "+f);
			
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getSuppressed());
			System.out.println(e.getCause());
			System.out.println(e.getClass());
			// TODO: handle exception
		}
	}

}

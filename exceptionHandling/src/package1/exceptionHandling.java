package package1;

public class exceptionHandling {
public static void main(String[] args) {
	int array[] = new int[10];
	try {
//		System.out.println(array[11]);
		int a=10;
		System.out.println(a/0);
		
	} 
	catch ( ArithmeticException e) {
		System.out.println("exception occurred runtime");
		// TODO: handle exception
	}
		finally {
		System.out.println(" our code runs ");
		
	}																																																																																																																																																																																																																																																																																																																																																																																																										
//	
	//System.out.println(10/0);
}

}

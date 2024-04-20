package package1;
class ExceptionClass{
	public void  running ( int integer){
		try {
			System.out.println("entering the try block ");
			System.out.println("performing the fetched calculations ");
			System.out.println(integer/0);
			System.out.println("exiting the try block ");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("exiting try and catch block ");
		}
		
		
	}
}

public class example {
	public static void main(String[] args) {
	  ExceptionClass objectExceptionClass = new ExceptionClass();
	  objectExceptionClass.running(5);
		
	}

}

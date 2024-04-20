package multiThreading;
class democlass extends Thread{
	public void run() {
		try { int i=0;
		for(  i=0;i > 8/i;i++ ) {
			System.out.println("executing the thread class");
		}
			
			
			
		} catch (Exception e) {
			System.out.println("exception occur and thread class cant be executed ");		}
		
	}
	
	 
}


public class multithreading2 {
	public static void main(String[] args) {
		democlass objectDemoclass = new democlass();
		for( int i =0 ;i< 2;i++)
		{
			objectDemoclass.start();
		}
//		Thread myThread= new Thread(new runnableinterface());
		
	}

}

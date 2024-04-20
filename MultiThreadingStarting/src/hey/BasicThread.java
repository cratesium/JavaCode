package hey;

class another implements Runnable{
	public void run() {
		for( int i=0 ;i<1000;i++)
			System.out.println("another class ");
		BasicThread newBasicThread = new BasicThread();
		newBasicThread .run();
	}
}
public class BasicThread implements Runnable
{   
	public void run() {
		for(int i=0 ;i<1000; i++) {
			System.out.println("the value is "+i);
		}
		
	}
	public static void main(String[] args) {
		Thread thread = new Thread(new BasicThread());
		thread.start();
		
	}


}

package hey;

class FirstClass extends Thread{
	public void run() {
		for( int i=0;i < 1000;i++) {
			System.out.println("inside the first class "+i);
		}
	}
	
}
  class Second  extends Thread{
	 public void run() {
		for( int i=0 ;i< 1000;i++)

		{
			System.out.println("inside second class "+i);
		}
	}
	
	
}
class Third implements Runnable{
	public void run() {
	for( int i=0;i<1000;i++)
	{
		System.out.println("inside the third class "+i);
		
	}
}

	
}


public class class2 {
public static void main(String[] args) {
	new FirstClass().start();
	new Second().start();
	Thread myThread= new Thread(new Third());
	myThread.start();
}

}

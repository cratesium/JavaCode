package multiThreading;
class mythread1 extends Thread{
	@Override
	public void run() {
		System.out.println(" saying hii to the childThread of myclass");
		
	}
}
class mythread extends Thread{
	@Override
	public void run() {
		System.out.println("entering the mythread class");
		System.out.println("entering the try and catch system ");
		try {
			
			for( int i=0 ;i<6 ;i++)
			{
				System.out.println("here inside thread options are "+i);
			}
			System.out.println(" starting another thread ");
			mythread1 childThreadOfMythreadClass= new mythread1();
			childThreadOfMythreadClass.start();
		} catch (Exception e) {
			System.out.println("cant be executed because an error has occur ");
			// TODO: handle exception
		}
	}
}

public class thread1 {
	public static void main(String[] args) {
		System.out.println(" main entering ");
		mythread threadobj1 = new mythread();
		threadobj1.start();
		
		System.out.println(" main exiting ");
	}

}

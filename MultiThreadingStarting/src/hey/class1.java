package hey;
class classA extends Thread {
	public void run() {
		for( int i=0 ;i<50000;i++)
		{
			System.out.println("this is class A "+i);
		}
		
	}
}
class classB extends Thread {
	public void run() {
		for( int i=0 ;i<50000;i++)
		{   
			System.out.println("this is class B "+i);
		}
		
	}
}
class classC extends Thread {
	public void run() {
		for( int i=0 ;i<50000;i++)
		{
			System.out.println("this is class C "+i);
		}
		
	}
}
public class class1 { 
	public static void main(String[] args) {
		new classA().start();
		new classB().start();
		new classC().start();
	}

}

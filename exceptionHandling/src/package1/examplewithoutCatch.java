package package1;

public class examplewithoutCatch {
	public static void main(String[] args) {
		try {
			System.out.println("by not using catch in try catch jvm will automatically provide the catch block ");
			System.out.println("dividing by zero exception ");
			System.out.println(4/0);
		} finally {
			System.out.println("cant divide ");
			
		} 
	}

}

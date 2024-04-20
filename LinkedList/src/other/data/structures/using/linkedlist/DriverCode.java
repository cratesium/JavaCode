package other.data.structures.using.linkedlist;

public class DriverCode {
	public static void main(String[] args) {
		Stack objectStack= new Stack();
		objectStack.push(0);
		objectStack.push(1);
		objectStack.push(23);
		objectStack.push(56);
		objectStack.push(2);
		objectStack.pop();
		objectStack.print();
		objectStack.pop();
		objectStack.print();System.out.println();
		objectStack.isEmpty();
		objectStack.Top();
		objectStack.getSize();
		
	}

}

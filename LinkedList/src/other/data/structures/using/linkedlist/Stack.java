package other.data.structures.using.linkedlist;
//push pop top isEmpty top
public class Stack {
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
			}
	}
	public static Node head;
	public static int size=0;
	public void push(int data ) {
		
		Node newNode= new Node(data);
		size++;
		if(head==null) {
			head=newNode;
			return;
		}
	    newNode.next=head;
	    head=newNode;
		
		
	}
	public void pop() {
		
		if(head==null) {
			System.out.println("can't pop  stack is empty ");
			return;
		}
		size--;
		head=head.next;
		
	}
	public void print() {
		System.out.println("starting stack");
		Node tempNode=head;
		while(tempNode!= null) {
			System.out.println("|"+tempNode.data+"|");
			System.out.println("----");
			tempNode=tempNode.next;
		}
		System.out.println("ending stack");
		System.out.println();
		
	}
	public void getSize() {
		System.out.println("Size is : "+size);
		
	}
	public void isEmpty() {
		if(head==null)
			System.out.println("Stack is Empty ");
		else {
			System.out.println("Stack is not Empty");
		}
		
		
	}
	public void Top() {
		System.out.println("Top Element of Stack is :"+head.data);
		
	}
	


		//objectOfStack.pop();
	}
	



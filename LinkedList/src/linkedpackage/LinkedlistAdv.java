package linkedpackage;



public class LinkedlistAdv {
	public static class Node{
		int data;
		Node next;
		public Node() {
			this.data=0;
			this.next=null;
			
		}
		public Node(int data) {
			this .data= data;
			this.next= null;
			
		}
	}
	public static Node head;
	public void add( int data ) {
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
	   Node tempNode=head;
	   while(tempNode.next!=null)
	   {
		   tempNode=tempNode.next;
	   }
	   tempNode.next=newNode;
	   
		
	}
	public void print() {
		Node tempNode= head;
		while(tempNode!=null) {
		  System.out.print(tempNode.data+" -> ");
		  tempNode=tempNode.next;
		}
		
	}
	public void checkCycle() {
		if (head==null || head.next==null) {
			System.out.println("No cycle present ");
			return ;
				
		}
		Node fast,slow;
		slow=fast=head;
		while(fast!=null && fast.next!=null)
		{
			
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
			{
				System.out.println("Cycle Present ");
				return ;
			}
		}
		System.out.println("No Cycle Present ");
		return ;
		
		
	}
	
	public void detectAndRemoveCycle() {
		boolean isCycleThere=false;
		if(head==null || head .next==null)
			System.out.println("No Cycle is Present ");
		Node slow,fast;
		slow=fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				System.out.println("Cycle detected in the Linked List ");
				isCycleThere=true;
				slow=head;
				break;
			}
		}
		System.out.println("hiii");
		Node prevNode=head;
		slow=slow.next;
		while(slow!=fast.next)
		{ //  System.out.println("in loop 2");
			//prevNode=fast;
			slow=slow.next;
			fast=fast.next;
		}
		
		System.out.println("out loop 2 ");
		fast.next=null; 
		System.out.println("out");
		
	}
	
	public static void main(String[] args) {
		LinkedlistAdv linkedlistAdvObjAdv= new LinkedlistAdv();
		head=new Node(2);
		head.next=new Node(4);
		head.next.next=new Node(5);
		head.next.next.next=new Node(6);
		head.next.next.next.next=new Node(7);
		head.next.next.next.next.next=new Node(8);
		head.next.next.next.next.next.next=head.next.next.next;
		linkedlistAdvObjAdv.detectAndRemoveCycle();
		linkedlistAdvObjAdv.print();
	}

}

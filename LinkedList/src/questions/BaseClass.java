package questions;

import linkedpackage.MyLinkedList.Node;

public class BaseClass {
	public static class Node {
		int data;
		Node next;
		public Node() {
			this.data =0;
			this.next=null;
		}
		public Node(int data) {
			this.data =data;
			this.next=null;
		}
		
	}
	public static Node head;
	
	public void print() {
		Node tempNode=head;
		while(tempNode!=null)
		{
			System.out.print(tempNode.data+" ");
			tempNode=tempNode.next;
		}
		System.out.println();
	}
	public void add(int data ) {
		
		//creating a node 
		Node newNode=new Node(data);
		//cheCking whether a linkedList is empty or not 
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
	   newNode.next=null;
	   
	
		
	}
	public Node getMiddle() {
		if(head==null || head.next==null)
			return head;
		Node slowNode=head;
		Node fastNode=head;
		while(fastNode!=null && fastNode.next!=null) {
			slowNode=slowNode.next;
			fastNode=fastNode.next.next;
		}
		return slowNode;
		
	}
	public void ZIGZAG() {
		Node middleNode=getMiddle();
		Node prevNode=null;
		Node currentNode=middleNode;
		Node nextNode;
		while(currentNode!=null)
		{
			nextNode=currentNode.next;
			currentNode.next=prevNode;
			prevNode=currentNode;
			currentNode=nextNode;
		}
		Node head2=prevNode;
		Node h1=head;
		Node h2=head2;
		while(head!=null && head2!=null)
			
		{   h1=h1.next;
			head.next=h2;
			h2=h2.next;
			
		}
		
		
		
		
	}
	

}

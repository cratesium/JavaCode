package linkedpackage;

public class DoublyLinkedList {
	public static class Node {
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data=data;
			this.next=null;
			this.prev=null;
			
		}
	}
	public static Node head;
	public static Node tail;
	public static int  size=0;
	
	public void addFirst(int data) {
		Node newnodNode= new Node(data);
		if(head==null)
		{
			head=tail=newnodNode;
	      return;
		}
		newnodNode.next=head;
		head.prev=newnodNode;
		head=newnodNode;
	}
	public void addLast(int data) {
		Node myNode= new Node(data);
		if(head==null)
		{
			head=tail=myNode;
			return;
		}
		tail.next=myNode;
		myNode.prev=tail;
		tail=myNode;
		
	}
	public void printByHead() {
		System.out.print("printing using head : ");
		Node tempNode=head;
		while(tempNode!=null)
		{
			System.out.print(tempNode.data+"<->");
			tempNode=tempNode.next;
		}
		System.out.println("null");
		
	}
	public void addAtIndex( int pos,int data) {
		int idx=2;
		Node temNode=head;
		Node myNode= new Node(data);
		if(head==null)
		{
			head=tail=myNode;
			return;
		}
		while(idx!=pos) {
			temNode=temNode.next;
			idx++;
		}
		myNode.next=temNode.next;
		temNode.next=myNode;
		myNode.prev=temNode;
		temNode=temNode.next.next;
		temNode.prev=myNode;
		
	}
	
    public void printByTail() {
    	System.out.print("printinh using tail : ");
    	Node temNode=tail;
    	while(temNode!=null)
    	{
    		System.out.print(temNode.data+"<->");
    		temNode=temNode.prev;
    	}
    	System.out.println("null");
		
	}
    public void  deleteFirst() {
    	if(head==tail) {
    		System.out.println("list is Empty ");
    		return;
    	}
    	head=head.next;
    	head.prev=null;
    	
		
	}
    public void deleteLast() {
    	if(head==tail) {
    		System.out.println("list is empty ");
    		return;
    	}
    	tail=tail.prev;
    	tail.next=null;
		
	}
	public static void main(String[] args) {
		DoublyLinkedList objectDoublyLinkedList= new DoublyLinkedList();
		System.out.println("------------adding-----------");
		objectDoublyLinkedList.addFirst(3);
		objectDoublyLinkedList.addFirst(2);
		objectDoublyLinkedList.addFirst(1);
		objectDoublyLinkedList.addLast(5);
		
		objectDoublyLinkedList.printByHead();
        System.out.println("------------adding at index 4----------");
		objectDoublyLinkedList.addAtIndex(4, 4);
		objectDoublyLinkedList.printByHead();
		System.out.println("---------------delete first ---------------");
		objectDoublyLinkedList.deleteFirst();
		objectDoublyLinkedList.printByHead();
		objectDoublyLinkedList.printByTail();
		System.out.println("----------------delete last---------------");
		objectDoublyLinkedList.deleteLast();
	    objectDoublyLinkedList.printByHead();
	    objectDoublyLinkedList.printByTail();
		
	}

}

package linkedpackage;

public class MyLinkedList {
	
	public static class Node{
		int data;
		Node next;
		public Node() {
			this.data=0;
			this.next=null;
			
		}
		public Node(int data) {
			this.data=data;
			this.next=null;
			
		}
		
	}
	int size=0;
	public static Node head,tail;
	public void sizeOfList() {
		
		System.out.println("size is "+size);
		
	}
	public void addFirst(int data ) {
		//create new node 
		Node newNode= new Node(data);
		size++;
		
		//check whether the ll is empty or not 
		if(head==null)
			{
			head=tail=newNode;
	        return ;
			}
		//newnode->next= head
		newNode.next=head;
		//head=newnode;
		head=newNode;
		print();
	}
	public void print() {
		Node tempNode=head;
		while(tempNode!=null)
		{
			System.out.print(tempNode.data+" ");
			tempNode=tempNode.next;
		}
		System.out.println();
	}
	public void addLast(int data ) {
	
		//creating a node 
		Node newNode=new Node(data);
		size++;
		//cheCking whether a linkedList is empty or not 
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
	   Node tempNode=head;
	   while(tempNode.next!=null)
	   {
		   tempNode=tempNode.next;
	   }
	   tempNode.next=newNode;
	   tail=newNode;
	   newNode.next=null;
	   
		print();
		
	}
	public void addbetween(int position,int data) {
		//creating a node 
		Node newNode =  new Node(data);
		size++;
		Node tempNode=head;
		//checking for emptyness of linkedList 
		if(head==null) 
		{
			head=tail=newNode;
			return;
		}
		if (position==0) {
			addFirst(data);
			
		}
		//iterTING TO THE POSITION
		for( int i=0 ;i< position-2;i++)
		{  // for adding at n position , only n-2 iterations needed 
			// we can 
			tempNode=tempNode.next;
		}
		newNode.next=tempNode.next;
		tempNode.next=newNode;
		
		print();
		
	}
	public void addAfterFirstMatchedData(int previousData , int data ) {
		Node newNode= new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			
			return;
		}
		Node tempNode=head;
		while(tempNode.data!=previousData)
		{
			tempNode=tempNode.next;
			
		}
		newNode.next=tempNode.next;
		tempNode.next=newNode;
		if(newNode.next==null)
		{
			tail=newNode;
		}
		
		print();
	}
	public void addBetweenTwoData(int previousData,int data, int nextData) {
		
		Node newNode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return ;
		}
		Node tempNode=head;
		while(tempNode.data==previousData && tempNode.next.data==nextData)
		{
			newNode.next=tempNode.next;
			tempNode.next=newNode;
		}
		
		print();
	}
	public void searchElement(int element ) {
        boolean b=false;
        Node tempNode=head;
        while( tempNode.next!=null) {
        	if (tempNode.data==element) {
        		System.out.printf("element %d exists is the list ",element);
        		System.out.println();
        		return ;
				
			}
        	tempNode=tempNode.next;
        	
        }
        
		System.out.printf("element %d doesn't exist in the list ",element);
		System.out.println();
	}
	public int  getIndex(int data ) {
		Node tempNode=head;
		int idx=0;
		while(tempNode!=null) {
			idx++;
			if(tempNode.data==data)
				return idx;
			else {
				tempNode=tempNode.next;
			}
			
			
			
		}
		return -1;
		
	}
	public void deleteFirst() {
		size--;
		Node tempNode=head;
		if(head==null) {
			System.out.println("linkedList is empty ");
			return ;
		}
		head=tempNode.next;
		
	
		print();
		
		
	}
	public void deleteLast() {
		size--;
		Node tempNode=head;
		while(tempNode.next.next!=null) {
			tempNode=tempNode.next;
		}
		tempNode.next=null;
		tail=tempNode.next;
		print();
	}
	public void delete(int data ) {
		size--;
		Node tempNode=head;
		if(tempNode.data==data) {
			head=tempNode.next;
		}
		else if(tempNode==tail) {
			deleteLast();
		}
		else {
			while(tempNode.next.data!=data && tempNode!=tail)
			{
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
		}
		print();
	}
	public void reverse() {
		Node prevNode=null;
		Node currNode=tail=head;
		Node nextNode;
		while(currNode!=null) {
			nextNode=currNode.next;
			currNode.next=prevNode;
			prevNode=currNode;
			currNode=nextNode;
			
		}
		head=prevNode;
		print();
	}
//	public void reverseInBetween( int left, int right ) {
//		Node curr,prev,next,tempNode;
//		tempNode=head;
//		
//		while(tempNode.next.data!=left) {
//			tempNode=tempNode.next;
//			}
//		prev=tempNode;
//		curr=tempNode.next;
//		while(curr.data!=right) {
//			next=curr.next;
//			curr.next=prev;
//			prev=curr;
//			curr=next;
//			
//		}
//		
//		
//		
//	}
	public void deleteNthNodeFromLast(int n ) {
		Node tempNode=head;
		sizeOfList();
		if(size==1) {
			head=null;
		}
		if (size==n) {
			tempNode=tempNode.next;
			head=tempNode;
			
		}else {
			for(int i=0;i<size-n+1-2;i++) {
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
		}
		print();
		
			
		
		
		
	}
	
	
	public static void main(String[] args) {
		MyLinkedList linkedList=new MyLinkedList();
		linkedList.addFirst(3);
		linkedList.addFirst(2);
		linkedList.addFirst(1);
		linkedList.addLast(5);
		linkedList.addLast(6);
		linkedList.addLast(7);
		linkedList.addbetween(4, 4);
		linkedList.addAfterFirstMatchedData(6, 90);
        linkedList.sizeOfList();
		linkedList.print();
		linkedList.searchElement(90);
		linkedList.searchElement(900);
		linkedList.searchElement(1);
		linkedList.addBetweenTwoData(1, 50, 2);
		linkedList.addbetween(0, 51);
		linkedList.print();
		System.out.println();
        linkedList.sizeOfList();
        System.out.printf("index of %d is %d ",7,linkedList.getIndex(7));
        System.out.println();
        System.out.printf("index of %d is %d ",51,linkedList.getIndex(51));
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
        System.out.println("---- deleting the first element ----");
        linkedList.print();
        linkedList.sizeOfList();
        linkedList.deleteFirst();
        linkedList.print();
        linkedList.sizeOfList();
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
        System.out.println("------------deleting last ----------------------");
        linkedList.print();
        linkedList.sizeOfList();
        linkedList.deleteLast();
        linkedList.print();
        linkedList.sizeOfList();        
        System.out.println("____________________________________________________________________");
        System.out.println("____________________________________________________________________");
        System.out.println("------------   delete  ----------------------");
        linkedList.print();
        linkedList.sizeOfList();
        linkedList.delete(2);
        linkedList.print();
        linkedList.sizeOfList();  
        linkedList.delete(1);
        linkedList.print();
        linkedList.sizeOfList(); 
        linkedList.delete(90);
        linkedList.print();
        linkedList.sizeOfList(); 
        System.out.println("-----------------------------------------");
        System.out.println("printing linked list ");
        linkedList.print();
        
        System.out.println("--------------------reversing a linked list ----------");
        linkedList.reverse();
        linkedList.print();
        System.out.println("____________________________");
        linkedList.print();      
        System.out.println("---------removing nth node from last _____________________");
        linkedList.deleteNthNodeFromLast(6);

        




		
	}

}

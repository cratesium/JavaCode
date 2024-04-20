package linkedpackage;

import linkedpackage.LinkedlistAdv.Node;

public class Mergesort {
	
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
		public void print(Node head) {
			Node tempNode= head;
			while(tempNode!=null) {
			  System.out.print(tempNode.data+" -> ");
			  tempNode=tempNode.next;
			}
			
		}
		private Node getListMiddle(Node head) {
			if(head==null)
				return null;
			if(head.next==null)
				return head;
			Node slowNode= head;
			Node fastNode=head.next;
			
			while(fastNode!=null && fastNode.next!=null)
			{
				slowNode=slowNode.next;
				fastNode=fastNode.next.next;
			}
			return slowNode;
			
		}
		private Node merge(Node head1, Node head2) {
			 Node newnoNode= new Node(-1000000);
			    Node tempNode=newnoNode;
			    while(head1!=null && head2!=null) {
			    	if (head1.data>=head2.data) {
			    		System.out.println("in 1");
			    		tempNode.next=head2;
			    		head2=head2.next;

			    		tempNode=tempNode.next;

			    		tempNode.next=null;
			    		
						
					}
			    	else {
			    		System.out.println("in2");
			    		tempNode.next=head1;
			    		head1=head1.next;
			    		tempNode=tempNode.next;
			    		tempNode.next=null;
			    	}
			    }
			    if(head1!=null) {
			    	System.out.println("in3");
			    	tempNode.next=head1;
			    	
			    }
			    if (head2!=null) {
			    	System.out.println("in4");
			    	tempNode.next=head2;
					
				}
			    return newnoNode.next;
				}
		
		public Node sortList(Node head) {
			  if (head == null || head.next == null)
			        return head;

			    // find middle
			    Node sayMiddNode = getListMiddle(head);
			    Node leftHeadNode = head;
			    Node rightHeadNode = sayMiddNode.next;
			    sayMiddNode.next = null;

			    // apply mergesort recursively
			    Node leftMergeSort = sortList(leftHeadNode);
			    Node rightMergeSort = sortList(rightHeadNode);

			    // merge
			    Node finalNode = merge(leftMergeSort, rightMergeSort);
			    return finalNode;
			
		}
//	
		public void printUsingNode(Node head) {
			Node tempNode= head;
			while(tempNode!=null)
			{
				System.out.print(tempNode.data +"->");
				tempNode=tempNode.next;
			}
			System.out.println("end of List ");
			
		}
		
	public void zigZag() {
	Node head2;
	Node tempNode=head;
	Node mylinkedlist2=new Node();
	head2=mylinkedlist2;
	while(tempNode!=null) {
		mylinkedlist2.next=new Node(tempNode.data);
		mylinkedlist2=mylinkedlist2.next;
		tempNode=tempNode.next;
		
		
	
	}
	
    head2=head2.next;
	System.out.println("ll1 is ");
	print(head);
	System.out.println();
	System.out.println("ll2 is ");
	print(head2);
	
	
	System.out.println("now reversing the list 2 ");
	
	Node fastNode=head2;
	Node sloNode=head2;
	System.out.println("printing slownode ");
	
	
	while(fastNode!=null && fastNode.next!=null) {
		sloNode=sloNode.next;
		fastNode=fastNode.next.next;
	}
	
	Node prevNode=null;
	Node currNode=head2;
	Node nextNode;
	
	while(currNode!=null)
	{
		nextNode=currNode.next;
		currNode.next=prevNode;
		prevNode=currNode;
		currNode=nextNode;
		
	}
	head2=prevNode;
	
	tempNode=head2;
	
	
	
	print(head2);
	
	  int size1=0;
	  tempNode = head2;
	  while(tempNode!=null) {
		  size1++;
		  tempNode=tempNode.next;
	  }
	  System.out.println("size of lls is "+size1);
	  Node jteNode=head;
	  int size=(size1%2==0 )? size1:size1+1;
	  for( int i=0;i<size;i++)
	  {
		  head.next=head2;
		  head2=head2.next;
		  
		  
		  
	  }
	  
	  
	
		}
	
  
		
		public static void main(String[] args) {
			Mergesort linkedMergesort= new Mergesort();
			linkedMergesort.add(4);
			linkedMergesort.add(2);
			linkedMergesort.add(1);
			linkedMergesort.add(23);
			linkedMergesort.add(29);
		    linkedMergesort.add(54);
//			linkedMergesort.print(head);
			System.out.println();
			//	linkedMergesort.add(3);
		//System.out.println("sorting---> ");
		//	linkedMergesort.printUsingNode(linkedMergesort.sortList(head));
			linkedMergesort.zigZag();
			
		}
		}



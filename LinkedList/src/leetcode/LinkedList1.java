package leetcode;

public class LinkedList1 {
	public static Node head=null;
	public void add( int data )
	{ Node newNode = new Node(data);
	if( head==null) {
		head=newNode;
		return ;
		
	}
	
	Node tempNode=head;
	while(tempNode.next!=null)
	{
		tempNode=tempNode.next;
		
	}
	tempNode.next=newNode;

		
	}
	
	public void print(Node Myhead) {
		Node tempNode=Myhead;
		System.out.print("printing the list : ");
		while(tempNode!=null) {
			System.out.print(tempNode.data+" ");
			tempNode=tempNode.next;
		}System.out.println();
		
	}
	
	
	
	  public Node deleteDuplicates(Node head) {
	        if(head==null) return null;
	        if(head.next==null) return head;
	        if((head.data==head.next.data) && head.next.next==null) return null;

	        Node dummyNode = new Node(-1),temp=head,prev=null;
	        while(temp!=null && temp.next!=null)
	        {
	            if(temp.data!=temp.next.data){
	                prev=temp;
	                temp=temp.next;
	            }
	            else{
	                Node ptr=temp.next;
	                while(   ptr!=null && ptr.data==temp.data ) {
	                 ptr=ptr.next;
	                }
	                if(prev!=null){
	                prev.next=ptr;
	                temp=ptr;
	                }
	              



	            }
	        }
	       return dummyNode.next; 
	        
	    }
	
	
	
	
	
	
	public static void main(String[] args) {
		LinkedList1 objLinkedList1= new LinkedList1();
		objLinkedList1.add(1);
		objLinkedList1.add(2);
		objLinkedList1.add(3);
		objLinkedList1.add(3);
		objLinkedList1.add(4);
		objLinkedList1.add(4);
		objLinkedList1.add(5);
		objLinkedList1.print(LinkedList1.head);
		System.out.println("performing operation ");
		System.out.println(	objLinkedList1.deleteDuplicates(LinkedList1.head));
	}
	

}

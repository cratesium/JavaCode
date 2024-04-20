package linkedpackage;

//6 7 13 14 20 21 11 17
public class LinkedMergedSort {
	
	public static class Node {
		int val;
		Node next;
		public Node (int data) {
			this.val=data;
			this.next=null;
			
		}
	}
	public static Node head;
	public void add(int data ) {
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
			
		}
		Node tempNode=head;
		while(tempNode.next!=null)
			tempNode=tempNode.next;
		tempNode.next=newNode;
		
	}
	public void  print(Node head) {
		Node tempNode= head;
		while(tempNode!=null) {
			System.out.print(tempNode.val+" -> ");
			tempNode=tempNode.next;
		}
		
	}
	public Node getMiddle(Node head) {
		if(head==null || head.next==null)
			return head;
		Node fastNode=head.next;
		Node slowNode=head;
		while(fastNode!=null && fastNode.next!=null)
		{System.out.println("in5");
			fastNode=fastNode.next.next;
			slowNode=slowNode.next;
		}
		return slowNode;
		
	}
	public Node mergeNow(Node head1, Node head2) {
    Node newnoNode= new Node(-1000000);
    Node tempNode=newnoNode;
    while(head1!=null && head2!=null) {
    	if (head1.val>=head2.val) {
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
	public Node mergesort(Node head) {
        //base case for the iteration to stop
		if(head==null)return head;
		if(head.next==null) return head;
		// get middle 
		Node middleNode = getMiddle(head);
		Node leftheadNode=head;
		Node rightheadNode=middleNode.next;
		middleNode.next=null;
		//recursively call mergesort 
		Node leftRecursiveNode=mergesort(leftheadNode);
		Node righRecursiveNode=mergesort(rightheadNode);
		//merge
		Node finalNodetoBeReturnNode=mergeNow(leftRecursiveNode, righRecursiveNode);
		return finalNodetoBeReturnNode;
			}
	
	
	
    
    
    
	public static void main(String[] args) {
		LinkedMergedSort linkedMergedSort= new LinkedMergedSort();
		linkedMergedSort.add(7);
		linkedMergedSort.add(7);
		linkedMergedSort.add(7);
		linkedMergedSort.add(7);
		linkedMergedSort.print(head);
		
	}

}

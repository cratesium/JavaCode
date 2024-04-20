package leetcodeTest;


public class LinkedListClass {
	
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
			
		}
		
	
	}
	public static Node head;
	public static Node head1;
	public void add(int data,Node headNode) {
		//headNode=headNode.next;
		Node newnodeNode=new Node(data);
		if(headNode==null) {
			headNode=newnodeNode;
			return;
		}
		Node temNode=headNode;
		while(temNode.next!=null)
		{
			temNode=temNode.next;
			
		}
		temNode.next=newnodeNode;
		
			
		
	}
	private void print(Node headNode) {
		Node tempNode=headNode;
		while(tempNode!=null)
		{
			System.out.print(tempNode.data+" ");
		tempNode=tempNode.next;	
		}
		
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		LinkedListClass objClass= new LinkedListClass();
		head=new Node(0);
		head1=new Node(0);
		objClass.add(0,head);
		objClass.add(10,head);
		objClass.add(110,head);
		objClass.add(2,head);
		objClass.add(20,head);
		objClass.print(head);
		System.out.println();
		objClass.add(12, head1);
		objClass.add(12, head1);
		objClass.add(12, head1);
		objClass.add(12, head1);
		objClass.print(head1);
		
	}

}

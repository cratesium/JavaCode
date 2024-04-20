package linkedpackage;


public class zigzag {
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
   public static Node head1;
	public void add( int data , Node headnodeNode) {
		Node newNode= new Node(data);
		if(headnodeNode==null)
		{
			headnodeNode=newNode;
			return;
		}
	   Node tempNode=headnodeNode;
	   while(tempNode.next!=null)
	   {
		   tempNode=tempNode.next;
	   }
	   tempNode.next=newNode;
	   
		
	}
	public void print(Node headnNode) {
    System.out.println("printing the linkedList ");
    Node tempNode=headnNode;
    if (head==null) {
   	 System.out.println("list is empty ");
		return;
	}
    while(tempNode!=null)
    {
   	 System.out.print(tempNode.data+" ");
   	 tempNode=tempNode.next;
   	 
    }
    

	}
	private Node getListMiddle(Node headnoNode) {
		if(headnoNode==null)
			return null;
		if(headnoNode.next==null)
			return headnoNode;
		Node slowNode= headnoNode;
		Node fastNode=headnoNode;
		
		while(fastNode!=null && fastNode.next!=null)
		{
			slowNode=slowNode.next;
			fastNode=fastNode.next.next;
		}
		return slowNode;
		
	}
	public static void main(String[] args) {
		zigzag objZigzag= new zigzag();
		objZigzag.add(1,zigzag.head);
		objZigzag.add(2,zigzag.head);
		objZigzag.add(3,zigzag.head);
		objZigzag.add(4,zigzag.head);
		objZigzag.add(5,zigzag.head);
		objZigzag.print(head);
		
		objZigzag.add(50, head1);
		objZigzag.add(51, head1);
		objZigzag.add(52, head1);
		objZigzag.add(53, head1);
		objZigzag.add(54, head1);
		objZigzag.add(55, head1);
		
		objZigzag.print(zigzag.head);
		System.out.println();
		objZigzag.print(head1);
		
		
		
		
		
	}

}



package linkedpackage;

public class Concept {
    public static class Node {
        int data;
        Node next;

        public Node() {
            this.data = 0;
            this.next = null;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node head1;

    public void add(int data, Node headNode) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
            return;
        }
        Node tempNode = headNode;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    public void print(Node headNode) {
        System.out.println("printing the linkedList ");
        Node tempNode = headNode;
        if (headNode == null) {
            System.out.println("list is empty ");
            return;
        }
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }

    private Node getListMiddle(Node headNode) {
        if (headNode == null)
            return null;
        if (headNode.next == null)
            return headNode;
        Node slowNode = headNode;
        Node fastNode = headNode;

        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }

    public static void main(String[] args) {
        Concept objZigzag = new Concept();
        head = new Node();
        head1 = new Node();

        objZigzag.add(1, Concept.head);
        objZigzag.add(2, Concept.head);
        objZigzag.add(3, Concept.head);
        objZigzag.add(4, Concept.head);
        objZigzag.add(5, Concept.head);
        objZigzag.print(Concept.head);

        objZigzag.add(50, Concept.head1);
        objZigzag.add(51, Concept.head1);
        objZigzag.add(52, Concept.head1);
        objZigzag.add(53, Concept.head1);
        objZigzag.add(54, Concept.head1);
        objZigzag.add(55, Concept.head1);

        System.out.println();
        objZigzag.print(Concept.head1);
    }
}

package binarytree;

public class BinaryTreeImplemented {
	
	private static Node rootNode;
	public BinaryTreeImplemented() {
		this.rootNode=null;
	}
    public void insert(int data) {
    	Node newNode = new Node(data);
    	if(rootNode==null) {
    		rootNode=newNode;
    		return;
    	}
    	Node currentNode=rootNode;
    	while(true) {
    		
    	 	    if(data< rootNode.data) {
        		if (currentNode.leftNode==null) {
        			currentNode.leftNode=newNode;
        			break;
    				
    			}
        		else {
        			
        			currentNode=currentNode.leftNode;
        		}
        		
        		
        		
        		
        	}else 
        	
        	{
        		if(currentNode.rightNode==null) {
        			currentNode.rightNode=newNode;
        			break;
        		}else {
        			currentNode=currentNode.rightNode;
        		}
        		
        		
        		
        		
        	}
    		
    	}
    	
   
   
    	
    }
 	public void preOrder(Node headNode ) {
	
		if(headNode==null)
			return;
		System.out.print(headNode.data+" ");
		preOrder(headNode.leftNode);
		preOrder(headNode.rightNode);
		}
 	public void inOrder(Node headNode) {
 		if(headNode==null)return ;
 		inOrder(headNode.leftNode);
 		System.out.print(headNode.data+" ");
 		inOrder(headNode.rightNode);
 	}
 	public void postOrder(Node headNode) {
 		if(headNode==null)
 			return ;
 		postOrder(headNode.leftNode);
 		postOrder(headNode.rightNode);
 		System.out.print(headNode.data+" ");
		
	}
 	public static void main(String[] args) {
		BinaryTreeImplemented btObject = new BinaryTreeImplemented();
		btObject.insert(100);
		btObject.insert(50);
		btObject.insert(120);
		btObject.insert(110);
		btObject.insert(25);
		btObject.insert(49);
		btObject.insert(99);
		btObject.insert(43);
		btObject.insert(0);
		System.out.println("performing preorder traversal ");
		btObject.preOrder(rootNode);
		System.out.println();
		System.out.println("performing inorder traversal ");
		btObject.inOrder(rootNode);
		System.out.println();
		System.out.println("performing postorder traversal ");
		btObject.postOrder(rootNode);
		System.out.println();

	}

}

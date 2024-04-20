package binarytree;

public class BinaryTree {
	private  static class Node {
		 int data ;
		 Node left;
		 Node right;
		 
		 public Node(int data ) {
			 this.data = data;
			 this.left=null;
			 this.right=null;
		 }
		 
	 }
	 
	 public static  Node rootNode;
	 public BinaryTree() {
		 this.rootNode=null;
	 }
	 
	 public void insert(int data ) {
		 
		 Node newNode = new Node(data);
		 if(rootNode==null)
		 {
			 rootNode=newNode;
			 return ;
		 }
		 
		 Node currNode= this.rootNode;
		  while(true) {
			 System.out.println("hii this is loop");
			 if(data <currNode.data ) {
				  if(currNode.left==null) {
					  currNode.left=newNode;
					  break;
				  }else {
					  currNode=currNode.left;
				  }
			 }else {
				if(currNode.right==null) {
					currNode.right=newNode;
					break;
				}else {
					currNode=currNode.right;
				}
			}
		 }
	 }
	 public void preOrder(Node root) {
		 if(root==null)
			 return ;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right); 	 
	 }
	 
	 public static void main(String[] args) {
		BinaryTree tree= new BinaryTree();
		tree.insert(50);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		tree.insert(45);
		tree.preOrder(BinaryTree.rootNode);
	}
	 
	 

}

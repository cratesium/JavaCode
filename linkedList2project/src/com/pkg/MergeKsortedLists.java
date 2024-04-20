package com.pkg;

import java.util.PriorityQueue;

public class MergeKsortedLists {
	
	public static class Pair implements Comparable<Pair>{
		int val ;
		Node node;
		public Pair(Node  node ) {
			this .val= node.data;
			this.node=node;
		}
		
		@Override
		public int compareTo(Pair o) {
			return Integer.compare(this.val, o.val);
		}
	}

	public static Node head[]=new Node[3];
	public void add(Node headNode , int data ) {
		Node newNode = new Node(data);
		 if(headNode == null)
		    {
		        headNode = newNode;
		        return ;
		    }
		Node tempNode= headNode;
		while(tempNode.next!=null)
		{
			tempNode=tempNode.next;
		}
		tempNode.next=newNode;
		
	}
	public void print( Node headnNode) {
		Node tempNode=headnNode;
		if(tempNode==null) {
			System.out.println("list is empty ");
			return ;
		}
		while(tempNode!=null)
		{
			System.out.print(tempNode.data +" ");
			tempNode=tempNode.next;
		}
		System.out.println();
	}
	public Node mergeLists(Node head[]) {
		if(head.length==1) return head[0];
		head[0]=head[0].next;
		head[1]=head[1].next;
		head[2]=head[2].next;
		PriorityQueue<Pair>pq= new PriorityQueue<>();
		for( int i=0 ;i< head.length;i++) {
			pq.add(new Pair(head[i]));
		}
		Node dummNode= new Node(-1);
		Node tempNode=dummNode;
		while(!pq.isEmpty()) {
			Pair pair= pq.poll();
			tempNode.next=pair.node;
			tempNode=tempNode.next;
			if(pair.node.next!=null) {
				pq.add(new Pair(pair.node.next));
			}
			
			
			
			
		}
	
		
		return dummNode.next;
	}
	
	public static void main(String[] args) {
		System.out.println("hii");
		 MergeKsortedLists objKsortedLists= new MergeKsortedLists();
		    head[0] = new Node(0);
		    
		    head[1] = new Node(0);
		    head[2] = new Node(0);
		 objKsortedLists.add(head[0], 0);
		 objKsortedLists.add(head[0], 10);
		 objKsortedLists.add(head[0], 320);
		 objKsortedLists.add(head[1], 20);
		 objKsortedLists.add(head[1], 200);
		 objKsortedLists.add(head[1], 2000);
		 objKsortedLists.add(head[2], 120);
		 objKsortedLists.add(head[2], 130);
		 objKsortedLists.add(head[2], 140);
		 objKsortedLists.add(head[2], 150);
		 
		 objKsortedLists.print(head[0].next);
		 objKsortedLists.print(head[1].next);
		 objKsortedLists.print(head[2].next);
		 objKsortedLists.print(objKsortedLists.mergeLists(head));
		 
	}
	
	

}

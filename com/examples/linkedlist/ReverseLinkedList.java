package com.examples.linkedlist;

public class ReverseLinkedList {
	Node node1 = new Node(); 
	Node node2 = new Node();
	Node node3 = new Node();
	Node node4 = new Node();
	Node node5 = new Node();
	Node node6 = new Node();
	
	
	public ReverseLinkedList() {
		
		node1.setData(1);
		node1.setNext(node2);
		
		node2.setData(2);
		node2.setNext(node3);
		
		node3.setData(3);
		node3.setNext(node4);
		
		node4.setData(4);
		node4.setNext(node5);
		
		node5.setData(5);
		node5.setNext(node6);
		
		node6.setData(6);
		
	}
	
	Node head = node1;
	Node headTemp = node1;
    Node tail = node1;
	Node prevTail = null;
	Node origTail = null;
	
	public static void main(String[] args) {
		ReverseLinkedList obj = new ReverseLinkedList();
		
	    
		System.out.println("Before Reverse ");
		
		while(obj.headTemp.getNext()!=null) {
			System.out.print(obj.headTemp.getData()+" --> ");
			obj.headTemp = obj.headTemp.getNext();
		}
		System.out.print(obj.headTemp.getData()+" \n");
		
		obj.findTail();
		
		obj.head = obj.origTail; 
		
		System.out.println("After Reverse ");
		
		while(obj.head.getNext()!=null) {
			System.out.print(obj.head.getData()+" --> ");
			obj.head = obj.head.getNext();
		}
		System.out.print(obj.head.getData());
		
	}
	private void findTail() {
		while( tail.getNext()!= null) {
			prevTail = tail;
			tail = tail.getNext();						
		}
		origTail = tail;
		moveTail();
	}
	private void moveTail() {
		Node traverse = head;
		
		if(traverse == tail) {
			tail.setNext(null);
			return;
		}	
		
		while(traverse != tail) {
			prevTail = traverse;
			traverse = traverse.getNext();
		}
		tail.setNext(prevTail);
		tail = prevTail;
		moveTail();
	}

}

package com.examples.linkedlist;

public class ReverseAGroup extends GenericList{
	Node head = node1;
	Node traverse = head;
	Node tail = node3;
	Node origTail;
	
	public static void main(String[] args) {
		ReverseAGroup obj = new ReverseAGroup();
		obj.reverseAGroup();
		
		obj.traverse = obj.head;
		while(obj.traverse.getNext() != null) {
			System.out.print(obj.traverse.getData()+"==>");
			obj.traverse = obj.traverse.getNext();			
		}
		System.out.print(obj.traverse.getData());
		
	}
	private void reverseAGroup() {
		traverse = head;
		Node prevTail = null;
		Node temp = null;
		
		if(traverse == tail) {
			head = origTail;
			return;
		}
		
		while(traverse != tail) {
			prevTail = traverse;
			traverse = traverse.getNext();			
		}
		if(origTail == null) {
			origTail = traverse;
		}
		temp = tail.getNext();
		tail.setNext(prevTail);
		prevTail.setNext(temp);
		tail = prevTail;
		reverseAGroup();
	}

}

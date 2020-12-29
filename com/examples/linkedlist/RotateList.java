package com.examples.linkedlist;

public class RotateList extends GenericList{
	Node head =this.node1;
	Node tail = head;
	Node preTail;
	int numberOfRotates = 2;
	Node origHead = head;
	
	
	
	public static void main(String[] args) {
		RotateList obj = new RotateList();
		
		for(int i=1;i<=obj.numberOfRotates;i++) {
			obj.rotate();
		}
		
		Node traverse = obj.head;
		while(traverse.getNext() != null) {
			System.out.print(traverse.getData()+"==>");
			traverse = traverse.getNext();
		}
		System.out.print(traverse.getData()+"\n");
	}
	private void rotate() {
		while(tail.getNext() != null) {
			preTail = tail;
			tail = tail.getNext();
		}
		tail.setNext(head);
		preTail.setNext(null);
		head = tail;
	}

}

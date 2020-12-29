package com.examples.linkedlist;

public abstract class GenericList {
	Node node1 = new Node(); 
	Node node2 = new Node();
	Node node3 = new Node();
	Node node4 = new Node();
	Node node5 = new Node();
	Node node6 = new Node();

	public GenericList() {
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
}

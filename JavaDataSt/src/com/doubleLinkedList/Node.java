package com.doubleLinkedList;

public class Node <T>{
	
	private T data;
	private Node<T> next_node;
	private Node<T> previous_node;
	
	public Node(T data) {
		this.data=data;
		this.next_node=null;
		this.previous_node=null;
	}	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext_node() {
		return next_node;
	}
	public void setNext_node(Node<T> next_node) {
		this.next_node = next_node;
	}
	public Node<T> getPrevious_node() {
		return previous_node;
	}
	public void setPrevious_node(Node<T> previous_node) {
		this.previous_node = previous_node;
	}
	
	@Override
	public String toString() {
		return "Node ["+ data + "]";
	}
	

}

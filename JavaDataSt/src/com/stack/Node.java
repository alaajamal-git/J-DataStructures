package com.stack;

public class Node <T>{
	
	private T data;
	private Node<T> next_node;
	
	
	
	
	public Node(T data) {
		this.data = data;
		this.next_node = null;
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


	@Override
	public String toString() {
		return data+"";
	}
	

}

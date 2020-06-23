package com.queue;

public class WarpperList <T>{
	
	private int size=0;
	private Node<T> h_node=null;
	
	public WarpperList() {
	}
	
	public void enqueue(T t) {
		if(h_node==null)
		h_node=new Node<T>(t);
		else {
			Node<T> temp=h_node;
			while(temp.getNext_node()!=null)temp=temp.getNext_node();
			temp.setNext_node(new Node<T>(t));
		}
			 		
		size++;
		
	}
	
	
	public Node dequeue() {
		Node<T> n= h_node;
		h_node= h_node.getNext_node();
		n.setNext_node(null);
		size--;
		return n;
	}
	public T get(int index) {
		Node<T> n= h_node;
		for(int i=0;i<index;i++) {
			n=n.getNext_node();
		}
		return n.getData();
	}
	public T remove(int index) {
		Node<T> n= h_node;
		for(int i=0;i<index-1;i++) {
			n=n.getNext_node();
		}
		@SuppressWarnings("unchecked")
		T data =(T)n.getNext_node().getData();
		Node<T> temp=n.getNext_node().getNext_node();
		n.setNext_node(temp);
		
		return data;
			}

	public int getSize() {
		return size;
	}
	

	public String toString() {
		Node<T> temp=h_node;
		String result="";
		while(temp.getNext_node()!=null) {
			result+=temp.getData()+", ";
			temp=temp.getNext_node()	;		
		}
		result+=temp.getData();
		return result;
	}
	

}

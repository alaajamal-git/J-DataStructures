package com.stack;

public class WarpperList <T>{
	
	private int size=0;
	private Node<T> h_node=null;
	
	public WarpperList() {


	}
	
	public void push(T t) {
		if(h_node==null)
		h_node=new Node<T>(t);
		else {
			Node<T> temp=h_node;
			while(temp.getNext_node()!=null)temp=temp.getNext_node();
			temp.setNext_node(new Node<T>(t));
		}
			 		
		size++;
		
	}

	
	
	public Node<T> pop() {
		Node<T> temp=h_node;
		int i=0;
		Node <T>result;
		while(i<size-2) {
			temp=temp.getNext_node();
			i++;
		}
		if(temp.getNext_node()!=null) {
		T t =(T)temp.getNext_node().getData();
		
		result = new Node<>(t);
		temp.setNext_node(null);
		}
		else
			{result = new Node<>(temp.getData());
			temp=null;}
		size--;
		return result;
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
	

	public boolean isEmpty() {
		
		return size<1;
	}
	
	public void forEach(Aplicable<T> aplicable) {
		Node<T> temp=h_node;
		while(temp.getNext_node()!=null) {
			aplicable.doAction(temp);
			temp=temp.getNext_node();
		}
		aplicable.doAction(temp);

	}
}

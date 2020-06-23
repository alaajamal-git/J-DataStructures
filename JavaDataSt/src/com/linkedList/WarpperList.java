package com.linkedList;

public class WarpperList <T>{
	
	private int size=0;
	private Node<T> h_node=null;
	
	public WarpperList() {


	}
	
	public void add(T t) {
		if(h_node==null)
		h_node=new Node<T>(t);
		else {
			Node temp=h_node;
			while(temp.getNext_node()!=null)temp=temp.getNext_node();
			temp.setNext_node(new Node<T>(t));
		}
			 		
		size++;
		
	}
	
	public Node get(int i) {
		if(i>size) return null;
		Node n= h_node;
		while(i!=0) {
			n=n.getNext_node();
			i--;
		}
			
		return n;
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
	
	public void forEach(Aplicable<T> aplicable) {
		Node<T> temp=h_node;
		while(temp.getNext_node()!=null) {
			aplicable.doAction(temp);
			temp=temp.getNext_node();
		}
		aplicable.doAction(temp);

	}

}

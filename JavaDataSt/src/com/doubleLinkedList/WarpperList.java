package com.doubleLinkedList;

public class WarpperList<T> {
	
	private int size;
	private Node<T> head_node;
	
	
	public void addlast(T t) {
		if(head_node==null)
			head_node=new Node<T>(t);
		
		else {
			Node <T> new_member=new Node<T>(t);
			Node<T> temp=head_node;
			while(temp.getNext_node()!=null)temp=temp.getNext_node();
			temp.setNext_node(new_member);
			new_member.setPrevious_node(temp);
				
			size++;
			
			
		}
		
		
	}
	

	public void addFirst(T t) {
		Node<T> head=new Node(t);
		head_node.setPrevious_node(head);
		head.setNext_node(head_node);
		head_node=head;
	}
	
	
	public boolean addAfter(int index, T t) {
		Node<T> member=new Node<>(t);
		Node<T> temp=head_node;
		if(index>size) return false;
		else
			while(index!=0) {
				temp=temp.getNext_node();
				index--;
			}
		member.setNext_node(temp.getNext_node());
		temp.setNext_node(member);
		member.setPrevious_node(temp);
		size++;
		return true;
		
	}
	public int getSize() {
		return size;
	}
	
	public String toString() {
		Node<T> temp=head_node;
		String result="";
		while(temp.getNext_node()!=null) {
			result+=temp.getData()+", ";
			temp=temp.getNext_node()	;		
		}
		result+=temp.getData();
		return result;
	}
	

}

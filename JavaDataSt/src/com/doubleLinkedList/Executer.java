package com.doubleLinkedList;


public class Executer {

	public static void main(String[] args) {

		WarpperList<Integer> list=new WarpperList<>();
		
		list.addlast(new Integer(5));
		list.addlast(new Integer(6));
		list.addlast(new Integer(1));
		list.addlast(new Integer(23));
		list.addAfter(2, new Integer(7));
		list.addFirst(new Integer(0));
		System.out.println(list.getSize());
		System.out.println(list);

	}
}

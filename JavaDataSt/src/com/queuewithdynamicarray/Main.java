package com.queuewithdynamicarray;

public class Main {

	public static void main(String[] args) {

		WarpperList<Integer> list=new WarpperList<>();
		
		list.enqueue(new Integer(5));
		list.enqueue(new Integer(6));
		list.enqueue(new Integer(1));
		list.enqueue(new Integer(23));
		list.enqueue(new Integer(33));
		list.enqueue(new Integer(13));
		list.enqueue(new Integer(132));
		list.enqueue(new Integer(21));
		
		System.out.println(list);
		System.out.println(list.getSize());
		System.out.println(list.getNElements());

		System.out.println(list.dequeue());
		System.out.println(list.getSize());
		System.out.println(list.getNElements());

		System.out.println(list);

	}
}

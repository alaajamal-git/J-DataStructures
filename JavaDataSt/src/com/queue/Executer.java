package com.queue;

public class Executer {

	public static void main(String[] args) {

		WarpperList<Integer> list=new WarpperList<>();
		
		list.enqueue(new Integer(5));
		list.enqueue(new Integer(6));
		list.enqueue(new Integer(1));
		list.enqueue(new Integer(23));
		list.remove(2);
		System.out.println(list);
		System.out.println(list.getSize());
		System.out.println(list.dequeue());
		System.out.println(list.getSize());
		System.out.println(list);

	}
}

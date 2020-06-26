package com.linkedList;

import com.linkedList.WarpperList;

public class Executer {

	public static void main(String[] args) {

		WarpperList<Integer> list=new WarpperList<>();
		
		list.add(new Integer(5));
		list.add(new Integer(6));
		list.add(new Integer(55));
		list.add(new Integer(1));

		System.out.println(list.getSize());
		System.out.println(list.get(2));
		list.remove(new Integer(5));
		System.out.println(list.get(2));
		System.out.println(list.getSize());


	}
}

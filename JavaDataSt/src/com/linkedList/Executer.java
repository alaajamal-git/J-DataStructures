package com.linkedList;

import com.linkedList.WarpperList;

public class Executer {

	public static void main(String[] args) {

		WarpperList<Integer> list=new WarpperList<>();
		
		list.add(new Integer(5));
		

		System.out.println(list.getSize());
		System.out.println(list.get(1));

	}
}

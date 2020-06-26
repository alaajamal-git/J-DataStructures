package com.stack;

public class Main {

	public static void main(String[] args) {

		WarpperList<Integer> list=new WarpperList<>();
		
		list.push(new Integer(5));
		list.push(new Integer(6));
		list.push(new Integer(1));
		list.push(new Integer(23));

		System.out.println(list);
		System.out.println(list.getSize());
		System.out.println(list.pop());
		System.out.println(list);
		list.forEach(x->{
			System.out.print(x+", ");
		});
		
	}
}

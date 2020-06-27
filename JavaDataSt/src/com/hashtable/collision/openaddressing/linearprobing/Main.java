package com.hashtable.collision.openaddressing.linearprobing;


public class Main {

	public static void main(String[] args) {


		MyHashTable<Integer, String> table=new MyHashTable<>(6,new ModHash());
		
		table.put(1700, "alaa");
		table.put(1211, "walaa");
		table.put(545, "alaa");
		table.put(879, "walaa");
		table.put(845, "rami");
		table.put(845, "jame");
		System.out.println(table.put(474, "walaa"));
		System.out.println(table.getSize());
		System.out.println(table.put(454, "walaa"));// full
		System.out.println(table.get(474));
		System.out.println(table.remove(474));
		System.out.println(table.get(474));
		System.out.println(table.get(845));
		System.out.println(table);
		System.out.println(table.getSize());

	}

}

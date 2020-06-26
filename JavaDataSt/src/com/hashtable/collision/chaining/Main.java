package com.hashtable.collision.chaining;


public class Main {

	public static void main(String[] args) {


		MyHashTable<Integer, String> table=new MyHashTable<>(10,new ModHash());
		
		table.put(1700, "alaa");
		table.put(4544, "walaa");
		table.put(454, "alan");
		table.put(47, "jaim");
		table.put(1478, "alex");
		table.put(133, "zaid");
		System.out.println(table.get(133));
		System.out.println(table.getSize());
		System.out.println(table.remove(133));
		System.out.println(table.get(133));
		System.out.println(table.getSize());

	}

}

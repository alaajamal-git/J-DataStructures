package com.hashtable.collision.linearopenaddressing;


public class Executer {

	public static void main(String[] args) {


		MyHashTable<Integer, String> table=new MyHashTable<>(10,new ModHash());
		
		table.put(1700, "alaa");
		table.put(1600, "walaa");
		System.out.print(table.get(1800));
	}

}

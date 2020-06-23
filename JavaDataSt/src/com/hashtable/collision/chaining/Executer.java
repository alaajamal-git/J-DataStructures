package com.hashtable.collision.chaining;


public class Executer {

	public static void main(String[] args) {


		MyHashTable<Integer, String> table=new MyHashTable<>(10,new ModHash());
		
		table.put(1700, "alaa");
		table.put(1600, "walaa");
		table.checkCollisionFactor();
		System.out.print(table.get(1600));
	}

}

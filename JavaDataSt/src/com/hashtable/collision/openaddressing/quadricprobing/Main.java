package com.hashtable.collision.openaddressing.quadricprobing;


public class Main {

	public static void main(String[] args) {


		MyHashTable<Integer, String> table=new MyHashTable<>(27,new ModHash());
		
		table.put(1700, "alaa");// %27 =26
		table.put(1214, "walaa");// %27 =26
		table.put(26, "sad");// %27 =26
		table.put(134, "dffd");// %27 =26
		table.put(161, "arg");// %27 =26
		table.put(188, "gtht");// %27 =26
		table.put(215, "fhh");// %27 =26
		table.put(242, "ffff");// %27 =26
		table.put(269, "rrrr");// %27 =26
		table.put(296, "qqqq");// %27 =26
		table.put(1214, "ssss");// %27 =26

		System.out.println(table);
		System.out.println(table.get(1214));

		
		

	}

}
